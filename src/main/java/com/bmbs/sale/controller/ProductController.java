package com.bmbs.sale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bmbs.sale.bean.ProductPO;
import com.bmbs.sale.bean.ProductTypePO;
import com.bmbs.sale.service.ProductService;


@Controller
@RequestMapping("sale")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="index")
	public String redirectIndex(){
		return "index";
	}

	@RequestMapping(value = "getAllProductType")
	public @ResponseBody List<ProductTypePO> getAllProductType(){
			
		return null;
	}
	
	@RequestMapping(value = "guhuihe")
	public String guhuihe(){
		return "products1";
	}
	
	@RequestMapping(value = "shouyi")
	public String shouyi(){
		return "products5";
	}
	
	@RequestMapping(value = "daxieli")
	public String daxieli(){
		return "products2";
	}
	
	@RequestMapping(value = "zhutai")
	public String zhutai(){
		return "products3";
	}
	
	@RequestMapping(value = "tanxiang")
	public String tanxiang(){
		return "products4";
	}
	
	@RequestMapping(value = "productDetail")
	public ModelAndView getProductById(@RequestParam String productId) {
		ModelAndView modelAndView = new ModelAndView("productdetail");
		ProductPO product = productService.getProductById(productId);
		modelAndView.addObject("product", product);
		return modelAndView;
	}

}
