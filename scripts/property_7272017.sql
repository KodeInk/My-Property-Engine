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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='Manage System Accounts. this is a fundamental part of the application';

-- Dumping data for table property.accounts: ~4 rows (approximately)
DELETE FROM `accounts`;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` (`id`, `user_id`, `package_id`, `account_type_id`, `parent_id`, `status`, `date_created`, `created_by`, `date_updated`, `updated_by`) VALUES
	(1, 8, 1, 1, 0, 'ACTIVE', '2017-06-18 17:02:17', 1, NULL, NULL),
	(2, 9, 1, 1, 0, 'ACTIVE', '2017-06-18 17:19:32', 9, NULL, NULL),
	(3, 10, 1, 1, 0, 'ACTIVE', '2017-06-18 17:22:15', 10, NULL, NULL),
	(4, 11, 1, 1, 0, 'ACTIVE', '2017-06-18 20:10:36', 11, NULL, NULL);
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;

-- Dumping structure for table property.account_types
CREATE TABLE IF NOT EXISTS `account_types` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `account_type` varchar(255) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `account_type` (`account_type`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='Account Types eg Personal, Company, Broker, it helps in classifying accounts : ';

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='Manage All Addresses in the System';

-- Dumping data for table property.address: ~3 rows (approximately)
DELETE FROM `address`;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` (`id`, `location`, `lat`, `lng`, `createdby`, `datecreated`, `updatedby`, `dateupdated`, `status`, `parent_type`, `parent_id`) VALUES
	(2, 'Kampala,Uganda', '234.45', '456.78', 2, '2017-06-07 00:40:53', 2, '2017-05-31 13:23:55', 'ACTIVE', 'PERSON', 1),
	(3, 'Kamuli,Uganda', '323323', '722923', 1, '2017-06-08 19:47:10', NULL, NULL, 'ACTIVE', 'PERSON', 1),
	(4, 'Kampala,Uganda', '1234.454', '34404', 3, '2017-07-23 23:20:05', NULL, NULL, 'ACTIVE', 'PROPERTY', 12);
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='Manage System Level Contacts \r\nWebsites, Phone,Fax,Social Media, Etc';

-- Dumping data for table property.contacts: ~8 rows (approximately)
DELETE FROM `contacts`;
/*!40000 ALTER TABLE `contacts` DISABLE KEYS */;
INSERT INTO `contacts` (`id`, `type`, `details`, `created_by`, `date_created`, `updated_by`, `date_updated`, `status`, `parent_type`, `parent_id`) VALUES
	(1, 'PHONE', '+256779820968', 1, '2017-06-09 14:03:42', 1, '2017-06-09 14:03:42', 'ACTIVE', 'PERSON', 1),
	(2, 'EMAIL', 'mover@gmail.com', 5, '2017-06-15 23:53:44', NULL, NULL, 'ACTIVE', 'PERSON', 10),
	(3, 'EMAIL', 'egulwa@gmail.com', 6, '2017-06-16 13:33:04', NULL, NULL, 'ACTIVE', 'PERSON', 11),
	(4, 'EMAIL', 'Kalema@gmail.com', 7, '2017-06-17 18:30:02', NULL, NULL, 'ACTIVE', 'PERSON', 12),
	(5, 'EMAIL', 'kiop@gmail.com', 8, '2017-06-18 15:37:14', NULL, NULL, 'ACTIVE', 'PERSON', 13),
	(6, 'EMAIL', 'kolpi@gmail.com', 9, '2017-06-18 17:19:32', NULL, NULL, 'ACTIVE', 'PERSON', 14),
	(7, 'EMAIL', 'lopp@gmail.com', 10, '2017-06-18 17:22:15', NULL, NULL, 'ACTIVE', 'PERSON', 15),
	(8, 'EMAIL', 'myprapati1497805835310@myprapati.com', 11, '2017-06-18 20:10:36', NULL, NULL, 'ACTIVE', 'PERSON', 16);
/*!40000 ALTER TABLE `contacts` ENABLE KEYS */;

-- Dumping structure for table property.packages
CREATE TABLE IF NOT EXISTS `packages` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `package` varchar(255) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `package` (`package`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='Manage App Packages';

-- Dumping data for table property.packages: ~3 rows (approximately)
DELETE FROM `packages`;
/*!40000 ALTER TABLE `packages` DISABLE KEYS */;
INSERT INTO `packages` (`id`, `package`) VALUES
	(1, 'BASIC'),
	(2, 'GOLD'),
	(3, 'PREMIUM');
/*!40000 ALTER TABLE `packages` ENABLE KEYS */;

-- Dumping structure for table property.permissions
CREATE TABLE IF NOT EXISTS `permissions` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL DEFAULT '0',
  `grouping` varchar(100) NOT NULL DEFAULT '0',
  `code` varchar(50) NOT NULL DEFAULT '0',
  `status` enum('ACTIVE','ARCHIVED') NOT NULL DEFAULT 'ACTIVE',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Manage System Permissions';

-- Dumping data for table property.permissions: ~0 rows (approximately)
DELETE FROM `permissions`;
/*!40000 ALTER TABLE `permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `permissions` ENABLE KEYS */;

-- Dumping structure for table property.permission_role
CREATE TABLE IF NOT EXISTS `permission_role` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `permission_id` int(20) DEFAULT NULL,
  `role_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `PR_PERMISSION` (`permission_id`),
  KEY `PR_ROLE` (`role_id`),
  CONSTRAINT `PR_PERMISSION` FOREIGN KEY (`permission_id`) REFERENCES `permissions` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `PR_ROLE` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Pivot Table to Merge Permission to Role ';

-- Dumping data for table property.permission_role: ~0 rows (approximately)
DELETE FROM `permission_role`;
/*!40000 ALTER TABLE `permission_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `permission_role` ENABLE KEYS */;

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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='Manage Profile, Personal  Information ';

-- Dumping data for table property.person: ~16 rows (approximately)
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
	(12, 7, 'Khalid Odhybaya', NULL, NULL, '2017-06-17 18:30:02', NULL, NULL, NULL),
	(13, 8, 'Khalid Odhybaya', NULL, NULL, '2017-06-18 15:37:14', NULL, NULL, NULL),
	(14, 9, 'Khalid mpovfgrt', NULL, NULL, '2017-06-18 17:19:32', NULL, NULL, NULL),
	(15, 10, 'Khalid mpovfgrt', NULL, NULL, '2017-06-18 17:22:15', NULL, NULL, NULL),
	(16, 11, 'Test Sun Jun 18 20:10:35 EAT 2017', NULL, NULL, '2017-06-18 20:10:36', NULL, NULL, NULL);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;

-- Dumping structure for table property.property
CREATE TABLE IF NOT EXISTS `property` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `userId` int(20) NOT NULL DEFAULT '0',
  `dateCreated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `dateUpdated` datetime DEFAULT NULL,
  `type` int(20) DEFAULT NULL,
  `brief` varchar(75) NOT NULL DEFAULT '0',
  `accountId` int(20) NOT NULL DEFAULT '0',
  `status` enum('ACTIVE','ARCHIVED','PENDING') NOT NULL DEFAULT 'PENDING',
  `details` varchar(500) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `PUSER` (`userId`),
  KEY `PACCOUNT` (`accountId`),
  KEY `PTYPE` (`type`),
  CONSTRAINT `PACCOUNT` FOREIGN KEY (`accountId`) REFERENCES `accounts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `PTYPE` FOREIGN KEY (`type`) REFERENCES `property_types` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `PUSER` FOREIGN KEY (`userId`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- Dumping data for table property.property: ~11 rows (approximately)
DELETE FROM `property`;
/*!40000 ALTER TABLE `property` DISABLE KEYS */;
INSERT INTO `property` (`id`, `userId`, `dateCreated`, `dateUpdated`, `type`, `brief`, `accountId`, `status`, `details`) VALUES
	(2, 2, '2017-07-02 19:25:27', '2017-06-30 06:58:09', 1, 'testing1498795086871', 1, 'PENDING', 'details1498795086871'),
	(3, 2, '2017-07-02 19:25:31', NULL, 2, 'Miles', 1, 'ACTIVE', 'wazofi'),
	(4, 2, '2017-07-02 19:25:34', NULL, 2, 'testing1498793709337', 1, 'ACTIVE', 'details1498793709338'),
	(5, 2, '2017-07-02 19:58:13', NULL, 1, 'Jumielatea aggleoa t', 1, 'ACTIVE', 'wazofi'),
	(6, 2, '2017-07-02 20:01:56', NULL, 1, 'Ask Again ', 1, 'ACTIVE', 'wazofi'),
	(7, 3, '2017-07-18 23:24:20', NULL, 1, 'dadfgfgfaea Again ', 1, 'ACTIVE', 'fgfgf'),
	(8, 3, '2017-07-20 02:05:06', NULL, 1, 'dadfgfgfaea Again ', 1, 'ACTIVE', 'fgfgf'),
	(9, 3, '2017-07-20 03:04:07', NULL, 1, 'dadfgfgfaea Again ', 1, 'ACTIVE', 'fgfgf'),
	(10, 3, '2017-07-20 07:35:06', NULL, 1, 'dadfgfgfaea Again ', 1, 'ACTIVE', 'fgfgf'),
	(11, 3, '2017-07-23 23:16:33', NULL, 1, 'dadfgfgfaea Again ', 1, 'ACTIVE', 'fgfgf'),
	(12, 3, '2017-07-23 23:20:05', NULL, 1, 'dadfgfgfaea Again ', 1, 'ACTIVE', 'fgfgf');
/*!40000 ALTER TABLE `property` ENABLE KEYS */;

-- Dumping structure for table property.property_classification
CREATE TABLE IF NOT EXISTS `property_classification` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `classification` varchar(255) NOT NULL DEFAULT '0',
  `abbrev` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='Commercial , Residential';

-- Dumping data for table property.property_classification: ~2 rows (approximately)
DELETE FROM `property_classification`;
/*!40000 ALTER TABLE `property_classification` DISABLE KEYS */;
INSERT INTO `property_classification` (`id`, `classification`, `abbrev`) VALUES
	(1, 'commercial', 'com'),
	(2, 'residential', 'res');
/*!40000 ALTER TABLE `property_classification` ENABLE KEYS */;

-- Dumping structure for table property.property_size
CREATE TABLE IF NOT EXISTS `property_size` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `property_id` int(20) NOT NULL,
  `size` varchar(255) NOT NULL,
  `unitMeasure` enum('METRE','FEET','ACRE','KILOMETRE','MILE') NOT NULL DEFAULT 'METRE',
  PRIMARY KEY (`id`),
  KEY `PS_PROPERTY` (`property_id`),
  CONSTRAINT `PS_PROPERTY` FOREIGN KEY (`property_id`) REFERENCES `property` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='Property Size';

-- Dumping data for table property.property_size: ~6 rows (approximately)
DELETE FROM `property_size`;
/*!40000 ALTER TABLE `property_size` DISABLE KEYS */;
INSERT INTO `property_size` (`id`, `property_id`, `size`, `unitMeasure`) VALUES
	(1, 7, '10', 'METRE'),
	(2, 8, '10', 'METRE'),
	(3, 9, '10', 'METRE'),
	(4, 10, '10', 'METRE'),
	(5, 11, '10', 'METRE'),
	(6, 12, '10', 'METRE');
/*!40000 ALTER TABLE `property_size` ENABLE KEYS */;

-- Dumping structure for table property.property_types
CREATE TABLE IF NOT EXISTS `property_types` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `classification_id` int(20) NOT NULL DEFAULT '0',
  `type` varchar(255) NOT NULL DEFAULT '0',
  `status` enum('ACTIVE','ARCHIVED') NOT NULL DEFAULT 'ACTIVE',
  PRIMARY KEY (`id`),
  KEY `pt_classification_id` (`classification_id`),
  CONSTRAINT `pt_classification_id` FOREIGN KEY (`classification_id`) REFERENCES `property_classification` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='Property Types Under Classification';

-- Dumping data for table property.property_types: ~2 rows (approximately)
DELETE FROM `property_types`;
/*!40000 ALTER TABLE `property_types` DISABLE KEYS */;
INSERT INTO `property_types` (`id`, `classification_id`, `type`, `status`) VALUES
	(1, 1, 'Office', 'ACTIVE'),
	(2, 2, 'Room', 'ACTIVE');
/*!40000 ALTER TABLE `property_types` ENABLE KEYS */;

-- Dumping structure for table property.roles
CREATE TABLE IF NOT EXISTS `roles` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT '0',
  `code` varchar(50) DEFAULT '0',
  `brief` varchar(255) DEFAULT '0',
  `status` enum('ACTIVE','ARCHIVED') DEFAULT 'ACTIVE',
  `date_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `created_by` int(20) NOT NULL,
  `date_updated` datetime DEFAULT NULL,
  `updated_by` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Manage User Roles in the System';

-- Dumping data for table property.roles: ~0 rows (approximately)
DELETE FROM `roles`;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;

-- Dumping structure for table property.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL DEFAULT '0',
  `password` varchar(255) NOT NULL DEFAULT '0',
  `status` enum('ACTIVE','PENDING','DEACTIVATED') NOT NULL DEFAULT 'PENDING',
  `date_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='Manage User Login, Active, Deactive user,  Password Update, ';

-- Dumping data for table property.user: ~11 rows (approximately)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `username`, `password`, `status`, `date_created`) VALUES
	(1, 'Junior', 'd5b13bdc37fb19f308f1932c1d7650b2f95075898623bf751533c947e9e33005', 'PENDING', '2017-05-20 20:31:08'),
	(2, 'cooler', '78bbacab1bd990dd0f59854ad06b46ca3a9f2ea16a548c05877c39fecdc7ea05', 'ACTIVE', '2017-05-21 15:13:28'),
	(3, 'Godi', '3925e9588837bd2494bb57eb3d083f5a1e0198daed90c4f3f02b0184b224aa53', 'DEACTIVATED', '2017-05-21 15:12:45'),
	(4, 'moverr@gmail.com', '638182fbda7911ec8bbba357498f0d23cc591f00f1e3a84fcc287f3cc915b53c', 'PENDING', '2017-06-15 23:47:18'),
	(5, 'mover@gmail.com', '3c76b6d208c08e4a7f294ee36d8cc40ca9786f69bb38bb44eca0be1366f2e8d6', 'PENDING', '2017-06-15 23:53:43'),
	(6, 'egulwa@gmail.com', 'a13119776a455925f3b00f40c85142f532f4e1536b70ef50d0a1c7acd141f6a1', 'PENDING', '2017-06-16 13:33:04'),
	(7, 'Kalema@gmail.com', 'a13119776a455925f3b00f40c85142f532f4e1536b70ef50d0a1c7acd141f6a1', 'PENDING', '2017-06-17 18:30:01'),
	(8, 'kiop@gmail.com', 'a13119776a455925f3b00f40c85142f532f4e1536b70ef50d0a1c7acd141f6a1', 'PENDING', '2017-06-18 15:37:14'),
	(9, 'kolpi@gmail.com', '1c8030462815a41b7753e36a40b1d44b8fd9bd609dafd5aac8e9fff11a55db2f', 'PENDING', '2017-06-18 17:19:32'),
	(10, 'lopp@gmail.com', '1c8030462815a41b7753e36a40b1d44b8fd9bd609dafd5aac8e9fff11a55db2f', 'PENDING', '2017-06-18 17:22:15'),
	(11, 'myprapati1497805835310@myprapati.com', 'cf80cd8aed482d5d1527d7dc72fceff84e6326592848447d2dc0b0e87dfc9a90', 'PENDING', '2017-06-18 20:10:35');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

-- Dumping structure for table property.user_role
CREATE TABLE IF NOT EXISTS `user_role` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_id` int(20) NOT NULL DEFAULT '0',
  `role_id` int(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `US_USER` (`user_id`),
  KEY `US_ROLE` (`role_id`),
  CONSTRAINT `US_ROLE` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `US_USER` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Pivot Table to Merge User and Role ';

-- Dumping data for table property.user_role: ~0 rows (approximately)
DELETE FROM `user_role`;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
