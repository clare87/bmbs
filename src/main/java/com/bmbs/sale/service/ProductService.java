package com.bmbs.sale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmbs.sale.bean.ProductPO;
import com.bmbs.sale.dao.ProductDAO;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	public ProductPO getProductById(String productId){
		productDAO.getProductList("001");
		return productDAO.getProductById(productId);
	}

}
