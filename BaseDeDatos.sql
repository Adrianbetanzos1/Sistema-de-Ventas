/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE DATABASE IF NOT EXISTS `sistema_ventas` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `sistema_ventas`;

CREATE TABLE IF NOT EXISTS `acceso` (
  `curp` char(18) NOT NULL,
  `contraseña` char(50) DEFAULT NULL,
  KEY `FK1curp` (`curp`),
  CONSTRAINT `FK1curp` FOREIGN KEY (`curp`) REFERENCES `personal` (`curp`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DELETE FROM `acceso`;
INSERT INTO `acceso` (`curp`, `contraseña`) VALUES
	('GOBA011111HVZNRNA4', 'Noviembre11'),
	('PÉREZ01', '12345678');

CREATE TABLE IF NOT EXISTS `pedidos` (
  `id_pedido` int(11) NOT NULL AUTO_INCREMENT,
  `producto` int(11) DEFAULT NULL,
  `proveedor` int(11) DEFAULT NULL,
  `sucursal` varchar(50) DEFAULT NULL,
  `tipo_producto` varchar(50) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `estado` char(50) DEFAULT NULL,
  PRIMARY KEY (`id_pedido`),
  KEY `FK1 producto` (`producto`),
  KEY `FK2 proveedor` (`proveedor`),
  KEY `FK3 tipo_producto` (`tipo_producto`),
  CONSTRAINT `FK1 producto` FOREIGN KEY (`producto`) REFERENCES `producto` (`codigo_producto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK2 proveedor` FOREIGN KEY (`proveedor`) REFERENCES `proveedor` (`codigo_proveedor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK3 tipo_producto` FOREIGN KEY (`tipo_producto`) REFERENCES `tipo_producto` (`tipoProducto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;

DELETE FROM `pedidos`;
INSERT INTO `pedidos` (`id_pedido`, `producto`, `proveedor`, `sucursal`, `tipo_producto`, `cantidad`, `estado`) VALUES
	(1, 1, 5, 'Minatitlán', 'Bebidas', 2, 'Completado'),
	(3, 1, 5, 'Minatitlán', 'Bebidas', 3, 'Completado'),
	(4, 1, 5, 'Avenida Norte, Minatitlán', 'Bebidas', 80, 'Completado'),
	(5, 1, 4, 'Minatitlán', 'Bebidas', 5, 'Completado'),
	(6, 5, 1, 'Minatitlán', 'Carnes frías', 40, 'Completado'),
	(8, 3, 3, 'Olméca', 'Frutas y verduras', 78, 'Completado'),
	(9, 2, 3, 'Coatzacoalcos', 'Frutas y verduras', 90, 'Completado'),
	(10, 1, 5, 'Avenida Norte', 'Bebidas', 80, 'Cancelado'),
	(11, 1, 5, 'Avenida Norte', 'Bebidas', 3, 'Completado'),
	(12, 2, 3, 'Coatzacoalcos', 'Frutas y verduras', 80, 'Completado');

CREATE TABLE IF NOT EXISTS `personal` (
  `curp` char(18) NOT NULL DEFAULT '',
  `nombre` char(50) DEFAULT NULL,
  `apellidoPaterno` char(50) DEFAULT NULL,
  `apellidoMaterno` char(50) DEFAULT NULL,
  PRIMARY KEY (`curp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DELETE FROM `personal`;
INSERT INTO `personal` (`curp`, `nombre`, `apellidoPaterno`, `apellidoMaterno`) VALUES
	('GOBA011111HVZNRNA4', 'Angel Yram', 'Gonzalez', 'Bartolo'),
	('PÉREZ01', 'Jorge', 'Pérez', 'Rodriguez');

CREATE TABLE IF NOT EXISTS `producto` (
  `codigo_producto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_producto` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigo_producto`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

DELETE FROM `producto`;
INSERT INTO `producto` (`codigo_producto`, `nombre_producto`) VALUES
	(1, 'Coca cola'),
	(2, 'Papa'),
	(3, 'Mango'),
	(4, 'Queso manchego'),
	(5, 'Salchicha'),
	(6, 'Zucaritas'),
	(7, 'Leche');

CREATE TABLE IF NOT EXISTS `proveedor` (
  `codigo_proveedor` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_proveedor` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigo_proveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

DELETE FROM `proveedor`;
INSERT INTO `proveedor` (`codigo_proveedor`, `nombre_proveedor`) VALUES
	(1, 'Nestlé'),
	(2, 'Bimbo'),
	(3, 'Frutos con sabor a México'),
	(4, 'Lala'),
	(5, 'Coca cola');

CREATE TABLE IF NOT EXISTS `sucursal` (
  `codigo_sucursal` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_sucursal` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigo_sucursal`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

DELETE FROM `sucursal`;
INSERT INTO `sucursal` (`codigo_sucursal`, `nombre_sucursal`, `telefono`) VALUES
	(1, 'Coatzacoalcos', '9218574252'),
	(2, 'Avenida Norte', '3254878'),
	(3, 'Minatitlán', '9221239803'),
	(4, 'Olméca', '9212534578');

CREATE TABLE IF NOT EXISTS `tipo_producto` (
  `tipoProducto` varchar(50) NOT NULL,
  PRIMARY KEY (`tipoProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DELETE FROM `tipo_producto`;
INSERT INTO `tipo_producto` (`tipoProducto`) VALUES
	('Bebidas'),
	('Carnes frías'),
	('Cereales'),
	('Frutas y verduras'),
	('Lacteo');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
