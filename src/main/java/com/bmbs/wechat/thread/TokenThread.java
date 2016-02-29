package com.bmbs.wechat.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bmbs.wechat.bean.AccessToken;
import com.bmbs.wechat.util.WeChatUtil;

public class TokenThread implements Runnable {
	private static Logger log = LoggerFactory.getLogger(TokenThread.class);
	
	public static AccessToken accessToken = null;
	public static String appid = "";
	public static String appsecret = "";

	public void run() {
		while (true) {
			try {
				accessToken = WeChatUtil.getAccessToken(appid, appsecret);
				log.info("accessToken: token "+accessToken.getToken() + " expiresIn "+ accessToken.getExpiresIn());
				if (null != accessToken) {
					Thread.sleep((accessToken.getExpiresIn() - 200) * 1000);
				} else {
					Thread.sleep(60 * 1000);
				}
			} catch (InterruptedException e) {
				log.error(e.getMessage());
				try {
					Thread.sleep(60 * 1000);
				} catch (InterruptedException e1) {
					log.error(e.getMessage());
				}
			}
		}
	}
}
