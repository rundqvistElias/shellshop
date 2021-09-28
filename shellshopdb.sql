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

-- Dumping data for table hitcases.brand: ~4 rows (approximately)
/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
INSERT INTO `brand` (`id`, `name`, `info`) VALUES
	(1, 'Apple', 'Apple is the largest tech company'),
	(2, 'Samsung', 'Samsung has the 8th highest global value.'),
	(3, 'Motorola', 'Motorola was a multinational telecompany, now split into two.'),
	(4, 'Sony', 'Sony is one of the worlds largest manufacturer of electronics.');
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;

-- Dumping data for table hitcases.model: ~6 rows (approximately)
/*!40000 ALTER TABLE `model` DISABLE KEYS */;
INSERT INTO `model` (`id`, `name`, `info`, `brand_id`) VALUES
	(1, 'Iphone 11', 'Dubbelkamera 12mp', 1),
	(2, 'Iphone XS', 'Dubbelkamera 12mp', 1),
	(3, 'Galaxy s21', 'Flerkamera 12+64mp', 2),
	(4, 'Galaxy note s20', 'Trippelkamera 12mp ', 2),
	(5, 'RAZR 5g', 'Quadkamera 48+12mp', 3),
	(6, 'Xperia 1', 'Trippelkamera 12mp', 4);
/*!40000 ALTER TABLE `model` ENABLE KEYS */;

-- Dumping data for table hitcases.shell: ~3 rows (approximately)
/*!40000 ALTER TABLE `shell` DISABLE KEYS */;
INSERT INTO `shell` (`name`, `id`, `model_id`, `color`, `info`) VALUES
	('Red Iphone 11 case', 1, 1, 'Red', 'Waterproof'),
	('Black Samsung galaxy case', 2, 3, 'Black', 'Walletcase'),
	('Blue Motorola case', 3, 5, 'Blue', 'Waterproof');
/*!40000 ALTER TABLE `shell` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
