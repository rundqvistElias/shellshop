-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.5.8-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for hitcases
DROP DATABASE IF EXISTS `hitcases`;
CREATE DATABASE IF NOT EXISTS `hitcases` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hitcases`;

-- Dumping structure for table hitcases.brand
DROP TABLE IF EXISTS `brand`;
CREATE TABLE IF NOT EXISTS `brand` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- Dumping data for table hitcases.brand: ~4 rows (approximately)
/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
INSERT INTO `brand` (`id`, `name`, `info`) VALUES
	(1, 'Apple', 'Apple is the largest tech company'),
	(2, 'Samsung', 'Samsung has the 8th highest global value.'),
	(3, 'Motorola', 'Motorola was a multinational telecompany, now split into two.'),
	(4, 'Sony', 'Sony is one of the worlds largest manufacturer of electronics.'),
	(5, 'Nokia', 'One of the oldest telecompany');
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;

-- Dumping structure for table hitcases.model
DROP TABLE IF EXISTS `model`;
CREATE TABLE IF NOT EXISTS `model` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `info` varchar(50) DEFAULT NULL,
  `brand_id` int(11) DEFAULT NULL,
  `dimension` int(11) DEFAULT NULL,
  `img` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_model_brand` (`brand_id`),
  CONSTRAINT `FK_model_brand` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Dumping data for table hitcases.model: ~7 rows (approximately)
/*!40000 ALTER TABLE `model` DISABLE KEYS */;
INSERT INTO `model` (`id`, `name`, `info`, `brand_id`, `dimension`, `img`) VALUES
	(1, 'Galaxy note s20', 'Trippelkamera 12mp ', 2, 170, NULL),
	(2, 'Galaxy s21', 'Flerkamera 12+64mp', 2, 170, NULL),
	(3, 'Iphone 11', 'Dubbelkamera 12mp', 1, 150, NULL),
	(4, 'Iphone 13', 'Dubbelkamera 12mp', 1, 150, NULL),
	(5, 'Iphone XS', 'Dubbelkamera 12mp', 1, 150, NULL),
	(6, 'RAZR 5g', 'Quadkamera 48+12mp', 3, 140, NULL),
	(7, 'Xperia 1', 'Trippelkamera 12mp', 4, 130, NULL);
/*!40000 ALTER TABLE `model` ENABLE KEYS */;

-- Dumping structure for table hitcases.shell
DROP TABLE IF EXISTS `shell`;
CREATE TABLE IF NOT EXISTS `shell` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `color` varchar(50) DEFAULT NULL,
  `info` varchar(50) DEFAULT NULL,
  `dimension` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- Dumping data for table hitcases.shell: ~7 rows (approximately)
/*!40000 ALTER TABLE `shell` DISABLE KEYS */;
INSERT INTO `shell` (`id`, `name`, `color`, `info`, `dimension`) VALUES
	(1, 'Beige Iphone XS case', 'Beige', 'Waterproof', 150),
	(2, 'Black Iphone 11 case', 'Black', 'Walletcase', 150),
	(3, 'Black Samsung galaxy case', 'Black', 'Walletcase', 170),
	(4, 'Blue Motorola case', 'Blue', 'Waterproof', 140),
	(5, 'Gold Iphone XS case', 'Gold', 'Walletcase', 150),
	(6, 'Green Iphone XS case', 'Green', 'Waterproof', 150),
	(7, 'Red Iphone 11 case', 'Red', 'Waterproof', 150);
/*!40000 ALTER TABLE `shell` ENABLE KEYS */;

-- Dumping structure for table hitcases.shell_model
DROP TABLE IF EXISTS `shell_model`;
CREATE TABLE IF NOT EXISTS `shell_model` (
  `shell_id` int(11) DEFAULT NULL,
  `model_id` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dimension` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_shell_model_shell` (`shell_id`),
  KEY `FK_shell_model_model` (`model_id`),
  CONSTRAINT `FK_shell_model_model` FOREIGN KEY (`model_id`) REFERENCES `model` (`id`),
  CONSTRAINT `FK_shell_model_shell` FOREIGN KEY (`shell_id`) REFERENCES `shell` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dumping data for table hitcases.shell_model: ~2 rows (approximately)
/*!40000 ALTER TABLE `shell_model` DISABLE KEYS */;
INSERT INTO `shell_model` (`shell_id`, `model_id`, `id`, `dimension`) VALUES
	(1, 3, 1, 150),
	(1, 4, 2, 150),
	(1, 5, 3, 150);
/*!40000 ALTER TABLE `shell_model` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
