<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%!int i=1;%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>便民白事 — 殡葬服务</title>

<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="nivo-slider.css" type="text/css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/ddsmoothmenu.css" />

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery/jquery-2.1.4.js"/>
<script type="text/javascript" src="js/ddsmoothmenu.js"></script>

<script type="text/javascript" src="js/sale/product.js" />


<script type="text/javascript">

ddsmoothmenu.init({
	mainmenuid: "top_nav", //menu DIV id
	orientation: 'h', //Horizontal or vertical menu: Set to "h" or "v"
	classname: 'ddsmoothmenu', //class added to menu's outer DIV
	//customtheme: ["#1c5a80", "#18374a"],
	contentsource: "markup" //"markup" or ["container_id", "path_to_menu_file"]
})

</script>

</head>

<body>
<div id="templatemo_body_wrapper">
<div id="templatemo_wrapper">
	
	
 	<div id="templatemo_header">
    	<div id="site_title"><h1><a href="#">便民白事</a></h1></div>
    </div>

    <div id="templatemo_menubar">
    	<div id="top_nav" class="ddsmoothmenu">
            <ul>
                <li><a href="index.html" class="selected">首&nbsp&nbsp页</a></li>
                <li><a href="products.html">服务项目</a></li>
                <li><a href="about.html">殡仪馆介绍</a></li>
                <li><a href="faqs.html">公墓代理</a></li>
                <li><a href="checkout.html">联系我们</a></li>
            </ul>
            <br style="clear: left" />
        </div> 
    </div>
     
    <div id="templatemo_main">
    	<div id="sidebar" class="float_l">
        	<div class="sidebar_box"><span class="bottom"></span>
            	<h3>全部商品分类</h3>   
                <div class="content"> 
                	<ul class="sidebar_list">
                       <li><a href="productTyp?productTypeId=type1">骨灰盒</a></li>
			          	<li class="first"><a href="productTyp?productTypeId=type2"></a>答谢礼品</li>
			            <li><a href="productTyp?productTypeId=type3">寿&nbsp&nbsp衣</a></li>
			            <li><a href="productTyp?productTypeId=type4">灵堂用品</a></li>
			            <li><a href="productTyp?productTypeId=type5">灵车/大巴</a></li>
			            <li><a href="productTyp?productTypeId=type6">白事饭店</a></li>
			            <li class="last"><a href="productTyp?productTypeId=type7">檀&nbsp&nbsp香</a></li>
                    </ul>
                </div>
            </div>
            <div class="sidebar_box"><span class="bottom"></span>
            	<h3>Bestsellers </h3>   
                <div class="content"> 
                	<div class="bs_box">
                    	<a href="#"><img src="images/templatemo_image_01.jpg" alt="image" /></a>
                        <h4><a href="#">Donec nunc nisl</a></h4>
                        <p class="price">$10</p>
                        <div class="cleaner"></div>
                    </div>
                    <div class="bs_box">
                    	<a href="#"><img src="images/templatemo_image_01.jpg" alt="image" /></a>
                        <h4><a href="#">Lorem ipsum dolor sit</a></h4>
                        <p class="price">$12</p>
                        <div class="cleaner"></div>
                    </div>
                    <div class="bs_box">
                    	<a href="#"><img src="images/templatemo_image_01.jpg" alt="image" /></a>
                        <h4><a href="#">Phasellus ut dui</a></h4>
                        <p class="price">$20</p>
                        <div class="cleaner"></div>
                    </div>
                    <div class="bs_box">
                    	<a href="#"><img src="images/templatemo_image_01.jpg" alt="image" /></a>
                        <h4><a href="#">Vestibulum ante</a></h4>
                        <p class="price">$8</p>
                        <div class="cleaner"></div>
                    </div>
                </div>
            </div>
        </div>
        <div id="content" class="float_r">
        	<h1>骨灰盒</h1>
           <c:forEach items="${productsList}" var="product" varStatus="status">
				<%if(i%3 == 0) {%>
					<div class="product_box no_margin_right">
		            	<img src="${product.mainPicUrl}" width="240" height="160" />
		                <a id="${product.productID}" href="productDetail?productId=${product.productID}">
		                <p>${product.introduction} </p></a>
		                <p class="product_price">¥${product.price}</p>
		                <a href="shoppingcart.html" class="addtocart"></a>
		                <a href="productdetail.html" class="detail"></a>
                    </div>
                    <div class="cleaner"></div>
				<% i++;
				  } else{%>
				    <div class="product_box">
		            	<img src="${product.mainPicUrl}" width="240" height="160" />
		                <a id="${product.productID}" href="productDetail?productId=${product.productID}">
		                <p>${product.introduction} </p></a>
		                <p class="product_price">¥${product.price}</p>
		                <a href="shoppingcart.html" class="addtocart"></a>
		                <a href="productdetail.html" class="detail"></a>
           			 </div>    
				<%i++;
				 } %>		
		   </c:forEach>
            
        </div> 
        <div class="cleaner"></div>
    </div> <!-- END of templatemo_main -->
    
    <div id="templatemo_footer">
    	<p><a href="#">Home</a> | <a href="#">Products</a> | <a href="#">About</a> | <a href="#">FAQs</a> | <a href="#">Checkout</a> | <a href="#">Contact Us</a>
		</p>
    	Copyright © 2015 <a href="#">便民白事</a>
    </div> 
    
</div> <!-- END of templatemo_wrapper -->
</div> <!-- END of templatemo_body_wrapper -->

</body>
</html>