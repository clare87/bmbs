package com.bmbs.wechat.constants;

public class WeChatConstants {
	
	public static final String MENU_FILE_NAME = "/WEB-INF/classes/menu/menu"; 
	
	public static final String GET = "GET";
	
	public static final String POST = "POST";
	
	public static final String UTF8 = "UTF-8";

	public static final String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	
	public static final String MENU_CREATE_URL = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
}
