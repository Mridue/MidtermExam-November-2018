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
-- Table structure for table `tab5`
--

DROP TABLE IF EXISTS `tab5`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tab5` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `col` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab5`
--

LOCK TABLES `tab5` WRITE;
/*!40000 ALTER TABLE `tab5` DISABLE KEYS */;
INSERT INTO `tab5` VALUES (1,'\"http://us.cnn.com/videos/business/2018/10/26/stock-market-swings-alarms-orig.cnn-business\"'),(2,'\"http://us.cnn.com/2018/12/26/investing/stock-market-today/index.html\"'),(3,'\"http://us.cnn.com/2018/12/26/politics/ruth-bader-ginsburg-hospital-release/index.html\"'),(4,'\"http://us.cnn.com/2018/12/24/investing/mnuchin-bank-liquidity/index.html\"'),(5,'\"http://us.cnn.com/2018/12/26/politics/democrats-2019-decisions/index.html\"'),(6,'\"http://us.cnn.com/2018/12/25/politics/trump-mnuchin-confidence/index.html\"'),(7,'\"http://us.cnn.com/videos/politics/2018/12/25/trump-white-house-mnuchin-federal-reserve-comments-vpx.cnn\"'),(8,'\"https://www.cnn.com/2018/12/25/politics/steven-mnuchin-trump/index.html\"'),(9,'\"http://us.cnn.com/2018/12/25/politics/trump-oval-office-christmas/index.html\"'),(10,'\"http://us.cnn.com/2018/12/24/investing/wall-street-2018/index.html\"');
/*!40000 ALTER TABLE `tab5` ENABLE KEYS */;
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
