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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='Manage All Addresses in the System';

-- Dumping data for table property.address: ~0 rows (approximately)
DELETE FROM `address`;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` (`id`, `location`, `lat`, `lng`, `createdby`, `datecreated`, `updatedby`, `dateupdated`, `status`, `parent_type`, `parent_id`) VALUES
	(2, 'Kampala,Uganda', '234.45', '456.78', 2, '2017-05-31 13:24:14', 2, '2017-05-31 13:23:55', 'ACTIVE', NULL, NULL);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;

-- Dumping structure for table property.contacts
CREATE TABLE IF NOT EXISTS `contacts` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) NOT NULL,
  `details` varchar(255) NOT NULL,
  `created_by` int(20) NOT NULL,
  `date_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `updated_by` int(20) NOT NULL,
  `date_updated` datetime NOT NULL,
  `status` enum('ACTIVE','ARCHIVED') NOT NULL DEFAULT 'ACTIVE',
  `parent_type` varchar(255) DEFAULT NULL,
  `parent_id` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Manage System Level Contacts \r\nWebsites, Phone,Fax,Social Media, Etc';

-- Dumping data for table property.contacts: ~0 rows (approximately)
DELETE FROM `contacts`;
/*!40000 ALTER TABLE `contacts` DISABLE KEYS */;
/*!40000 ALTER TABLE `contacts` ENABLE KEYS */;

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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='Manage Profile, Personal  Information ';

-- Dumping data for table property.person: ~8 rows (approximately)
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
	(8, 2, 'Julaia KOI', 'FEMALE', '2017-05-26', '2017-05-27 08:02:03', 2, '2017-05-26 05:01:47', 2);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;

-- Dumping structure for table property.person_address
CREATE TABLE IF NOT EXISTS `person_address` (
  `personId` int(20) DEFAULT NULL,
  `addressId` int(20) DEFAULT NULL,
  KEY `PersonId` (`personId`),
  KEY `AddressId` (`addressId`),
  CONSTRAINT `AddressId` FOREIGN KEY (`addressId`) REFERENCES `address` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `PersonId` FOREIGN KEY (`personId`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Pivot table between person and Address';

-- Dumping data for table property.person_address: ~0 rows (approximately)
DELETE FROM `person_address`;
/*!40000 ALTER TABLE `person_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `person_address` ENABLE KEYS */;

-- Dumping structure for table property.person_contact
CREATE TABLE IF NOT EXISTS `person_contact` (
  `personId` int(20) DEFAULT NULL,
  `contactId` int(20) DEFAULT NULL,
  KEY `PS_person` (`personId`),
  KEY `PS_contact` (`contactId`),
  CONSTRAINT `PS_contact` FOREIGN KEY (`contactId`) REFERENCES `contacts` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `PS_person` FOREIGN KEY (`personId`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Person and  Contacts Pivot Table ';

-- Dumping data for table property.person_contact: ~0 rows (approximately)
DELETE FROM `person_contact`;
/*!40000 ALTER TABLE `person_contact` DISABLE KEYS */;
/*!40000 ALTER TABLE `person_contact` ENABLE KEYS */;

-- Dumping structure for table property.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL DEFAULT '0',
  `password` varchar(255) NOT NULL DEFAULT '0',
  `status` enum('ACTIVE','PENDING','DEACTIVATED') NOT NULL DEFAULT 'PENDING',
  `date_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='Manage User Login, Active, Deactive user,  Password Update, ';

-- Dumping data for table property.user: ~2 rows (approximately)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `username`, `password`, `status`, `date_created`) VALUES
	(1, 'Junior', 'd5b13bdc37fb19f308f1932c1d7650b2f95075898623bf751533c947e9e33005', 'PENDING', '2017-05-20 20:31:08'),
	(2, 'cooler', '78bbacab1bd990dd0f59854ad06b46ca3a9f2ea16a548c05877c39fecdc7ea05', 'ACTIVE', '2017-05-21 15:13:28'),
	(3, 'Godi', '3925e9588837bd2494bb57eb3d083f5a1e0198daed90c4f3f02b0184b224aa53', 'DEACTIVATED', '2017-05-21 15:12:45');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
