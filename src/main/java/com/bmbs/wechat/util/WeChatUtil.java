package com.bmbs.wechat.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.json.JSONObject;

import com.bmbs.wechat.bean.AccessToken;
import com.bmbs.wechat.connection.HttpRequest;
import com.bmbs.wechat.constants.WeChatConstants;

public class WeChatUtil {
	private static Logger log = LoggerFactory.getLogger(WeChatUtil.class);

	public static AccessToken getAccessToken(String appid, String appsecret) {
		AccessToken accessToken = null;

		String requestUrl = WeChatConstants.ACCESS_TOKEN_URL.replace("APPID",
				appid).replace("APPSECRET", appsecret);
		
		JSONObject jsonObject = HttpRequest.httpRequest(requestUrl, WeChatConstants.GET, null);
		if(null != jsonObject){
			accessToken = new AccessToken();
			accessToken.setToken(jsonObject.getString("access_token"));
			accessToken.setExpiresIn(jsonObject.getInt("expires_in"));
		}

		return accessToken;
	}
	
	public static int createMenu(String menu, String accessToken){
		int rtnResult = 0;
		
		String url = WeChatConstants.MENU_CREATE_URL.replace("ACCESS_TOKEN", accessToken);
		JSONObject jsonObject = HttpRequest.httpRequest(url, WeChatConstants.POST, menu);
		
		if(null != jsonObject){
			if(0 != jsonObject.getInt("errcode")){
				rtnResult = jsonObject.getInt("errcode");
				log.info(jsonObject.getString("errmsg"));
			}
		}
		return rtnResult;
	}
	
}
