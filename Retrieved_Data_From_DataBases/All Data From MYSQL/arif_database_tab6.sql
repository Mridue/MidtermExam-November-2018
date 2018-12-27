-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: arif_database
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tab6`
--

DROP TABLE IF EXISTS `tab6`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tab6` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `col` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab6`
--

LOCK TABLES `tab6` WRITE;
/*!40000 ALTER TABLE `tab6` DISABLE KEYS */;
INSERT INTO `tab6` VALUES (1,'\"https://cdn.cnn.com/cnnnext/dam/assets/180406094746-stock-market-volatility-super-tease.jpg\"'),(2,'\"https://cdn.cnn.com/cnnnext/dam/assets/181226083026-02-nyse-file-1226-super-tease.jpg\"'),(3,'\"https://cdn.cnn.com/cnnnext/dam/assets/181221130416-01-ginsburg-1215-super-tease.jpg\"'),(4,'\"https://cdn.cnn.com/cnnnext/dam/assets/181224114214-01-steve-mnuchin-1203-super-tease.jpg\"'),(5,'\"https://cdn.cnn.com/cnnnext/dam/assets/181007092605-potential-2020-democrats-super-tease.jpg\"'),(6,'\"https://cdn.cnn.com/cnnnext/dam/assets/180406151135-mnuchin-trump-boeing-super-tease.jpg\"'),(7,'\"https://cdn.cnn.com/cnnnext/dam/assets/181225182146-trump-steve-mnuchin-financial-markets-super-tease.jpg\"'),(8,'\"https://cdn.cnn.com/cnnnext/dam/assets/181015144428-02-steve-mnuchin-file-super-tease.jpg\"'),(9,'\"https://cdn.cnn.com/cnnnext/dam/assets/181225104619-01-trump-1225-super-tease.jpg\"'),(10,'\"https://cdn.cnn.com/cnnnext/dam/assets/181221124816-01-nyse-1221-super-tease.jpg\"');
/*!40000 ALTER TABLE `tab6` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-26 17:05:00
