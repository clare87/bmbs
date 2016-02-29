package com.bmbs.wechat.service;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmbs.wechat.message.response.TextMessage;
import com.bmbs.wechat.util.MessageUtil;

@Service
public class MessageService {
	private static Logger log = LoggerFactory.getLogger(MessageService.class);
	
	@Autowired
	private Properties displayKey;
	
	public String processRequest(HttpServletRequest request) {
		String respMessage = null;
		try {
			String respContent = "";

			Map<String, String> requestMap = MessageUtil.parseXml(request);

			String fromUserName = requestMap.get("FromUserName");
			String toUserName = requestMap.get("ToUserName");
			String msgType = requestMap.get("MsgType");

			TextMessage textMessage = new TextMessage();
			textMessage.setToUserName(fromUserName);
			textMessage.setFromUserName(toUserName);
			textMessage.setCreateTime(new Date().getTime());
			textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
			textMessage.setFuncFlg(0);
			
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
				
				respContent = displayKey.getProperty("message.text");
				
			} else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {
				
				respContent = displayKey.getProperty("message.image");
				
			} else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {
				
				respContent = displayKey.getProperty("message.location");
				
			} else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {
				
				respContent = displayKey.getProperty("message.link");
				
			} else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {
				
				respContent = displayKey.getProperty("message.voice");
				
			} else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {
				
				String eventType = requestMap.get("Event");
				if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
					respContent = displayKey.getProperty("message.subscribe");
				} else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
				} else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
					String eventKey = requestMap.get("EventKey");
					if("V1001_GOOD".equals(eventKey)){
						respContent = displayKey.getProperty("message.good");
					} else if ("V1001_TODAY_MUSIC".equals(eventKey)){
						respContent = displayKey.getProperty("message.music");
					}
				}
			}

			textMessage.setContent(respContent);
			respMessage = MessageUtil.textMessageToXml(textMessage);
		} catch (Exception e) {
			log.error(e.getMessage());
		}

		return respMessage;
	}
}
