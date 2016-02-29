package com.bmbs.wechat.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bmbs.wechat.thread.TokenThread;

/**
 * Servlet implementation class InitAccessTokenServlet
 */
public class InitAccessTokenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(InitAccessTokenServlet.class);
       
    public InitAccessTokenServlet() {
        super();
    }
    
    public void init(){
    	TokenThread.appid = getInitParameter("appid");
    	TokenThread.appsecret = getInitParameter("appsecret");
    	if("".equals(TokenThread.appid) || "".equals(TokenThread.appsecret)){
    		log.info("appid and appsecret configuration error, please check carefully.");
    	}else{
    		new Thread(new TokenThread()).start();
    	}
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
