package com.bmbs.wechat.connection;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.security.SecureRandom;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bmbs.wechat.constants.WeChatConstants;


public class HttpRequest {
	
	private static Logger log = LoggerFactory.getLogger(HttpRequest.class);

	public static JSONObject httpRequest(String requestUrl, String requestMethod, String requestBody){
		JSONObject rtnObject = null;
		StringBuffer buffer = new StringBuffer();
		
		try {
			TrustManager[] tm = {new MyX509TrustManager()};
			SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
			sslContext.init(null, tm, new SecureRandom());
			SSLSocketFactory ssf = sslContext.getSocketFactory();
			
			URL url = new URL(requestUrl);
			HttpsURLConnection httpUrlConn = (HttpsURLConnection)url.openConnection();
			httpUrlConn.setSSLSocketFactory(ssf);
			
			httpUrlConn.setDoOutput(true);
			httpUrlConn.setDoInput(true);
			httpUrlConn.setUseCaches(false);
			
			httpUrlConn.setRequestMethod(requestMethod);
			
			if(WeChatConstants.GET.equalsIgnoreCase(requestMethod)){
				httpUrlConn.connect();
			}
			
			if(null != requestBody){
				OutputStream outputStream = httpUrlConn.getOutputStream();
				outputStream.write(requestBody.getBytes(WeChatConstants.UTF8));
				outputStream.close();
			}
			
			InputStream inputStream = httpUrlConn.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, WeChatConstants.UTF8);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			String responseValue = null;
			while((responseValue = bufferedReader.readLine())!=null){
				buffer.append(responseValue);
			}
			
			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();
			inputStream = null;
			httpUrlConn.disconnect();
			
			rtnObject = JSONObject.fromObject(buffer.toString());
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		
		return rtnObject;
	}
}
