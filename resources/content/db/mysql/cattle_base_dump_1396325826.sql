-- MySQL dump 10.13  Distrib 5.5.34, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: cattle_base
-- ------------------------------------------------------
-- Server version	5.5.34-0ubuntu0.13.04.1

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
-- Table structure for table `DATABASECHANGELOG`
--

DROP TABLE IF EXISTS `DATABASECHANGELOG`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DATABASECHANGELOG` (
  `ID` varchar(255) NOT NULL,
  `AUTHOR` varchar(255) NOT NULL,
  `FILENAME` varchar(255) NOT NULL,
  `DATEEXECUTED` datetime NOT NULL,
  `ORDEREXECUTED` int(11) NOT NULL,
  `EXECTYPE` varchar(10) NOT NULL,
  `MD5SUM` varchar(35) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `COMMENTS` varchar(255) DEFAULT NULL,
  `TAG` varchar(255) DEFAULT NULL,
  `LIQUIBASE` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DATABASECHANGELOG`
--

LOCK TABLES `DATABASECHANGELOG` WRITE;
/*!40000 ALTER TABLE `DATABASECHANGELOG` DISABLE KEYS */;
INSERT INTO `DATABASECHANGELOG` VALUES ('dump1','darren (generated)','db/dump.xml','2014-03-31 20:14:48',1,'EXECUTED','7:7804898bf856df0c94c17a1b6124775d','createTable','',NULL,'3.1.0'),('dump2','darren (generated)','db/dump.xml','2014-03-31 20:14:48',2,'EXECUTED','7:b15f282d3fc93ca53935cbd47997f265','createTable','',NULL,'3.1.0'),('dump3','darren (generated)','db/dump.xml','2014-03-31 20:14:48',3,'EXECUTED','7:f3466a18a83797c81a53c3f44422b61d','createTable','',NULL,'3.1.0'),('dump4','darren (generated)','db/dump.xml','2014-03-31 20:14:49',4,'EXECUTED','7:1374399fc3af8bd4098d25f05ca213bf','createTable','',NULL,'3.1.0'),('dump5','darren (generated)','db/dump.xml','2014-03-31 20:14:49',5,'EXECUTED','7:ff24046a894a2be1521667cda2f55e6b','createTable','',NULL,'3.1.0'),('dump6','darren (generated)','db/dump.xml','2014-03-31 20:14:49',6,'EXECUTED','7:33d2115150da7f9268b7e585c072d9a3','createTable','',NULL,'3.1.0'),('dump7','darren (generated)','db/dump.xml','2014-03-31 20:14:49',7,'EXECUTED','7:e6d928e1ed4b5e50f349cc29e8e9aaa0','createTable','',NULL,'3.1.0'),('dump8','darren (generated)','db/dump.xml','2014-03-31 20:14:49',8,'EXECUTED','7:4ae450d3862ff6481c9e2dddca552ae9','createTable','',NULL,'3.1.0'),('dump9','darren (generated)','db/dump.xml','2014-03-31 20:14:49',9,'EXECUTED','7:d444ae1b41d6b0ecf33d6fcadd480db5','createTable','',NULL,'3.1.0'),('dump10','darren (generated)','db/dump.xml','2014-03-31 20:14:49',10,'EXECUTED','7:03b36911af44b34fcbe84027f4a3052b','createTable','',NULL,'3.1.0'),('dump11','darren (generated)','db/dump.xml','2014-03-31 20:14:49',11,'EXECUTED','7:a7eca442e232d6d14324c38627ec743a','createTable','',NULL,'3.1.0'),('dump12','darren (generated)','db/dump.xml','2014-03-31 20:14:49',12,'EXECUTED','7:90f2fea19a5a8586933abfb6a37364eb','createTable','',NULL,'3.1.0'),('dump13','darren (generated)','db/dump.xml','2014-03-31 20:14:49',13,'EXECUTED','7:9a053b698f56edcb6e721af661530ad5','createTable','',NULL,'3.1.0'),('dump14','darren (generated)','db/dump.xml','2014-03-31 20:14:49',14,'EXECUTED','7:3bf47d59f4f7fb44657dedf3cea94aa3','createTable','',NULL,'3.1.0'),('dump15','darren (generated)','db/dump.xml','2014-03-31 20:14:49',15,'EXECUTED','7:a27991896abf35eb49eb874d3c420f96','createTable','',NULL,'3.1.0'),('dump16','darren (generated)','db/dump.xml','2014-03-31 20:14:49',16,'EXECUTED','7:9730d8ac4265b2495d3c27caf0346cb2','createTable','',NULL,'3.1.0'),('dump17','darren (generated)','db/dump.xml','2014-03-31 20:14:49',17,'EXECUTED','7:77126348d721c3058813ea1c85d7ea22','createTable','',NULL,'3.1.0'),('dump18','darren (generated)','db/dump.xml','2014-03-31 20:14:49',18,'EXECUTED','7:6eac595dbfe701763b64e6647355454e','createTable','',NULL,'3.1.0'),('dump19','darren (generated)','db/dump.xml','2014-03-31 20:14:49',19,'EXECUTED','7:173a2c487e08c0dfdc739b171a9b36cf','createTable','',NULL,'3.1.0'),('dump20','darren (generated)','db/dump.xml','2014-03-31 20:14:49',20,'EXECUTED','7:73a2f8a59d597bb7de5f12a3b63972c1','createTable','',NULL,'3.1.0'),('dump21','darren (generated)','db/dump.xml','2014-03-31 20:14:49',21,'EXECUTED','7:31aa5c7a50738f7a39153d2fecb70333','createTable','',NULL,'3.1.0'),('dump22','darren (generated)','db/dump.xml','2014-03-31 20:14:49',22,'EXECUTED','7:418b1781ad9cf268fb1e9a236bb57de3','createTable','',NULL,'3.1.0'),('dump23','darren (generated)','db/dump.xml','2014-03-31 20:14:50',23,'EXECUTED','7:bcea11c572a8f524086dc29f4ebe70b9','createTable','',NULL,'3.1.0'),('dump24','darren (generated)','db/dump.xml','2014-03-31 20:14:50',24,'EXECUTED','7:d830d0a491f5d867f707aa2cf7f7f430','createTable','',NULL,'3.1.0'),('dump25','darren (generated)','db/dump.xml','2014-03-31 20:14:50',25,'EXECUTED','7:cfc15d8869639fc8652cf79aa56f796a','createTable','',NULL,'3.1.0'),('dump26','darren (generated)','db/dump.xml','2014-03-31 20:14:50',26,'EXECUTED','7:5e1b8344cd14f1fe3da65a8d7ef1245a','createTable','',NULL,'3.1.0'),('dump27','darren (generated)','db/dump.xml','2014-03-31 20:14:50',27,'EXECUTED','7:f843206e53671f7b766c95335284df52','addForeignKeyConstraint','',NULL,'3.1.0'),('dump28','darren (generated)','db/dump.xml','2014-03-31 20:14:50',28,'EXECUTED','7:16c254219c0138cb61e146234d4a28b3','addForeignKeyConstraint','',NULL,'3.1.0'),('dump29','darren (generated)','db/dump.xml','2014-03-31 20:14:50',29,'EXECUTED','7:092faf37ae9f52de8e526ea51d207fe5','addForeignKeyConstraint','',NULL,'3.1.0'),('dump30','darren (generated)','db/dump.xml','2014-03-31 20:14:50',30,'EXECUTED','7:8a5b4ef10e9ea77f8ca2826a18056aff','addForeignKeyConstraint','',NULL,'3.1.0'),('dump31','darren (generated)','db/dump.xml','2014-03-31 20:14:50',31,'EXECUTED','7:2cc87c697420ee6d3b2e1a4d25697c09','addForeignKeyConstraint','',NULL,'3.1.0'),('dump33','darren (generated)','db/dump.xml','2014-03-31 20:14:50',32,'EXECUTED','7:4ff7d8e8b39818b93f15d7eafd741240','addForeignKeyConstraint','',NULL,'3.1.0'),('dump34','darren (generated)','db/dump.xml','2014-03-31 20:14:50',33,'EXECUTED','7:4226e9972a45e5a400af712b81881b73','addForeignKeyConstraint','',NULL,'3.1.0'),('dump35','darren (generated)','db/dump.xml','2014-03-31 20:14:50',34,'EXECUTED','7:6d9ab5b80234e154ee930d0d7eccdd0f','addForeignKeyConstraint','',NULL,'3.1.0'),('dump36','darren (generated)','db/dump.xml','2014-03-31 20:14:50',35,'EXECUTED','7:85b8199afc534c7d9c2f8bc18e02adb7','addForeignKeyConstraint','',NULL,'3.1.0'),('dump37','darren (generated)','db/dump.xml','2014-03-31 20:14:50',36,'EXECUTED','7:635cabddc60e4c4bc06e35e6f0df0297','addForeignKeyConstraint','',NULL,'3.1.0'),('dump38','darren (generated)','db/dump.xml','2014-03-31 20:14:50',37,'EXECUTED','7:8f52a0c5309b013a5fd4054ff30a8d6c','addForeignKeyConstraint','',NULL,'3.1.0'),('dump39','darren (generated)','db/dump.xml','2014-03-31 20:14:50',38,'EXECUTED','7:7f25d9412738b3248ef6a239822bc4f3','addForeignKeyConstraint','',NULL,'3.1.0'),('dump40','darren (generated)','db/dump.xml','2014-03-31 20:14:51',39,'EXECUTED','7:2aa2ca4c63e95b877fa9674d0466d1cf','addForeignKeyConstraint','',NULL,'3.1.0'),('dump41','darren (generated)','db/dump.xml','2014-03-31 20:14:51',40,'EXECUTED','7:bb6b889e6302ea216310d6b7f5210ebd','addForeignKeyConstraint','',NULL,'3.1.0'),('dump42','darren (generated)','db/dump.xml','2014-03-31 20:14:51',41,'EXECUTED','7:e9f5a46795e093d71eb2d06b8d8b6e94','addForeignKeyConstraint','',NULL,'3.1.0'),('dump43','darren (generated)','db/dump.xml','2014-03-31 20:14:51',42,'EXECUTED','7:75cf9ae506c7c1cd6cedf056d0eda209','addForeignKeyConstraint','',NULL,'3.1.0'),('dump44','darren (generated)','db/dump.xml','2014-03-31 20:14:51',43,'EXECUTED','7:cac4f5da937764dd69f058d11eea4c0e','addForeignKeyConstraint','',NULL,'3.1.0'),('dump45','darren (generated)','db/dump.xml','2014-03-31 20:14:51',44,'EXECUTED','7:63b8d3fe08950f115fe12d8259603c93','addForeignKeyConstraint','',NULL,'3.1.0'),('dump46','darren (generated)','db/dump.xml','2014-03-31 20:14:51',45,'EXECUTED','7:cad37d8734a5d7dfc51c7cd7f351762e','addForeignKeyConstraint','',NULL,'3.1.0'),('dump47','darren (generated)','db/dump.xml','2014-03-31 20:14:51',46,'EXECUTED','7:883404d806143b19b5b11e57aae0ce36','addForeignKeyConstraint','',NULL,'3.1.0'),('dump48','darren (generated)','db/dump.xml','2014-03-31 20:14:51',47,'EXECUTED','7:cd424696031aa8eb0b287b4103bdd538','addForeignKeyConstraint','',NULL,'3.1.0'),('dump49','darren (generated)','db/dump.xml','2014-03-31 20:14:51',48,'EXECUTED','7:b3956cf6161e7fd54d0e6fe16f17a0da','addForeignKeyConstraint','',NULL,'3.1.0'),('dump50','darren (generated)','db/dump.xml','2014-03-31 20:14:51',49,'EXECUTED','7:d44b7a9d8e72d244ac91a81655685060','addForeignKeyConstraint','',NULL,'3.1.0'),('dump51','darren (generated)','db/dump.xml','2014-03-31 20:14:51',50,'EXECUTED','7:cb03ddc387db3cdf9b77e5bf4d930d5c','addForeignKeyConstraint','',NULL,'3.1.0'),('dump52','darren (generated)','db/dump.xml','2014-03-31 20:14:51',51,'EXECUTED','7:223cc172f33af606f4fe3ad09759a38d','addForeignKeyConstraint','',NULL,'3.1.0'),('dump53','darren (generated)','db/dump.xml','2014-03-31 20:14:52',52,'EXECUTED','7:0097cde3f08d70e565b0ed0700e51b2a','addForeignKeyConstraint','',NULL,'3.1.0'),('dump54','darren (generated)','db/dump.xml','2014-03-31 20:14:52',53,'EXECUTED','7:d2c6114a561e2d1bc48e8c22e07a8d06','addForeignKeyConstraint','',NULL,'3.1.0'),('dump55','darren (generated)','db/dump.xml','2014-03-31 20:14:52',54,'EXECUTED','7:db21b39ec7d0578fa03bc9922e2a3e33','addForeignKeyConstraint','',NULL,'3.1.0'),('dump56','darren (generated)','db/dump.xml','2014-03-31 20:14:52',55,'EXECUTED','7:18d8c7a92a2b2f0eebd2b9cc44f1e965','addForeignKeyConstraint','',NULL,'3.1.0'),('dump57','darren (generated)','db/dump.xml','2014-03-31 20:14:52',56,'EXECUTED','7:9b121aea8e830c3d3af18183ce0c5620','addForeignKeyConstraint','',NULL,'3.1.0'),('dump58','darren (generated)','db/dump.xml','2014-03-31 20:14:52',57,'EXECUTED','7:59198dc847af4b914183366cbd9d047b','addForeignKeyConstraint','',NULL,'3.1.0'),('dump59','darren (generated)','db/dump.xml','2014-03-31 20:14:52',58,'EXECUTED','7:a1fae7dbcfca03d025d491cee1f3609c','addForeignKeyConstraint','',NULL,'3.1.0'),('dump60','darren (generated)','db/dump.xml','2014-03-31 20:14:52',59,'EXECUTED','7:d2331fad14fd961db0d217d0220c582b','addForeignKeyConstraint','',NULL,'3.1.0'),('dump61','darren (generated)','db/dump.xml','2014-03-31 20:14:52',60,'EXECUTED','7:c856ea11691bafece7b3abe9a5018909','addForeignKeyConstraint','',NULL,'3.1.0'),('dump62','darren (generated)','db/dump.xml','2014-03-31 20:14:52',61,'EXECUTED','7:de18b709b668aaae150b87645c563eca','addForeignKeyConstraint','',NULL,'3.1.0'),('dump63','darren (generated)','db/dump.xml','2014-03-31 20:14:52',62,'EXECUTED','7:006af553f652aeaf2aa68290aa9f1dbc','addForeignKeyConstraint','',NULL,'3.1.0'),('dump64','darren (generated)','db/dump.xml','2014-03-31 20:14:52',63,'EXECUTED','7:dc9ef476f62f1edb158dc2cbfc333ed6','addUniqueConstraint','',NULL,'3.1.0'),('dump65','darren (generated)','db/dump.xml','2014-03-31 20:14:52',64,'EXECUTED','7:d39fda2b41d9de0d7706a4200ec5fab7','addUniqueConstraint','',NULL,'3.1.0'),('dump66','darren (generated)','db/dump.xml','2014-03-31 20:14:52',65,'EXECUTED','7:e4d169fc5f37644ddcf492cf377215ac','addUniqueConstraint','',NULL,'3.1.0'),('dump67','darren (generated)','db/dump.xml','2014-03-31 20:14:53',66,'EXECUTED','7:f48fadc0834209596cadf74281a3eed9','addUniqueConstraint','',NULL,'3.1.0'),('dump68','darren (generated)','db/dump.xml','2014-03-31 20:14:53',67,'EXECUTED','7:4a7cd3e85430a01da60b211a7ad7a200','addUniqueConstraint','',NULL,'3.1.0'),('dump69','darren (generated)','db/dump.xml','2014-03-31 20:14:53',68,'EXECUTED','7:eb7886ddf499f0c91c279f5f3f2ac186','addUniqueConstraint','',NULL,'3.1.0'),('dump70','darren (generated)','db/dump.xml','2014-03-31 20:14:53',69,'EXECUTED','7:128b4ef004e988cfea93a31059294997','addUniqueConstraint','',NULL,'3.1.0'),('dump71','darren (generated)','db/dump.xml','2014-03-31 20:14:53',70,'EXECUTED','7:36de0bb235966ca3a54c80ba159d8b97','addUniqueConstraint','',NULL,'3.1.0'),('dump72','darren (generated)','db/dump.xml','2014-03-31 20:14:53',71,'EXECUTED','7:099b28b0434ece127e2867a092be4b55','addUniqueConstraint','',NULL,'3.1.0'),('dump73','darren (generated)','db/dump.xml','2014-03-31 20:14:53',72,'EXECUTED','7:a136717a7da31bc2833332a728892303','addUniqueConstraint','',NULL,'3.1.0'),('dump74','darren (generated)','db/dump.xml','2014-03-31 20:14:53',73,'EXECUTED','7:053a0e19ad33e7188efe567665d50fb6','addUniqueConstraint','',NULL,'3.1.0'),('dump75','darren (generated)','db/dump.xml','2014-03-31 20:14:53',74,'EXECUTED','7:50aaf7c01c9615691c2c2985b3663dcd','addUniqueConstraint','',NULL,'3.1.0'),('dump76','darren (generated)','db/dump.xml','2014-03-31 20:14:53',75,'EXECUTED','7:3cf63f5658756e4bb1c6bf741c2bfbe2','addUniqueConstraint','',NULL,'3.1.0'),('dump77','darren (generated)','db/dump.xml','2014-03-31 20:14:53',76,'EXECUTED','7:2561d075d029ba946f3bcbde7484fbc8','addUniqueConstraint','',NULL,'3.1.0'),('dump78','darren (generated)','db/dump.xml','2014-03-31 20:14:53',77,'EXECUTED','7:2734de68ecce8d415892a4a2d1014509','addUniqueConstraint','',NULL,'3.1.0'),('dump79','darren (generated)','db/dump.xml','2014-03-31 20:14:53',78,'EXECUTED','7:aec74e6e897138431815bf9b83b33ba2','addUniqueConstraint','',NULL,'3.1.0'),('dump80','darren (generated)','db/dump.xml','2014-03-31 20:14:54',79,'EXECUTED','7:10432e1ef5ce9e780d0b84a486979311','addUniqueConstraint','',NULL,'3.1.0'),('dump81','darren (generated)','db/dump.xml','2014-03-31 20:14:54',80,'EXECUTED','7:1414d974977d180efe4f90c686f2cf2a','addUniqueConstraint','',NULL,'3.1.0'),('dump82','darren (generated)','db/dump.xml','2014-03-31 20:14:54',81,'EXECUTED','7:17dc1738baad40884cd5db55cea1e304','addUniqueConstraint','',NULL,'3.1.0'),('dump83','darren (generated)','db/dump.xml','2014-03-31 20:14:54',82,'EXECUTED','7:15a706509dc4bd17c6dbf110adcffbf6','addUniqueConstraint','',NULL,'3.1.0'),('dump84','darren (generated)','db/dump.xml','2014-03-31 20:14:54',83,'EXECUTED','7:3901c5e94e4b09110c21fe560468e428','addUniqueConstraint','',NULL,'3.1.0'),('dump85','darren (generated)','db/dump.xml','2014-03-31 20:14:54',84,'EXECUTED','7:4533a1ac9939ae985a3df0b474921317','addUniqueConstraint','',NULL,'3.1.0'),('dump86','darren (generated)','db/dump.xml','2014-03-31 20:14:54',85,'EXECUTED','7:e5733685acbc34894d46ef8f7646ebaf','addUniqueConstraint','',NULL,'3.1.0'),('dump87','darren (generated)','db/dump.xml','2014-03-31 20:14:54',86,'EXECUTED','7:7ebef6446989d8753e196e06c64dcf2a','createIndex','',NULL,'3.1.0'),('dump88','darren (generated)','db/dump.xml','2014-03-31 20:14:54',87,'EXECUTED','7:7f211b4bff5a60c3586e4dacf8471d69','createIndex','',NULL,'3.1.0'),('dump89','darren (generated)','db/dump.xml','2014-03-31 20:14:54',88,'EXECUTED','7:4235f7dadf568841987e5ff88b2a34df','createIndex','',NULL,'3.1.0'),('dump90','darren (generated)','db/dump.xml','2014-03-31 20:14:54',89,'EXECUTED','7:c8c3621e95f5ba073966d613ce878975','createIndex','',NULL,'3.1.0'),('dump91','darren (generated)','db/dump.xml','2014-03-31 20:14:54',90,'EXECUTED','7:d2b44cbc6a7ffd7bb40df8e9ed0c22eb','createIndex','',NULL,'3.1.0'),('dump92','darren (generated)','db/dump.xml','2014-03-31 20:14:54',91,'EXECUTED','7:602902b2073f8313dce25806205a0266','createIndex','',NULL,'3.1.0'),('dump93','darren (generated)','db/dump.xml','2014-03-31 20:14:55',92,'EXECUTED','7:dc6c8115e037f40b82a6840491d824a2','createIndex','',NULL,'3.1.0'),('dump94','darren (generated)','db/dump.xml','2014-03-31 20:14:55',93,'EXECUTED','7:5469eabe0933e3d574999aeca6a31390','createIndex','',NULL,'3.1.0'),('dump95','darren (generated)','db/dump.xml','2014-03-31 20:14:55',94,'EXECUTED','7:4bc29cf7565f01a325e9e22f4bb982c7','createIndex','',NULL,'3.1.0'),('dump96','darren (generated)','db/dump.xml','2014-03-31 20:14:55',95,'EXECUTED','7:251765fc75d3ce99464dc73bbeace618','createIndex','',NULL,'3.1.0'),('dump97','darren (generated)','db/dump.xml','2014-03-31 20:14:55',96,'EXECUTED','7:42903ec75b4af0cbd4e0fe4c22ce04c3','createIndex','',NULL,'3.1.0'),('dump98','darren (generated)','db/dump.xml','2014-03-31 20:14:55',97,'EXECUTED','7:5c1d95bb342421d5feb552120a1295fe','createIndex','',NULL,'3.1.0'),('dump99','darren (generated)','db/dump.xml','2014-03-31 20:14:55',98,'EXECUTED','7:2f6e73ec7f68d8ee9d79005138b967c6','createIndex','',NULL,'3.1.0'),('dump100','darren (generated)','db/dump.xml','2014-03-31 20:14:55',99,'EXECUTED','7:b532e2d0ea94dc11db68b9549c12efa1','createIndex','',NULL,'3.1.0'),('dump101','darren (generated)','db/dump.xml','2014-03-31 20:14:55',100,'EXECUTED','7:d3c049c295c654b9e0839f6c8bddd80c','createIndex','',NULL,'3.1.0'),('dump102','darren (generated)','db/dump.xml','2014-03-31 20:14:55',101,'EXECUTED','7:f03464e4aae83d1d379184ce9346a842','createIndex','',NULL,'3.1.0'),('dump103','darren (generated)','db/dump.xml','2014-03-31 20:14:55',102,'EXECUTED','7:45498f19b55aac4ba4da98a0eb310e4f','createIndex','',NULL,'3.1.0'),('dump104','darren (generated)','db/dump.xml','2014-03-31 20:14:55',103,'EXECUTED','7:63b8f2409744aa10ff49a5d330971c13','createIndex','',NULL,'3.1.0'),('dump105','darren (generated)','db/dump.xml','2014-03-31 20:14:55',104,'EXECUTED','7:6f5521a54d619702dfbc6ec39773e826','createIndex','',NULL,'3.1.0'),('dump106','darren (generated)','db/dump.xml','2014-03-31 20:14:56',105,'EXECUTED','7:fa8c27912f0935dcbb5bbace991ca0d5','createIndex','',NULL,'3.1.0'),('dump107','darren (generated)','db/dump.xml','2014-03-31 20:14:56',106,'EXECUTED','7:88f7d448158ee36d80b87c9dccd869d5','createIndex','',NULL,'3.1.0'),('dump108','darren (generated)','db/dump.xml','2014-03-31 20:14:56',107,'EXECUTED','7:879cbc1c5af03ee6a71128c87a52d58e','createIndex','',NULL,'3.1.0'),('dump109','darren (generated)','db/dump.xml','2014-03-31 20:14:56',108,'EXECUTED','7:4650ba65b0fbfcf563c1d02ed767ae76','createIndex','',NULL,'3.1.0'),('dump110','darren (generated)','db/dump.xml','2014-03-31 20:14:56',109,'EXECUTED','7:53b6dd2a670711e55c64fa32adcf8c5d','createIndex','',NULL,'3.1.0'),('dump111','darren (generated)','db/dump.xml','2014-03-31 20:14:56',110,'EXECUTED','7:0cc7fc0d9787c101f94d028dbfdfe671','createIndex','',NULL,'3.1.0'),('dump112','darren (generated)','db/dump.xml','2014-03-31 20:14:56',111,'EXECUTED','7:7e57ce35d7ad8809c35010952c69138a','createIndex','',NULL,'3.1.0'),('dump113','darren (generated)','db/dump.xml','2014-03-31 20:14:56',112,'EXECUTED','7:bde8964dfb244a2cc492c351ad5b3646','createIndex','',NULL,'3.1.0'),('dump114','darren (generated)','db/dump.xml','2014-03-31 20:14:56',113,'EXECUTED','7:3a773ea7389aa3e69f4d42b7eaab45b2','createIndex','',NULL,'3.1.0'),('dump115','darren (generated)','db/dump.xml','2014-03-31 20:14:56',114,'EXECUTED','7:e49935cb09f45d66ef47695f4be03adb','createIndex','',NULL,'3.1.0'),('dump116','darren (generated)','db/dump.xml','2014-03-31 20:14:56',115,'EXECUTED','7:0f70001e0870008c99ee88d349d3605a','createIndex','',NULL,'3.1.0'),('dump117','darren (generated)','db/dump.xml','2014-03-31 20:14:56',116,'EXECUTED','7:3896212ef9d6ddc6b316bce32d286d25','createIndex','',NULL,'3.1.0'),('dump118','darren (generated)','db/dump.xml','2014-03-31 20:14:56',117,'EXECUTED','7:12f725998e55d971d46e04c7215577f8','createIndex','',NULL,'3.1.0'),('dump119','darren (generated)','db/dump.xml','2014-03-31 20:14:57',118,'EXECUTED','7:2d5f794ff33877fcca14c2dd49833f6b','createIndex','',NULL,'3.1.0'),('dump120','darren (generated)','db/dump.xml','2014-03-31 20:14:57',119,'EXECUTED','7:c21f6fcceaed54fec7e94b51f5c141ad','createIndex','',NULL,'3.1.0'),('dump121','darren (generated)','db/dump.xml','2014-03-31 20:14:57',120,'EXECUTED','7:31d7b3b105d3fbbab35ad93b28a5090f','createIndex','',NULL,'3.1.0'),('dump122','darren (generated)','db/dump.xml','2014-03-31 20:14:57',121,'EXECUTED','7:dbb9ec62e1ff0dd3de21a0c38d6a9055','createIndex','',NULL,'3.1.0'),('dump123','darren (generated)','db/dump.xml','2014-03-31 20:14:57',122,'EXECUTED','7:74e7656823d69240108f20cf7ca862f4','createIndex','',NULL,'3.1.0'),('dump124','darren (generated)','db/dump.xml','2014-03-31 20:14:57',123,'EXECUTED','7:c2015517d3b144cd9d170285a9eefed0','createIndex','',NULL,'3.1.0'),('dump125','darren (generated)','db/dump.xml','2014-03-31 20:14:57',124,'EXECUTED','7:c8c27a1d5e59d4f7f09ee10636cc741a','createIndex','',NULL,'3.1.0'),('dump126','darren (generated)','db/dump.xml','2014-03-31 20:14:57',125,'EXECUTED','7:7788b730c3b0b3467253e5b553ecb340','createIndex','',NULL,'3.1.0'),('dump127','darren (generated)','db/dump.xml','2014-03-31 20:14:57',126,'EXECUTED','7:8fb62ed17305303e374c399c305921ef','createIndex','',NULL,'3.1.0'),('dump128','darren (generated)','db/dump.xml','2014-03-31 20:14:57',127,'EXECUTED','7:e4eea4584d5ec5c6ab8c3401aba0c246','createIndex','',NULL,'3.1.0'),('dump129','darren (generated)','db/dump.xml','2014-03-31 20:14:57',128,'EXECUTED','7:8bc49e04b385b94640ce54d44d7f5aed','createIndex','',NULL,'3.1.0'),('dump130','darren (generated)','db/dump.xml','2014-03-31 20:14:57',129,'EXECUTED','7:296ca9e8cb12487d6cdc02d24894ed86','createIndex','',NULL,'3.1.0'),('dump131','darren (generated)','db/dump.xml','2014-03-31 20:14:57',130,'EXECUTED','7:a323e4cb4591798df369d800a9a06114','createIndex','',NULL,'3.1.0'),('dump132','darren (generated)','db/dump.xml','2014-03-31 20:14:57',131,'EXECUTED','7:a58954b7300f5025f238c31ec48d6070','createIndex','',NULL,'3.1.0'),('dump133','darren (generated)','db/dump.xml','2014-03-31 20:14:58',132,'EXECUTED','7:3c11c41cb58574ef2ca7db68d764bcc1','createIndex','',NULL,'3.1.0'),('dump134','darren (generated)','db/dump.xml','2014-03-31 20:14:58',133,'EXECUTED','7:6b4005c25a4505ecb09c337a23293d72','createIndex','',NULL,'3.1.0'),('dump135','darren (generated)','db/dump.xml','2014-03-31 20:14:58',134,'EXECUTED','7:784f952cca266edf09be8a3c8a6aa5e0','createIndex','',NULL,'3.1.0'),('dump136','darren (generated)','db/dump.xml','2014-03-31 20:14:58',135,'EXECUTED','7:1d66cb11c56f8e4299cf45435e36a735','createIndex','',NULL,'3.1.0'),('dump137','darren (generated)','db/dump.xml','2014-03-31 20:14:58',136,'EXECUTED','7:de2c8ac23d324dab11bd6df18d8c112a','createIndex','',NULL,'3.1.0'),('dump138','darren (generated)','db/dump.xml','2014-03-31 20:14:58',137,'EXECUTED','7:d7d90e863257d28421d9e546fddb92d7','createIndex','',NULL,'3.1.0'),('dump139','darren (generated)','db/dump.xml','2014-03-31 20:14:58',138,'EXECUTED','7:92be6b3d128936e593f1288fe931dc1f','createIndex','',NULL,'3.1.0'),('dump140','darren (generated)','db/dump.xml','2014-03-31 20:14:58',139,'EXECUTED','7:bd76d39c5b4f958e5a067e03ab273988','createIndex','',NULL,'3.1.0'),('dump141','darren (generated)','db/dump.xml','2014-03-31 20:14:58',140,'EXECUTED','7:ddcf793b9521f46c75b298ae96cb191c','createIndex','',NULL,'3.1.0'),('dump142','darren (generated)','db/dump.xml','2014-03-31 20:14:58',141,'EXECUTED','7:77c417367d4446fee2a4eb047ce4797d','createIndex','',NULL,'3.1.0'),('dump143','darren (generated)','db/dump.xml','2014-03-31 20:14:58',142,'EXECUTED','7:f1f2beef37463db538593c808c2cc694','createIndex','',NULL,'3.1.0'),('dump144','darren (generated)','db/dump.xml','2014-03-31 20:14:58',143,'EXECUTED','7:7791200ddd958a6cd672228de331d37c','createIndex','',NULL,'3.1.0'),('dump145','darren (generated)','db/dump.xml','2014-03-31 20:14:58',144,'EXECUTED','7:9359ae811e9bbb9ed8f42470b35725ac','createIndex','',NULL,'3.1.0'),('dump146','darren (generated)','db/dump.xml','2014-03-31 20:14:58',145,'EXECUTED','7:a89bcc77421e46e0e44752bed5e76417','createIndex','',NULL,'3.1.0'),('dump147','darren (generated)','db/dump.xml','2014-03-31 20:14:59',146,'EXECUTED','7:ead2d45335f0b8adc05fa8d361d8f120','createIndex','',NULL,'3.1.0'),('dump148','darren (generated)','db/dump.xml','2014-03-31 20:14:59',147,'EXECUTED','7:18d4029d37e568f0d11e0f5b88e70738','createIndex','',NULL,'3.1.0'),('dump149','darren (generated)','db/dump.xml','2014-03-31 20:14:59',148,'EXECUTED','7:359a23c691262d085c3f05db0bae4017','createIndex','',NULL,'3.1.0'),('dump150','darren (generated)','db/dump.xml','2014-03-31 20:14:59',149,'EXECUTED','7:5bd182cf00ca276a2448593b6a962d72','createIndex','',NULL,'3.1.0'),('dump151','darren (generated)','db/dump.xml','2014-03-31 20:14:59',150,'EXECUTED','7:cac59da7b071b29eb6e03f8dba2e5840','createIndex','',NULL,'3.1.0'),('dump152','darren (generated)','db/dump.xml','2014-03-31 20:14:59',151,'EXECUTED','7:1de8a10a1d6cada7bc594081a6555856','createIndex','',NULL,'3.1.0'),('dump153','darren (generated)','db/dump.xml','2014-03-31 20:14:59',152,'EXECUTED','7:8707e9de2c73ae74269272f06a61e6e0','createIndex','',NULL,'3.1.0'),('dump154','darren (generated)','db/dump.xml','2014-03-31 20:14:59',153,'EXECUTED','7:359689d2ffbdfb9926f67e2573220c73','createIndex','',NULL,'3.1.0'),('dump155','darren (generated)','db/dump.xml','2014-03-31 20:14:59',154,'EXECUTED','7:b640857fedd3b5b7cd0d19ddf74a9613','createIndex','',NULL,'3.1.0'),('dump156','darren (generated)','db/dump.xml','2014-03-31 20:14:59',155,'EXECUTED','7:0e1e504d4c51ae203eb52f1a75d3c211','createIndex','',NULL,'3.1.0'),('dump157','darren (generated)','db/dump.xml','2014-03-31 20:14:59',156,'EXECUTED','7:a60cf8d1129602f3d4d3720f018481df','createIndex','',NULL,'3.1.0'),('dump158','darren (generated)','db/dump.xml','2014-03-31 20:14:59',157,'EXECUTED','7:a6dcdc82dbcbc5e156bac27aec2b46c8','createIndex','',NULL,'3.1.0'),('dump159','darren (generated)','db/dump.xml','2014-03-31 20:14:59',158,'EXECUTED','7:aec2d117078daec21bb5d2e886447493','createIndex','',NULL,'3.1.0'),('dump160','darren (generated)','db/dump.xml','2014-03-31 20:14:59',159,'EXECUTED','7:74c6c271f5479776bda9b3816363a08d','createIndex','',NULL,'3.1.0'),('dump161','darren (generated)','db/dump.xml','2014-03-31 20:14:59',160,'EXECUTED','7:5b239073066176b78afc445dc0bfe976','createIndex','',NULL,'3.1.0'),('dump162','darren (generated)','db/dump.xml','2014-03-31 20:15:00',161,'EXECUTED','7:5f1429576deb624cac429cd41169f944','createIndex','',NULL,'3.1.0'),('dump163','darren (generated)','db/dump.xml','2014-03-31 20:15:00',162,'EXECUTED','7:07493fc8ab0ca10fbd4efe4866b2209e','createIndex','',NULL,'3.1.0'),('dump164','darren (generated)','db/dump.xml','2014-03-31 20:15:00',163,'EXECUTED','7:03ce60c693fdb4c2ff6fcacb5f22a4e9','createIndex','',NULL,'3.1.0'),('dump165','darren (generated)','db/dump.xml','2014-03-31 20:15:00',164,'EXECUTED','7:300f3f029c0ec3d6ae1c612a62c4ee8e','createIndex','',NULL,'3.1.0'),('config-item','darren (generated)','db/config-item.xml','2014-03-31 20:15:00',165,'EXECUTED','7:15d69a612d8c648c8d8436d390ebe7d8','addForeignKeyConstraint','',NULL,'3.1.0'),('sql1','darren','db/data.sql','2014-03-31 20:15:00',166,'EXECUTED','7:c05338a691f3799259443224f0966393','sql','',NULL,'3.1.0');
/*!40000 ALTER TABLE `DATABASECHANGELOG` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DATABASECHANGELOGLOCK`
--

DROP TABLE IF EXISTS `DATABASECHANGELOGLOCK`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DATABASECHANGELOGLOCK` (
  `ID` int(11) NOT NULL,
  `LOCKED` bit(1) NOT NULL,
  `LOCKGRANTED` datetime DEFAULT NULL,
  `LOCKEDBY` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DATABASECHANGELOGLOCK`
--

LOCK TABLES `DATABASECHANGELOGLOCK` WRITE;
/*!40000 ALTER TABLE `DATABASECHANGELOGLOCK` DISABLE KEYS */;
INSERT INTO `DATABASECHANGELOGLOCK` VALUES (1,'\0',NULL,NULL);
/*!40000 ALTER TABLE `DATABASECHANGELOGLOCK` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_account_uuid` (`uuid`),
  KEY `idx_account_name` (`name`),
  KEY `idx_account_remove_time` (`remove_time`),
  KEY `idx_account_removed` (`removed`),
  KEY `idx_account_state` (`state`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,'admin','admin','admin',NULL,'active',NULL,NULL,NULL,NULL),(2,'system','system','system',NULL,'inactive',NULL,NULL,NULL,NULL),(3,'superadmin','superadmin','superadmin',NULL,'inactive',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `agent`
--

DROP TABLE IF EXISTS `agent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `agent` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `account_id` bigint(20) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `uri` varchar(255) DEFAULT NULL,
  `managed_config` bit(1) NOT NULL DEFAULT b'1',
  `agent_group_id` bigint(20) DEFAULT NULL,
  `zone_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_agent_uuid` (`uuid`),
  KEY `fk_agent__account_id` (`account_id`),
  KEY `fk_agent__agent_group_id` (`agent_group_id`),
  KEY `fk_agent__zone_id` (`zone_id`),
  KEY `idx_agent_name` (`name`),
  KEY `idx_agent_remove_time` (`remove_time`),
  KEY `idx_agent_removed` (`removed`),
  KEY `idx_agent_state` (`state`),
  CONSTRAINT `fk_agent__zone_id` FOREIGN KEY (`zone_id`) REFERENCES `zone` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_agent__account_id` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_agent__agent_group_id` FOREIGN KEY (`agent_group_id`) REFERENCES `agent_group` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agent`
--

LOCK TABLES `agent` WRITE;
/*!40000 ALTER TABLE `agent` DISABLE KEYS */;
/*!40000 ALTER TABLE `agent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `agent_group`
--

DROP TABLE IF EXISTS `agent_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `agent_group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `account_id` bigint(20) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_agent_group_uuid` (`uuid`),
  KEY `fk_agent_group__account_id` (`account_id`),
  KEY `idx_agent_group_name` (`name`),
  KEY `idx_agent_group_remove_time` (`remove_time`),
  KEY `idx_agent_group_removed` (`removed`),
  KEY `idx_agent_group_state` (`state`),
  CONSTRAINT `fk_agent_group__account_id` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agent_group`
--

LOCK TABLES `agent_group` WRITE;
/*!40000 ALTER TABLE `agent_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `agent_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config_item`
--

DROP TABLE IF EXISTS `config_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config_item` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `source_version` varchar(1024) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_config_item__name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config_item`
--

LOCK TABLES `config_item` WRITE;
/*!40000 ALTER TABLE `config_item` DISABLE KEYS */;
INSERT INTO `config_item` VALUES (1,'bootstrap','e689a81269ed7bfc985d72ad61414ef56751d0a44525c93c05f75179b47a14ed'),(2,'configscripts','4d95687c7537e5363e77a56eb9f5f27dfb05fd6a2b0f10423b478d69da920f96'),(3,'pyagent','1e6dc31f588b2ef4253dbf9e61747851a49d64052c1b7d49854f790797e2da13');
/*!40000 ALTER TABLE `config_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config_item_status`
--

DROP TABLE IF EXISTS `config_item_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config_item_status` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `requested_version` bigint(20) NOT NULL DEFAULT '0',
  `applied_version` bigint(20) NOT NULL DEFAULT '-1',
  `source_version` varchar(255) DEFAULT NULL,
  `requested_updated` datetime NOT NULL,
  `applied_updated` datetime DEFAULT NULL,
  `agent_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_config_item_status_name_agent_id` (`name`,`agent_id`),
  KEY `fk_config_item__agent_id` (`agent_id`),
  KEY `idx_config_item_source_version` (`source_version`),
  CONSTRAINT `fk_config_item__name` FOREIGN KEY (`name`) REFERENCES `config_item` (`name`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_config_item__agent_id` FOREIGN KEY (`agent_id`) REFERENCES `agent` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config_item_status`
--

LOCK TABLES `config_item_status` WRITE;
/*!40000 ALTER TABLE `config_item_status` DISABLE KEYS */;
/*!40000 ALTER TABLE `config_item_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `credential`
--

DROP TABLE IF EXISTS `credential`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `credential` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `account_id` bigint(20) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `public_value` varchar(4096) DEFAULT NULL,
  `secret_value` varchar(4096) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_credential_uuid` (`uuid`),
  KEY `fk_credential__account_id` (`account_id`),
  KEY `idx_credential_name` (`name`),
  KEY `idx_credential_remove_time` (`remove_time`),
  KEY `idx_credential_removed` (`removed`),
  KEY `idx_credential_state` (`state`),
  CONSTRAINT `fk_credential__account_id` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credential`
--

LOCK TABLES `credential` WRITE;
/*!40000 ALTER TABLE `credential` DISABLE KEYS */;
/*!40000 ALTER TABLE `credential` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `data`
--

DROP TABLE IF EXISTS `data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `visible` bit(1) NOT NULL DEFAULT b'1',
  `value` text NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_data_name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data`
--

LOCK TABLES `data` WRITE;
/*!40000 ALTER TABLE `data` DISABLE KEYS */;
INSERT INTO `data` VALUES (1,'ssh-client-key1-public','','ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCmZbMhrnsHm/rFYeeDo20QGpzPtpCAeLpzW32NJj5g71A4LJMzbyKdQDW2aKTXWrMqpGNM24ssA/Q2Wa6ckcQ5UgUzsZCUVJhMJivu5XCLL/S/zwzaSbEpDeV+ZxLk45PEK+Mk+tTq4bWnqYnziO2dlKoBWpWvpDpL9LTdVSBJOCos3D/9qa6QBESv8P6ZxH+FwkMIJoUnLCNnKJDSbuoPbKwE01U1/gH4PD/QwTToOlFJCvHFVtx5DZ3FqIfqkqXKvm+beOSTDYmOZtkBAEH/icJRZoVTIj/ncTIC9iT79+L5Dm9c7oZeTR1n0e/GfaMTI6jENyaluDIguTsA00d9 cattle@cattle'),(2,'ssh-client-key1-private','\0','LS0tLS1CRUdJTiBSU0EgUFJJVkFURSBLRVktLS0tLQpNSUlFcEFJQkFBS0NBUUVBcG1XeklhNTdCNXY2eFdIbmc2TnRFQnFjejdhUWdIaTZjMXQ5alNZK1lPOVFPQ3lUCk0yOGluVUExdG1pazExcXpLcVJqVE51TExBUDBObG11bkpIRU9WSUZNN0dRbEZTWVRDWXI3dVZ3aXkvMHY4OE0KMmtteEtRM2xmbWNTNU9PVHhDdmpKUHJVNnVHMXA2bUo4NGp0blpTcUFWcVZyNlE2Uy9TMDNWVWdTVGdxTE53LwovYW11a0FSRXIvRCttY1IvaGNKRENDYUZKeXdqWnlpUTBtN3FEMnlzQk5OVk5mNEIrRHcvME1FMDZEcFJTUXJ4CnhWYmNlUTJkeGFpSDZwS2x5cjV2bTNqa2t3MkpqbWJaQVFCQi80bkNVV2FGVXlJLzUzRXlBdllrKy9maStRNXYKWE82R1hrMGRaOUh2eG4yakV5T294RGNtcGJneUlMazdBTk5IZlFJREFRQUJBb0lCQVFDYkhuM0NyV3lGNkhQNwpvOHgybkZoa3hkcGZqTnJpMlNrL3R3K3hFUERmM3RqU3RVTTRsS2NaSHkyemNaUVNLcnlSeVJQRkozbHpPL0JpCjVuSHdCYmQrbENiRFRRbnlMWGFZcnBFUU1SWWN1MFVYdG9aTnpKcjZJYmxLZi81T0lKVzFNQkNkZmJRVmp2cVEKWlcxeitiZEJ5c0E5YU52WUZHcEFPc3lNOVBtWEp1SllCU0V5dkdDOXFlZzVTbmdJbVZJUWcyMVU5RlUvdnNyRQpRUFV1RU84bkJsYlRtNzFuRFY5d05pZDFkMU5PZnpjQmxtdE5LT0FRdGNhL285MEswc2RCdGRpOVE0RHdqK0dFClE0dXZjZnVneHBaNnhVSFA2MTFvWXRJbTZPbHBmSS90S0dWYjB2SWdzdForUkp2aUNmMjBjdE1wY2E1OStUT24KM1R6TkRDSkJBb0dCQU5tZ1N0Q3lhdmt0aW1ldGQ0UzhvcWNsbktxanhzTlJxeXppQzZmS3lOSjIzWDhlM1BuZAptbWpHRlJnVWpuV1lITEhBQ3BxOG1JeTc4MmNnZDVXbll4UGRJaHM2c3U3dktSTUpYTXR5elAra2IzYUVtT1NaCllUQnN0cmpXbitZcE01ZU5RcnRFVTlBdFJaYzZGNm45d3dRTTlBQmY2bGJrVFoyZktUL1I3eGZ0QW9HQkFNTzgKNjhVdlkrdHZENGQ1Y0l5dmxWTUFtWmJEd3RWZlg2UHdmT09hZlZJV1NMYXprN2xJTFpuOFE3bXdpOVBmL3hoeQp3Z3Q0VFd3bmRXY2JlbFNmMlRzUU9LT0dzcDNpZVVnWWpQZXFlaUN2T1dQMWpMK2ozMGh4SlB4Z3NvTWRDdE9SCjhTRFBUL2FHYStsN1M4MDRtRno4SG56cy8xa0FyVTkrU1VDSXJkdlJBb0dBWWpZOGpVSjNsRXhCRWRqdS96QkMKRnp5YUgwZ2FBenR3REtsV3FUcVN0cWg5L1Vob1lUcm8zQy9JaFQyQnJRQWdzdmIvMGlVYWt5aWZDQU5XOUdxKwpBOURmKzNuYUZvcEg5eGRha1ZZVnZhanZ4SVRDbXllOC9LV1RNSWRyVWV0MkpRYlMvc0F2TXR1N2RDdjdVZlA3CmRuQ0NEVWs3OEVySDNFSmYwelZpdVdFQ2dZRUF3VmU0VDhNYTRMQ0lWMW8yT1ZFcW41MUZHTzN2WXRKZFoxTWkKR2JROU83czFRZnFwM1dlVlc3Z1pzYTdZdjRWUHRmZU5Bc1ZuUElEUmIvSnRhRytvcExYR0xJamRvQ1RYaGNaeQpZQ1V0azJGaHdBSUpjRGJQVkFBbTk0QVFkSUJZZEZtQkk5YURkdENhZ1RzL3ljdXdmSkN4RU5jTTl2NDdNdjFjCkgvbWlPakVDZ1lCbm5VNTdEZUxWTHJIWEdXTjZKRzRDYjdDR3dmb1Y0c1N0Zk5MN3lBdmtlKzNKVlVLSm1LU2UKYi8yTGhGK3JHSHY0aWVIU3ozUzRlUTVLSzl4eUNpYkV5djk4N1l4bFZ6cGxIcDV3b25oUzJJV0JmcGtWK0RvRApzUStsUlRPREZvSlR2NHQwWU9US3NKYVZXUDhuQXBHN1hkOG1ITTlrQkVXSGtOdENJNGdPSVE9PQotLS0tLUVORCBSU0EgUFJJVkFURSBLRVktLS0tLQo=');
/*!40000 ALTER TABLE `data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `external_handler`
--

DROP TABLE IF EXISTS `external_handler`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `external_handler` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `priority` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_external_handler_uuid` (`uuid`),
  KEY `idx_external_handler_name` (`name`),
  KEY `idx_external_handler_remove_time` (`remove_time`),
  KEY `idx_external_handler_removed` (`removed`),
  KEY `idx_external_handler_state` (`state`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `external_handler`
--

LOCK TABLES `external_handler` WRITE;
/*!40000 ALTER TABLE `external_handler` DISABLE KEYS */;
/*!40000 ALTER TABLE `external_handler` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `external_handler_external_handler_process_map`
--

DROP TABLE IF EXISTS `external_handler_external_handler_process_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `external_handler_external_handler_process_map` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `external_handler_id` bigint(20) DEFAULT NULL,
  `external_handler_process_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_eh_eh_process_map_uuid` (`uuid`),
  KEY `fk_eh_eh_process_map__external_handler_id` (`external_handler_id`),
  KEY `fk_eh_eh_process_map__external_handler_process_id` (`external_handler_process_id`),
  KEY `idx_eh_eh_process_map_name` (`name`),
  KEY `idx_eh_eh_process_map_remove_time` (`remove_time`),
  KEY `idx_eh_eh_process_map_removed` (`removed`),
  KEY `idx_eh_eh_process_map_state` (`state`),
  CONSTRAINT `fk_eh_eh_process_map__external_handler_process_id` FOREIGN KEY (`external_handler_process_id`) REFERENCES `external_handler_process` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_eh_eh_process_map__external_handler_id` FOREIGN KEY (`external_handler_id`) REFERENCES `external_handler` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `external_handler_external_handler_process_map`
--

LOCK TABLES `external_handler_external_handler_process_map` WRITE;
/*!40000 ALTER TABLE `external_handler_external_handler_process_map` DISABLE KEYS */;
/*!40000 ALTER TABLE `external_handler_external_handler_process_map` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `external_handler_process`
--

DROP TABLE IF EXISTS `external_handler_process`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `external_handler_process` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_external_handler_process_uuid` (`uuid`),
  KEY `idx_external_handler_process_name` (`name`),
  KEY `idx_external_handler_process_remove_time` (`remove_time`),
  KEY `idx_external_handler_process_removed` (`removed`),
  KEY `idx_external_handler_process_state` (`state`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `external_handler_process`
--

LOCK TABLES `external_handler_process` WRITE;
/*!40000 ALTER TABLE `external_handler_process` DISABLE KEYS */;
/*!40000 ALTER TABLE `external_handler_process` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `host`
--

DROP TABLE IF EXISTS `host`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `host` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `account_id` bigint(20) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `uri` varchar(255) DEFAULT NULL,
  `compute_free` bigint(20) DEFAULT NULL,
  `compute_total` bigint(20) DEFAULT NULL,
  `agent_id` bigint(20) DEFAULT NULL,
  `zone_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_host_uuid` (`uuid`),
  KEY `fk_host__account_id` (`account_id`),
  KEY `fk_host__agent_id` (`agent_id`),
  KEY `fk_host__zone_id` (`zone_id`),
  KEY `idx_host_compute_free` (`compute_free`),
  KEY `idx_host_name` (`name`),
  KEY `idx_host_remove_time` (`remove_time`),
  KEY `idx_host_removed` (`removed`),
  KEY `idx_host_state` (`state`),
  CONSTRAINT `fk_host__zone_id` FOREIGN KEY (`zone_id`) REFERENCES `zone` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_host__account_id` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_host__agent_id` FOREIGN KEY (`agent_id`) REFERENCES `agent` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `host`
--

LOCK TABLES `host` WRITE;
/*!40000 ALTER TABLE `host` DISABLE KEYS */;
/*!40000 ALTER TABLE `host` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `image`
--

DROP TABLE IF EXISTS `image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `image` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `account_id` bigint(20) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `url` varchar(255) DEFAULT NULL,
  `is_public` bit(1) NOT NULL DEFAULT b'0',
  `physical_size_mb` bigint(20) DEFAULT NULL,
  `virtual_size_mb` bigint(20) DEFAULT NULL,
  `checksum` varchar(255) DEFAULT NULL,
  `format` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_image_uuid` (`uuid`),
  KEY `fk_image__account_id` (`account_id`),
  KEY `idx_image_name` (`name`),
  KEY `idx_image_remove_time` (`remove_time`),
  KEY `idx_image_removed` (`removed`),
  KEY `idx_image_state` (`state`),
  CONSTRAINT `fk_image__account_id` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `image`
--

LOCK TABLES `image` WRITE;
/*!40000 ALTER TABLE `image` DISABLE KEYS */;
/*!40000 ALTER TABLE `image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `image_storage_pool_map`
--

DROP TABLE IF EXISTS `image_storage_pool_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `image_storage_pool_map` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `image_id` bigint(20) DEFAULT NULL,
  `storage_pool_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_image_storage_pool_map_uuid` (`uuid`),
  KEY `fk_image_storage_pool_map__image_id` (`image_id`),
  KEY `fk_image_storage_pool_map__storage_pool_id` (`storage_pool_id`),
  KEY `idx_image_storage_pool_map_name` (`name`),
  KEY `idx_image_storage_pool_map_remove_time` (`remove_time`),
  KEY `idx_image_storage_pool_map_removed` (`removed`),
  KEY `idx_image_storage_pool_map_state` (`state`),
  CONSTRAINT `fk_image_storage_pool_map__storage_pool_id` FOREIGN KEY (`storage_pool_id`) REFERENCES `storage_pool` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_image_storage_pool_map__image_id` FOREIGN KEY (`image_id`) REFERENCES `image` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `image_storage_pool_map`
--

LOCK TABLES `image_storage_pool_map` WRITE;
/*!40000 ALTER TABLE `image_storage_pool_map` DISABLE KEYS */;
/*!40000 ALTER TABLE `image_storage_pool_map` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `instance`
--

DROP TABLE IF EXISTS `instance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `instance` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `account_id` bigint(20) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `allocation_state` varchar(255) DEFAULT NULL,
  `compute` bigint(20) DEFAULT NULL,
  `memory_mb` bigint(20) DEFAULT NULL,
  `image_id` bigint(20) DEFAULT NULL,
  `offering_id` bigint(20) DEFAULT NULL,
  `hostname` varchar(255) DEFAULT NULL,
  `zone_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_instance_uuid` (`uuid`),
  KEY `fk_instance__account_id` (`account_id`),
  KEY `fk_instance__image_id` (`image_id`),
  KEY `fk_instance__offering_id` (`offering_id`),
  KEY `fk_instance__zone_id` (`zone_id`),
  KEY `idx_instance_name` (`name`),
  KEY `idx_instance_remove_time` (`remove_time`),
  KEY `idx_instance_removed` (`removed`),
  KEY `idx_instance_state` (`state`),
  CONSTRAINT `fk_instance__zone_id` FOREIGN KEY (`zone_id`) REFERENCES `zone` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_instance__account_id` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_instance__image_id` FOREIGN KEY (`image_id`) REFERENCES `image` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_instance__offering_id` FOREIGN KEY (`offering_id`) REFERENCES `offering` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instance`
--

LOCK TABLES `instance` WRITE;
/*!40000 ALTER TABLE `instance` DISABLE KEYS */;
/*!40000 ALTER TABLE `instance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `instance_host_map`
--

DROP TABLE IF EXISTS `instance_host_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `instance_host_map` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `instance_id` bigint(20) DEFAULT NULL,
  `host_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_instance_host_map_uuid` (`uuid`),
  KEY `fk_instance_host_map__host_id` (`host_id`),
  KEY `fk_instance_host_map__instance_id` (`instance_id`),
  KEY `idx_instance_host_map_name` (`name`),
  KEY `idx_instance_host_map_remove_time` (`remove_time`),
  KEY `idx_instance_host_map_removed` (`removed`),
  KEY `idx_instance_host_map_state` (`state`),
  CONSTRAINT `fk_instance_host_map__instance_id` FOREIGN KEY (`instance_id`) REFERENCES `instance` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_instance_host_map__host_id` FOREIGN KEY (`host_id`) REFERENCES `host` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instance_host_map`
--

LOCK TABLES `instance_host_map` WRITE;
/*!40000 ALTER TABLE `instance_host_map` DISABLE KEYS */;
/*!40000 ALTER TABLE `instance_host_map` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `offering`
--

DROP TABLE IF EXISTS `offering`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `offering` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `account_id` bigint(20) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `is_public` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_offering_uuid` (`uuid`),
  KEY `fk_offering__account_id` (`account_id`),
  KEY `idx_offering_name` (`name`),
  KEY `idx_offering_remove_time` (`remove_time`),
  KEY `idx_offering_removed` (`removed`),
  KEY `idx_offering_state` (`state`),
  CONSTRAINT `fk_offering__account_id` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `offering`
--

LOCK TABLES `offering` WRITE;
/*!40000 ALTER TABLE `offering` DISABLE KEYS */;
/*!40000 ALTER TABLE `offering` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `process_execution`
--

DROP TABLE IF EXISTS `process_execution`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `process_execution` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `process_instance_id` bigint(20) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `log` mediumtext,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_process_execution__uuid` (`uuid`),
  KEY `fk_process_execution_process_instance_id` (`process_instance_id`),
  CONSTRAINT `fk_process_execution_process_instance_id` FOREIGN KEY (`process_instance_id`) REFERENCES `process_instance` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `process_execution`
--

LOCK TABLES `process_execution` WRITE;
/*!40000 ALTER TABLE `process_execution` DISABLE KEYS */;
/*!40000 ALTER TABLE `process_execution` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `process_instance`
--

DROP TABLE IF EXISTS `process_instance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `process_instance` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `data` text,
  `priority` int(11) DEFAULT '0',
  `process_name` varchar(128) DEFAULT NULL,
  `resource_type` varchar(128) DEFAULT NULL,
  `resource_id` varchar(128) DEFAULT NULL,
  `result` varchar(128) DEFAULT NULL,
  `exit_reason` varchar(128) DEFAULT NULL,
  `phase` varchar(128) DEFAULT NULL,
  `start_process_server_id` varchar(128) DEFAULT NULL,
  `running_process_server_id` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_process_instance_end_time` (`end_time`),
  KEY `idx_process_instance_et_rt_ri` (`end_time`,`resource_type`,`resource_id`),
  KEY `idx_process_instance_priority` (`priority`),
  KEY `idx_process_instance_start_time` (`start_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `process_instance`
--

LOCK TABLES `process_instance` WRITE;
/*!40000 ALTER TABLE `process_instance` DISABLE KEYS */;
/*!40000 ALTER TABLE `process_instance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `setting`
--

DROP TABLE IF EXISTS `setting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `setting` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `value` varchar(1024) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_setting_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `setting`
--

LOCK TABLES `setting` WRITE;
/*!40000 ALTER TABLE `setting` DISABLE KEYS */;
/*!40000 ALTER TABLE `setting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storage_pool`
--

DROP TABLE IF EXISTS `storage_pool`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storage_pool` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `account_id` bigint(20) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `physical_total_size_mb` bigint(20) DEFAULT NULL,
  `virtual_total_size_mb` bigint(20) DEFAULT NULL,
  `external` bit(1) NOT NULL DEFAULT b'0',
  `agent_id` bigint(20) DEFAULT NULL,
  `zone_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_storage_pool_uuid` (`uuid`),
  KEY `fk_storage_pool__account_id` (`account_id`),
  KEY `fk_storage_pool__agent_id` (`agent_id`),
  KEY `fk_storage_pool__zone_id` (`zone_id`),
  KEY `idx_storage_pool_name` (`name`),
  KEY `idx_storage_pool_remove_time` (`remove_time`),
  KEY `idx_storage_pool_removed` (`removed`),
  KEY `idx_storage_pool_state` (`state`),
  CONSTRAINT `fk_storage_pool__zone_id` FOREIGN KEY (`zone_id`) REFERENCES `zone` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_storage_pool__account_id` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_storage_pool__agent_id` FOREIGN KEY (`agent_id`) REFERENCES `agent` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storage_pool`
--

LOCK TABLES `storage_pool` WRITE;
/*!40000 ALTER TABLE `storage_pool` DISABLE KEYS */;
/*!40000 ALTER TABLE `storage_pool` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storage_pool_host_map`
--

DROP TABLE IF EXISTS `storage_pool_host_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storage_pool_host_map` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `storage_pool_id` bigint(20) DEFAULT NULL,
  `host_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_storage_pool_host_map_uuid` (`uuid`),
  KEY `fk_storage_pool_host_map__host_id` (`host_id`),
  KEY `fk_storage_pool_host_map__storage_pool_id` (`storage_pool_id`),
  KEY `idx_storage_pool_host_map_name` (`name`),
  KEY `idx_storage_pool_host_map_remove_time` (`remove_time`),
  KEY `idx_storage_pool_host_map_removed` (`removed`),
  KEY `idx_storage_pool_host_map_state` (`state`),
  CONSTRAINT `fk_storage_pool_host_map__storage_pool_id` FOREIGN KEY (`storage_pool_id`) REFERENCES `storage_pool` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_storage_pool_host_map__host_id` FOREIGN KEY (`host_id`) REFERENCES `host` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storage_pool_host_map`
--

LOCK TABLES `storage_pool_host_map` WRITE;
/*!40000 ALTER TABLE `storage_pool_host_map` DISABLE KEYS */;
/*!40000 ALTER TABLE `storage_pool_host_map` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task`
--

DROP TABLE IF EXISTS `task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `task` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_task_name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task`
--

LOCK TABLES `task` WRITE;
/*!40000 ALTER TABLE `task` DISABLE KEYS */;
INSERT INTO `task` VALUES (2,'agent.ping'),(3,'cleanup.task.instances'),(4,'process.replay'),(1,'purge.resources'),(5,'resource.change.publish');
/*!40000 ALTER TABLE `task` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task_instance`
--

DROP TABLE IF EXISTS `task_instance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `task_instance` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) NOT NULL,
  `task_id` bigint(20) NOT NULL,
  `start_time` datetime NOT NULL,
  `end_time` datetime DEFAULT NULL,
  `exception` varchar(255) DEFAULT NULL,
  `server_id` varchar(128) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_task_instance__task_id` (`task_id`),
  CONSTRAINT `fk_task_instance__task_id` FOREIGN KEY (`task_id`) REFERENCES `task` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task_instance`
--

LOCK TABLES `task_instance` WRITE;
/*!40000 ALTER TABLE `task_instance` DISABLE KEYS */;
/*!40000 ALTER TABLE `task_instance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `volume`
--

DROP TABLE IF EXISTS `volume`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `volume` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `account_id` bigint(20) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `physical_size_mb` bigint(20) DEFAULT NULL,
  `virtual_size_mb` bigint(20) DEFAULT NULL,
  `device_number` int(11) DEFAULT NULL,
  `format` varchar(255) DEFAULT NULL,
  `allocation_state` varchar(255) DEFAULT NULL,
  `attached_state` varchar(255) DEFAULT NULL,
  `instance_id` bigint(20) DEFAULT NULL,
  `image_id` bigint(20) DEFAULT NULL,
  `offering_id` bigint(20) DEFAULT NULL,
  `zone_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_volume_uuid` (`uuid`),
  KEY `fk_volume__account_id` (`account_id`),
  KEY `fk_volume__image_id` (`image_id`),
  KEY `fk_volume__instance_id` (`instance_id`),
  KEY `fk_volume__offering_id` (`offering_id`),
  KEY `fk_volume__zone_id` (`zone_id`),
  KEY `idx_volume_name` (`name`),
  KEY `idx_volume_remove_time` (`remove_time`),
  KEY `idx_volume_removed` (`removed`),
  KEY `idx_volume_state` (`state`),
  CONSTRAINT `fk_volume__zone_id` FOREIGN KEY (`zone_id`) REFERENCES `zone` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_volume__account_id` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_volume__image_id` FOREIGN KEY (`image_id`) REFERENCES `image` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_volume__instance_id` FOREIGN KEY (`instance_id`) REFERENCES `instance` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_volume__offering_id` FOREIGN KEY (`offering_id`) REFERENCES `offering` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `volume`
--

LOCK TABLES `volume` WRITE;
/*!40000 ALTER TABLE `volume` DISABLE KEYS */;
/*!40000 ALTER TABLE `volume` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `volume_storage_pool_map`
--

DROP TABLE IF EXISTS `volume_storage_pool_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `volume_storage_pool_map` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `volume_id` bigint(20) DEFAULT NULL,
  `storage_pool_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_volume_storage_pool_map_uuid` (`uuid`),
  KEY `fk_volume_storage_pool_map__storage_pool_id` (`storage_pool_id`),
  KEY `fk_volume_storage_pool_map__volume_id` (`volume_id`),
  KEY `idx_volume_storage_pool_map_name` (`name`),
  KEY `idx_volume_storage_pool_map_remove_time` (`remove_time`),
  KEY `idx_volume_storage_pool_map_removed` (`removed`),
  KEY `idx_volume_storage_pool_map_state` (`state`),
  CONSTRAINT `fk_volume_storage_pool_map__volume_id` FOREIGN KEY (`volume_id`) REFERENCES `volume` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_volume_storage_pool_map__storage_pool_id` FOREIGN KEY (`storage_pool_id`) REFERENCES `storage_pool` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `volume_storage_pool_map`
--

LOCK TABLES `volume_storage_pool_map` WRITE;
/*!40000 ALTER TABLE `volume_storage_pool_map` DISABLE KEYS */;
/*!40000 ALTER TABLE `volume_storage_pool_map` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zone`
--

DROP TABLE IF EXISTS `zone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zone` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `account_id` bigint(20) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_zone_uuid` (`uuid`),
  KEY `fk_zone__account_id` (`account_id`),
  KEY `idx_zone_name` (`name`),
  KEY `idx_zone_remove_time` (`remove_time`),
  KEY `idx_zone_removed` (`removed`),
  KEY `idx_zone_state` (`state`),
  CONSTRAINT `fk_zone__account_id` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zone`
--

LOCK TABLES `zone` WRITE;
/*!40000 ALTER TABLE `zone` DISABLE KEYS */;
INSERT INTO `zone` VALUES (1,'zone1',NULL,'zone','zone1',NULL,'active',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `zone` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-03-31 21:17:07
