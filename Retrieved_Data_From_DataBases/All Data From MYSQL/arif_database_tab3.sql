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
-- Table structure for table `tab3`
--

DROP TABLE IF EXISTS `tab3`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tab3` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `col` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab3`
--

LOCK TABLES `tab3` WRITE;
/*!40000 ALTER TABLE `tab3` DISABLE KEYS */;
INSERT INTO `tab3` VALUES (1,'\"When stock market swings should raise alarms - CNN Video\"'),(2,'\"Stock market tries for a comeback\"'),(3,'\"Ruth Bader Ginsburg released from hospital after cancer surgery\"'),(4,'\"Why Mnuchin\'s reassurance about US banks left markets confused\"'),(5,'\"Democrats have 2020 decisions to make as they enter the new year\"'),(6,'\"Trump says he\'s confident in Mnuchin, but Fed is raising rates too fast\"'),(7,'\"Trump: Mnuchin is a very smart person - CNN Video\"'),(8,'\"Trump\'s frustration with Mnuchin rising after failed attempt to calm markets, source says\"'),(9,'\"Trump\'s message on Christmas Day: \'It\'s a disgrace\'\"'),(10,'\"Wall Street craves certainty but all it\'s getting is chaos\"');
/*!40000 ALTER TABLE `tab3` ENABLE KEYS */;
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
