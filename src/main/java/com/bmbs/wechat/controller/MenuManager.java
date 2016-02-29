package com.bmbs.wechat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bmbs.wechat.bean.AccessToken;
import com.bmbs.wechat.constants.WeChatConstants;
import com.bmbs.wechat.thread.TokenThread;
import com.bmbs.wechat.util.FileUtil;
import com.bmbs.wechat.util.WeChatUtil;

@RestController
public class MenuManager {
	private static Logger log = LoggerFactory.getLogger(MenuManager.class); 

	@RequestMapping(value = "createMenu", method = RequestMethod.GET)
	public String createMenu(HttpServletRequest request,HttpServletResponse response) {
		AccessToken accessToken = TokenThread.accessToken;
		
//		String menu = "{\"button\":["
//				+ "{\"type\":\"click\",\"name\":\"今日歌曲\",\"key\":\"V1001_TODAY_MUSIC\"},"
//				+ "{\"name\":\"菜单\","
//				+ "\"sub_button\":["
//				+ "{\"type\":\"view\",\"name\":\"搜索\",\"url\":\"http://www.soso.com/\"},"
//				+ "{\"type\":\"view\",\"name\":\"视频\",\"url\":\"http://v.qq.com/\"},"
//				+ "{\"type\":\"click\",\"name\":\"赞一下我们\",\"key\":\"V1001_GOOD\"}"
//				+ "]}]}";
		String filePath = request.getSession().getServletContext().getRealPath("/");
		String menu = getMenu(filePath + WeChatConstants.MENU_FILE_NAME);
		if (null != accessToken) {
			int result = WeChatUtil.createMenu(menu, accessToken.getToken());

			if (0 == result) {
				log.info("menu create successfully");
			} else {
				log.info("menu create failed, error code: " + result);
			}
		}
		return "success";
	}
	
	private static String getMenu(String fileName){
		return FileUtil.readFile(fileName);
	}

}
