-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.16-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for property
CREATE DATABASE IF NOT EXISTS `property` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `property`;

-- Dumping structure for table property.accounts
CREATE TABLE IF NOT EXISTS `accounts` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(20) NOT NULL DEFAULT '0',
  `package_id` int(20) NOT NULL DEFAULT '0',
  `account_type_id` int(20) NOT NULL DEFAULT '0',
  `parent_id` int(20) NOT NULL DEFAULT '0',
  `status` enum('ACTIVE','DEACTIVATED','PENDING') NOT NULL DEFAULT 'PENDING',
  `date_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_by` int(20) NOT NULL,
  `date_updated` datetime DEFAULT NULL,
  `updated_by` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `AC_USER` (`user_id`),
  KEY `AC_PACKAGE` (`package_id`),
  KEY `AC_ACCOUNT_TYPE` (`account_type_id`),
  CONSTRAINT `AC_ACCOUNT_TYPE` FOREIGN KEY (`account_type_id`) REFERENCES `account_types` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `AC_PACKAGE` FOREIGN KEY (`package_id`) REFERENCES `packages` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `AC_USER` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Manage System Accounts. this is a fundamental part of the application';

-- Dumping data for table property.accounts: ~0 rows (approximately)
DELETE FROM `accounts`;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;

-- Dumping structure for table property.account_types
CREATE TABLE IF NOT EXISTS `account_types` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `account_type` varchar(255) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `account_type` (`account_type`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='Account Types eg Personal, Company, Broker, it helps in classifying accounts : ';

-- Dumping data for table property.account_types: ~3 rows (approximately)
DELETE FROM `account_types`;
/*!40000 ALTER TABLE `account_types` DISABLE KEYS */;
INSERT INTO `account_types` (`id`, `account_type`) VALUES
	(2, 'COMPANY'),
	(4, 'GROUP'),
	(1, 'NORMAL');
/*!40000 ALTER TABLE `account_types` ENABLE KEYS */;

-- Dumping structure for table property.address
CREATE TABLE IF NOT EXISTS `address` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `location` varchar(255) NOT NULL DEFAULT '0',
  `lat` varchar(255) NOT NULL DEFAULT '0',
  `lng` varchar(255) NOT NULL DEFAULT '0',
  `createdby` int(20) NOT NULL DEFAULT '0',
  `datecreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updatedby` int(20) DEFAULT NULL,
  `dateupdated` datetime DEFAULT NULL,
  `status` enum('ACTIVE','ARCHIVED') NOT NULL DEFAULT 'ACTIVE',
  `parent_type` varchar(255) DEFAULT NULL,
  `parent_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `CreatedBy` (`createdby`),
  KEY `UpdatedBy` (`updatedby`),
  FULLTEXT KEY `location` (`location`),
  CONSTRAINT `CreatedBy` FOREIGN KEY (`createdby`) REFERENCES `user` (`id`),
  CONSTRAINT `UpdatedBy` FOREIGN KEY (`updatedby`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='Manage All Addresses in the System';

-- Dumping data for table property.address: ~2 rows (approximately)
DELETE FROM `address`;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` (`id`, `location`, `lat`, `lng`, `createdby`, `datecreated`, `updatedby`, `dateupdated`, `status`, `parent_type`, `parent_id`) VALUES
	(2, 'Kampala,Uganda', '234.45', '456.78', 2, '2017-06-07 00:40:53', 2, '2017-05-31 13:23:55', 'ACTIVE', 'PERSON', 1),
	(3, 'Kamuli,Uganda', '323323', '722923', 1, '2017-06-08 19:47:10', NULL, NULL, 'ACTIVE', 'PERSON', 1);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;

-- Dumping structure for table property.contacts
CREATE TABLE IF NOT EXISTS `contacts` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) NOT NULL,
  `details` varchar(255) NOT NULL,
  `created_by` int(20) NOT NULL,
  `date_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(20) DEFAULT NULL,
  `date_updated` datetime DEFAULT NULL,
  `status` enum('ACTIVE','ARCHIVED') NOT NULL DEFAULT 'ACTIVE',
  `parent_type` varchar(255) NOT NULL,
  `parent_id` int(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `CC_CreatedBy` (`created_by`),
  KEY `CC_UpdatedBy` (`updated_by`),
  CONSTRAINT `CC_CreatedBy` FOREIGN KEY (`created_by`) REFERENCES `user` (`id`),
  CONSTRAINT `CC_UpdatedBy` FOREIGN KEY (`updated_by`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='Manage System Level Contacts \r\nWebsites, Phone,Fax,Social Media, Etc';

-- Dumping data for table property.contacts: ~4 rows (approximately)
DELETE FROM `contacts`;
/*!40000 ALTER TABLE `contacts` DISABLE KEYS */;
INSERT INTO `contacts` (`id`, `type`, `details`, `created_by`, `date_created`, `updated_by`, `date_updated`, `status`, `parent_type`, `parent_id`) VALUES
	(1, 'PHONE', '+256779820968', 1, '2017-06-09 14:03:42', 1, '2017-06-09 14:03:42', 'ACTIVE', 'PERSON', 1),
	(2, 'EMAIL', 'mover@gmail.com', 5, '2017-06-15 23:53:44', NULL, NULL, 'ACTIVE', 'PERSON', 10),
	(3, 'EMAIL', 'egulwa@gmail.com', 6, '2017-06-16 13:33:04', NULL, NULL, 'ACTIVE', 'PERSON', 11),
	(4, 'EMAIL', 'Kalema@gmail.com', 7, '2017-06-17 18:30:02', NULL, NULL, 'ACTIVE', 'PERSON', 12);
/*!40000 ALTER TABLE `contacts` ENABLE KEYS */;

-- Dumping structure for table property.packages
CREATE TABLE IF NOT EXISTS `packages` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `package` varchar(255) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `package` (`package`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='Manage App Packages';

-- Dumping data for table property.packages: ~3 rows (approximately)
DELETE FROM `packages`;
/*!40000 ALTER TABLE `packages` DISABLE KEYS */;
INSERT INTO `packages` (`id`, `package`) VALUES
	(1, 'BASIC'),
	(2, 'GOLD'),
	(3, 'PREMIUM');
/*!40000 ALTER TABLE `packages` ENABLE KEYS */;

-- Dumping structure for table property.person
CREATE TABLE IF NOT EXISTS `person` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `userId` int(20) DEFAULT NULL,
  `names` varchar(500) DEFAULT NULL,
  `gender` enum('MALE','FEMALE','OTHER') DEFAULT NULL,
  `dateofbirth` date DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_by` int(20) DEFAULT NULL,
  `date_updated` datetime DEFAULT NULL,
  `updated_by` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `P_USERID_idx` (`userId`),
  KEY `P_UPDATEDBY_idx` (`updated_by`),
  KEY `P_CREATEDBY_idx` (`created_by`),
  CONSTRAINT `P_CREATEDBY` FOREIGN KEY (`created_by`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `P_UPDATEDBY` FOREIGN KEY (`updated_by`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `P_USERID` FOREIGN KEY (`userId`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='Manage Profile, Personal  Information ';

-- Dumping data for table property.person: ~12 rows (approximately)
DELETE FROM `person`;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` (`id`, `userId`, `names`, `gender`, `dateofbirth`, `date_created`, `created_by`, `date_updated`, `updated_by`) VALUES
	(1, 2, 'Junju Aloysius KOI', 'FEMALE', '2017-05-26', '2017-05-27 19:32:49', NULL, '2017-05-26 05:01:47', 2),
	(2, 1, 'Katemba Kalema', 'MALE', '2017-05-26', '2017-05-27 05:00:10', 1, '2017-05-26 05:01:47', 1),
	(3, 1, 'Katemba Kalema', 'MALE', '2017-05-26', '2017-05-27 05:00:36', 1, '2017-05-26 05:01:47', 1),
	(4, 1, 'Katemba Kalema', 'MALE', '2017-05-26', '2017-05-27 05:07:47', 1, '2017-05-26 05:01:47', 1),
	(5, 1, 'Katemba Kalema', 'MALE', '2017-05-26', '2017-05-27 05:07:52', 1, '2017-05-26 05:01:47', 1),
	(6, 1, 'Katemba Kalema', 'MALE', '2017-05-26', '2017-05-27 05:09:23', 1, '2017-05-26 05:01:47', 1),
	(7, 2, 'Julaia Wantala', 'FEMALE', '2017-05-26', '2017-05-27 06:51:35', 2, '2017-05-26 05:01:47', 2),
	(8, 2, 'Julaia KOI', 'FEMALE', '2017-05-26', '2017-05-27 08:02:03', 2, '2017-05-26 05:01:47', 2),
	(9, 4, 'Nakyiteiate Kamuntaro', NULL, NULL, '2017-06-15 23:47:18', NULL, NULL, NULL),
	(10, 5, 'Molaote  Kamuntaro', NULL, NULL, '2017-06-15 23:53:44', NULL, NULL, NULL),
	(11, 6, 'Khalid Odhybaya', NULL, NULL, '2017-06-16 13:33:04', NULL, NULL, NULL),
	(12, 7, 'Khalid Odhybaya', NULL, NULL, '2017-06-17 18:30:02', NULL, NULL, NULL);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;

-- Dumping structure for table property.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL DEFAULT '0',
  `password` varchar(255) NOT NULL DEFAULT '0',
  `status` enum('ACTIVE','PENDING','DEACTIVATED') NOT NULL DEFAULT 'PENDING',
  `date_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='Manage User Login, Active, Deactive user,  Password Update, ';

-- Dumping data for table property.user: ~7 rows (approximately)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `username`, `password`, `status`, `date_created`) VALUES
	(1, 'Junior', 'd5b13bdc37fb19f308f1932c1d7650b2f95075898623bf751533c947e9e33005', 'PENDING', '2017-05-20 20:31:08'),
	(2, 'cooler', '78bbacab1bd990dd0f59854ad06b46ca3a9f2ea16a548c05877c39fecdc7ea05', 'ACTIVE', '2017-05-21 15:13:28'),
	(3, 'Godi', '3925e9588837bd2494bb57eb3d083f5a1e0198daed90c4f3f02b0184b224aa53', 'DEACTIVATED', '2017-05-21 15:12:45'),
	(4, 'moverr@gmail.com', '638182fbda7911ec8bbba357498f0d23cc591f00f1e3a84fcc287f3cc915b53c', 'PENDING', '2017-06-15 23:47:18'),
	(5, 'mover@gmail.com', '3c76b6d208c08e4a7f294ee36d8cc40ca9786f69bb38bb44eca0be1366f2e8d6', 'PENDING', '2017-06-15 23:53:43'),
	(6, 'egulwa@gmail.com', 'a13119776a455925f3b00f40c85142f532f4e1536b70ef50d0a1c7acd141f6a1', 'PENDING', '2017-06-16 13:33:04'),
	(7, 'Kalema@gmail.com', 'a13119776a455925f3b00f40c85142f532f4e1536b70ef50d0a1c7acd141f6a1', 'PENDING', '2017-06-17 18:30:01');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
