-- MySQL dump 10.13  Distrib 5.6.26, for Win64 (x86_64)
--
-- Host: localhost    Database: bmbs
-- ------------------------------------------------------
-- Server version	5.6.26-enterprise-commercial-advanced-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_product`
--

DROP TABLE IF EXISTS `t_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_product` (
  `b_productId` varchar(50) NOT NULL,
  `b_productName` varchar(50) DEFAULT NULL,
  `b_mainPicUrl` varchar(100) DEFAULT NULL,
  `b_introduction` varchar(200) DEFAULT NULL,
  `b_price` float(8,2) DEFAULT NULL,
  `b_material` varchar(45) DEFAULT NULL,
  `b_producer` varchar(45) DEFAULT NULL,
  `b_stuff` varchar(45) DEFAULT NULL,
  `b_description` varchar(200) DEFAULT NULL,
  `b_productType` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`b_productId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_product`
--

LOCK TABLES `t_product` WRITE;
/*!40000 ALTER TABLE `t_product` DISABLE KEYS */;
INSERT INTO `t_product` VALUES ('p001','骨灰盒01','images/product/p00101.jpg','新款促销 骨灰盒 思念 黑檀木 高质量 附赠下葬用品 包邮',90.23,'克莱木','非洲热带木材','印加木','该木材坚硬，沉重，木质细腻光滑，自然花纹，名贵高雅。是世界上稀有树种之一。','001'),('p002','骨灰盒02','images/product/p00201.jpg','骨灰盒-豪华宫-1 黑檀木 寿盒 殡葬用品 高质量 包邮 ',500.00,'黑檀木','坦桑尼亚','印加木','该木材坚硬，沉重，木质细腻光滑，自然花纹，名贵高雅。是世界上稀有树种之一。','001'),('p003','骨灰盒03','images/product/p00303.jpg','冲冠促销 骨灰盒 黑檀木--帝豪园 寿盒 殡葬用品 高质量 包邮 ',300.00,'黑檀木','坦桑尼亚','印加木','该木材坚硬，沉重，木质细腻光滑，自然花纹，名贵高雅。是世界上稀有树种之一。','001'),('p004','骨灰盒04','images/product/p00404.jpg','冲冠促销 骨灰盒 黑檀新九龙 黑檀木 寿盒 殡葬用品 高质量 包邮',400.00,'黑檀木','坦桑尼亚','印加木','该木材坚硬，沉重，木质细腻光滑，自然花纹，名贵高雅。是世界上稀有树种之一。','001'),('p005','骨灰盒05','images/product/p00501.jpg','骨灰盒 寿衣 凤盒 龙盒 新品特价 全国包邮 殡葬一条龙服务 ',340.00,'黑檀木','坦桑尼亚','印加木','该木材坚硬，沉重，木质细腻光滑，自然花纹，名贵高雅。是世界上稀有树种之一。','001');
/*!40000 ALTER TABLE `t_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_productpic`
--

DROP TABLE IF EXISTS `t_productpic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_productpic` (
  `b_picId` varchar(50) NOT NULL,
  `b_picUrl` varchar(100) DEFAULT NULL,
  `b_productId` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`b_picId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_productpic`
--

LOCK TABLES `t_productpic` WRITE;
/*!40000 ALTER TABLE `t_productpic` DISABLE KEYS */;
INSERT INTO `t_productpic` VALUES ('p001011','images/product/p00101-1.jpg','p001'),('p001012','images/product/p00101-2.jpg','p001'),('p001013','images/product/p00101-3.jpg','p001');
/*!40000 ALTER TABLE `t_productpic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_producttype`
--

DROP TABLE IF EXISTS `t_producttype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_producttype` (
  `b_typeId` varchar(50) NOT NULL,
  `b_typeName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`b_typeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_producttype`
--

LOCK TABLES `t_producttype` WRITE;
/*!40000 ALTER TABLE `t_producttype` DISABLE KEYS */;
INSERT INTO `t_producttype` VALUES ('type1','骨灰盒'),('type2','寿衣'),('type3','答谢礼'),('type4','烛台'),('type5','檀香');
/*!40000 ALTER TABLE `t_producttype` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-10-11 23:26:39
