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
-- Table structure for table `tab4`
--

DROP TABLE IF EXISTS `tab4`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tab4` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `col` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab4`
--

LOCK TABLES `tab4` WRITE;
/*!40000 ALTER TABLE `tab4` DISABLE KEYS */;
INSERT INTO `tab4` VALUES (1,'\"A 600 point upswing. A 900 point dip. CNN\'s Christine Romans explains what recent stock market moves mean, and how to put them in context.\"'),(2,'\"The Dow is trying to rebound from a disastrous Christmas Eve.\"'),(3,'\"Supreme Court Justice Ruth Bader Ginsburg was discharged from the hospital on Tuesday and is recuperating at home after undergoing surgery, according to a court spokesperson.\"'),(4,'\"Treasury Secretary Steven Mnuchin left a lot of people scratching their heads. In trying to assure everyone that banks are healthy, he opened up a question most market observers weren\'t asking, at least publicly.\"'),(5,'\"Ask any Democrat considering running for president in 2020 about their decision-making process and most will draw a line between 2018 -- when it is far too early to decide -- and 2019 -- when the timing is just right.\"'),(6,'\"President Donald Trump said Tuesday he remains confident in his treasury secretary, a day after markets tanked on fears about the Federal Reserve and a peculiar call between Treasury Secretary Steve Mnuchin and bank CEOs.\"'),(7,'\"President Trump spoke to reporters at the White House and answered a question about US Treasury Secretary Steven Mnuchin and discussed the US Federal Reserve raising interest rates.\"'),(8,'\"President Donald Trump\'s frustration with Treasury Secretary Steven Mnuchin is ratcheting up further after markets suffered their worst Christmas Eve drop ever despite Mnuchin\'s attempts to calm Wall Street, according to a source close to the White House.\"'),(9,'\"In President Donald Trump\'s Christmas Day telling, the drugs are flowing over the border, the Federal Reserve is imperiling the economy and the Democrats are preparing to harass him with oversight requests.\"'),(10,'\"Wall Street, markets and business crave certainty. For the past month, they have been contending with confusion and disorder.\"');
/*!40000 ALTER TABLE `tab4` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-26 17:05:01
