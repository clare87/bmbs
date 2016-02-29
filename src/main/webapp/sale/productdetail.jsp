<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>便民白事 — 殡葬服务</title>

<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="nivo-slider.css" type="text/css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/ddsmoothmenu.css" />
<link rel="stylesheet" href="css/ShopShow.css" type="text/css" />
<link rel="stylesheet" href="css/MagicZoom.css" type="text/css" />

<script src="js/MagicZoom.js" type="text/javascript"></script>
<script src="js/ShopShow.js"></script>


<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery/jquery-2.1.4.js"/>
<script type="text/javascript" src="js/ddsmoothmenu.js"></script>

<script type="text/javascript" src="js/sale/productDetail.js" />

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
	               <li>
	                    <a href="guhuihe?productTypeId=type1">骨灰盒</a></li>
			          	<li class="first"><a href="#">寿&nbsp&nbsp衣</a></li>
			            <li><a href="#">答谢礼品</a></li>
			            <li><a href="#">灵堂用品</a></li>
			            <li><a href="#">灵车/大巴</a></li>
			            <li><a href="#">白事饭店</a></li>
			            <li class="last"><a href="#">檀&nbsp&nbsp香</a></li>
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
        	<h1>商品详情</h1>

			<div id="content_half" class="pic_l">
				<div id="tsImgS"><a href="${product.mainPicUrl}" title="Images" class="MagicZoom" id="MagicZoom">
				    <img width="300" height="300" src="${product.mainPicUrl}" /></a>
				</div>
				<div id="tsPicContainer">
					<div id="tsImgSArrL" onclick="tsScrollArrLeft()"></div>
					<div id="tsImgSCon">
						<ul>
							<c:forEach items="${product.productPics}" var="pic" varStatus="status">
								<li onclick="showPic(${status.index})" rel="MagicZoom"><img height="22" width="32" src="${pic.picUrl}" tsImgS="${pic.picUrl}" /></li>
							</c:forEach>
						</ul>
					</div>
					<div id="tsImgSArrR" onclick="tsScrollArrRight()"></div>
				</div>
				<img class="MagicZoomLoading" width="16" height="16" src="images/loading.gif" alt="Loading..." />
			</div>
            <div class="content_half float_r">
                <table>
                    <tr>
                        <td width="60">价格:</td>
                        <td>${product.price}</td>
                    </tr>
                    <tr>
                        <td>材质:</td>
                        <td>${product.material}</td>
                    </tr>
                    <tr>
                        <td>产地:</td>
                        <td>${product.producer}</td>
                    </tr>
                    <tr>
                        <td>副材:</td>
                        <td>${product.stuff}</td>
                    </tr>
                    <tr>
                    	<td>数量</td>
                        <td><input type="text" value="1" style="width: 20px; text-align: right" /></td>
                    </tr>
                </table>
                <div class="cleaner h20"></div>

                <a href="shoppingcart.html" class="addtocart"></a>

			</div>
            <div class="cleaner h30"></div>
          <div class="cleaner h50"></div>
            <h3>商品详情</h3>
        	   <div id="tab" style="/* margin-left:460px; *//* margin-top:20px */">
                <div class="tabList">
                    <ul>
                        <li class="cur">商品详情</li>
                        <li>累计评价</li>
                        <li>扫码优惠</li><!-- 此处放一个二维码  当用户关注后可以提供一个优惠 -->
                        <li>游览记录</li>
                    </ul>
                </div>
                <div class="tabCon">
                    <div class="cur">${product.description} 
                    <img src="images/product/p01601-4.jpg" style="height: 306px; width: 411px; "/>
                    <img src="images/product/p01601-4.jpg" style="height: 347px; width: 411px; "/>
                    <img src="images/product/p01601-4.jpg" style="height: 420px; width: 411px; "/>
                    <img src="images/product/p01601-4.jpg" style="height: 306px; width: 411px; "/>
                    </div>
                </div>
            </div> 
        </div> 
        <div class="cleaner"></div>
    </div> <!-- END of templatemo_main -->
    
    <div id="templatemo_footer">
    	<p><a href="#">Home</a> | <a href="#">Products</a> | <a href="#">About</a> | <a href="#">FAQs</a> | <a href="#">Checkout</a> | <a href="#">Contact Us</a>
		</p>

		Copyright © 2072 <a href="#">Your Company Name</a> | Collect from <a href="http://www.cssmoban.com" target="_parent">网站模板</a>
    	
    </div> <!-- END of templatemo_footer -->
    
</div> <!-- END of templatemo_wrapper -->
</div> <!-- END of templatemo_body_wrapper -->

</body>
</html>