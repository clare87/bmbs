package com.bmbs.wechat.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bmbs.wechat.service.MessageService;
import com.bmbs.wechat.util.SignUtil;

@RestController
public class MessageController {
	
	private static Logger log = LoggerFactory.getLogger(MessageController.class); 
	
	@Autowired
	private MessageService messageService;

	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String sign(@RequestParam("signature") String signature,
			@RequestParam("timestamp") String timestamp,
			@RequestParam("nonce") String nonce,
			@RequestParam("echostr") String echostr) {

		String rtnValue = null;
		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
			rtnValue = echostr;
		}
		return rtnValue;
	}

	@RequestMapping(value = "/message", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	public String receiveMessage(HttpServletRequest request, HttpServletResponse response) {
		String responseMessage = "";
		responseMessage = messageService.processRequest(request);
		log.info(responseMessage);
		return responseMessage;
	}
}
