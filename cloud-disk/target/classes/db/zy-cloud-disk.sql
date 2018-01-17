# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.17)
# Database: zy-cloud-disk
# Generation Time: 2018-01-17 00:08:47 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table account
# ------------------------------------------------------------

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `email` varchar(20) NOT NULL DEFAULT '' COMMENT '邮箱',
  `password` varchar(20) NOT NULL DEFAULT '' COMMENT '密码',
  `active_code` int(1) unsigned NOT NULL DEFAULT '0' COMMENT '激活状态',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_unique` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;

INSERT INTO `account` (`id`, `email`, `password`, `active_code`)
VALUES
	(1,'zhangsan@163.com','123456',0),
	(2,'zhan111@qq.com','123456',0);

/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table directory
# ------------------------------------------------------------

DROP TABLE IF EXISTS `directory`;

CREATE TABLE `directory` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `account_id` int(11) NOT NULL COMMENT '主人 id',
  `name` varchar(20) NOT NULL COMMENT '名字',
  `parent_id` int(11) NOT NULL DEFAULT '0' COMMENT '父文件夹 id',
  `is_file` int(1) unsigned NOT NULL COMMENT '是否是文件',
  `file_id` int(11) DEFAULT NULL COMMENT '文件 id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_parentId_unique` (`name`,`parent_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `directory` WRITE;
/*!40000 ALTER TABLE `directory` DISABLE KEYS */;

INSERT INTO `directory` (`id`, `account_id`, `name`, `parent_id`, `is_file`, `file_id`)
VALUES
	(1,1,'www',0,0,NULL),
	(2,1,'222.txt',0,1,1),
	(3,1,'xxx',1,0,NULL),
	(4,1,'sss',3,0,NULL),
	(5,1,'qqq',1,0,NULL),
	(6,1,'qqq',0,0,NULL),
	(11,1,'JetbrainsCrack-2.6.1',0,1,NULL),
	(12,1,'公开课后台管理系统.xmind',0,1,6),
	(13,1,'猜你喜欢.txt',0,1,7),
	(14,1,'spring.txt',0,1,8);

/*!40000 ALTER TABLE `directory` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table file
# ------------------------------------------------------------

DROP TABLE IF EXISTS `file`;

CREATE TABLE `file` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(40) NOT NULL DEFAULT '' COMMENT '名字',
  `path` varchar(50) NOT NULL DEFAULT '' COMMENT '路径',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_unique` (`name`),
  UNIQUE KEY `path_unique` (`path`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `file` WRITE;
/*!40000 ALTER TABLE `file` DISABLE KEYS */;

INSERT INTO `file` (`id`, `name`, `path`)
VALUES
	(1,'1.txt','/aaa'),
	(3,'f5721587debebb34575e7a5c1267278c.jar','/Users/zzz/Documents/zyclouddisk/upload/f5721587de'),
	(6,'e1fe8d314bc9ca7439ba27121e725584.xmind','/Users/zzz/Documents/zyclouddisk/upload/e1fe8d314b'),
	(7,'5fff856e75f485557a3a91fe7289d5db.txt','/Users/zzz/Documents/zyclouddisk/upload/5fff856e75'),
	(8,'15be922b1dea4bc53cad98eff343f22a.txt','/Users/zzz/Documents/zyclouddisk/upload/15be922b1d');

/*!40000 ALTER TABLE `file` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
