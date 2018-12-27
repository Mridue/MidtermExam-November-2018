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
-- Table structure for table `tab8`
--

DROP TABLE IF EXISTS `tab8`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tab8` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `col` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab8`
--

LOCK TABLES `tab8` WRITE;
/*!40000 ALTER TABLE `tab8` DISABLE KEYS */;
INSERT INTO `tab8` VALUES (1,'null'),(2,'null'),(3,'\"Washington (CNN) Supreme Court Justice Ruth Bader Ginsburg was discharged from the hospital on Tuesday and is recuperating at home after undergoing surgery, according to a court spokesperson. \\\"Justice Ginsburg was discharged from the hospital yesterday and is… [+431 chars]\"'),(4,'null'),(5,'\"(CNN) Ask any Democrat considering running for president in 2020 about their decision-making process and most will draw a line between 2018 -- when it is far too early to decide -- and 2019 -- when the timing is just right. A few Democrats haven\'t waited. Rep… [+9242 chars]\"'),(6,'\"Washington (CNN) President Donald Trump said Tuesday he remains confident in his treasury secretary, a day after markets tanked on fears about the Federal Reserve and a peculiar call between Treasury Secretary Steve Mnuchin and bank CEOs. \\\"Yes I do,\\\" Trump sa… [+2393 chars]\"'),(7,'\"Chat with us in Facebook Messenger. Find out what\'s happening in the world as it unfolds.\"'),(8,'\"(CNN) President Donald Trump\'s frustration with Treasury Secretary Steven Mnuchin is ratcheting up further after markets suffered their worst Christmas Eve drop ever despite Mnuchin\'s attempts to calm Wall Street, according to a source close to the White Hous… [+3615 chars]\"'),(9,'\"(CNN) In President Donald Trump\'s Christmas Day telling, the drugs are flowing over the border, the Federal Reserve is imperiling the economy and the Democrats are preparing to harass him with oversight requests. \\\"It\'s a disgrace, what\'s happening in our coun… [+5019 chars]\"'),(10,'null');
/*!40000 ALTER TABLE `tab8` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-26 17:04:59
