/*
SQLyog Ultimate v9.31 GA
MySQL - 5.6.21 : Database - lista
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`lista` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `lista`;

/*Table structure for table `departamento` */

CREATE TABLE `departamento` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `local` varchar(255) DEFAULT NULL,
  `descricao` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `departamento` */

insert  into `departamento`(`id`,`nome`,`local`,`descricao`) values (1,'Informática','Centro','Informática'),(2,'Administração','IAA','Teste'),(3,'Contabilidade','Cont','Contabilidade'),(4,'Recursos Humanos','RH','Recursos Humanos'),(5,'Financeiro','Fincanças','Financeiro');

/*Table structure for table `funcionario` */

CREATE TABLE `funcionario` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `departamento_id` int(10) unsigned NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `funcao` varchar(255) DEFAULT NULL,
  `registro` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `departamento_id` (`departamento_id`),
  CONSTRAINT `funcionario_ibfk_1` FOREIGN KEY (`departamento_id`) REFERENCES `departamento` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table `funcionario` */

insert  into `funcionario`(`id`,`departamento_id`,`nome`,`funcao`,`registro`) values (1,1,'Everson Silva','adm','123'),(2,2,'Everson Silva','Administrador','TEste'),(3,1,'Everson Silva','243','2'),(4,1,'Everson Silva','243','2'),(5,2,'123','123','123'),(6,2,'123','123','123'),(7,2,'123123','1231','123'),(8,2,'123123','1231','123'),(9,2,'123123','123123','1123'),(10,2,'123123','123123','1123'),(11,2,'123123','123123','1123'),(12,2,'123123','123123','1123'),(13,2,'123123','123123','1123'),(14,2,'werw','werwre','werwer'),(15,2,'awerawer','qwer','qwer'),(16,2,'awerawer','qwer','qwer'),(17,2,'asdfasd','asdfasdf','asdfasdf'),(18,2,'asdfasd','asdfasdf','asdfasdf'),(19,1,'Everson Silva','Administrador de Redes','1234566'),(20,1,'Everson','123123','1231231'),(21,2,'Everson Silva','Adm Redes','123456'),(22,1,'Felipe ViadÃ£o','Analista Meia-boca','1234567');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
