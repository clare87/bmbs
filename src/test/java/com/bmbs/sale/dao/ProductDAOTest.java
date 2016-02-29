package com.bmbs.sale.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bmbs.sale.common.CommonSpringContext;
import com.bmbs.wechat.service.MessageService;

public class ProductDAOTest extends CommonSpringContext{

	@Autowired
	public ProductDAO productDAO;
	
	@Autowired
	public MessageService service;
	
	@Test
	public void testGetProductById(){
		System.out.println(service.hashCode());
		System.out.println(productDAO.getProductById("test1").getIntroduction());
		
	}
}
