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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `departamento` */

insert  into `departamento`(`id`,`nome`,`local`,`descricao`) values (9,'Informática','Piracicaba','Informática'),(10,'Teste','teste','teste');

/*Table structure for table `dependente` */

CREATE TABLE `dependente` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `funcionario_id` int(10) unsigned NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `parentesco` varchar(255) DEFAULT NULL,
  `rg` varchar(255) DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `funcionario_id` (`funcionario_id`),
  CONSTRAINT `dependente_ibfk_1` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `dependente` */

insert  into `dependente`(`id`,`funcionario_id`,`nome`,`parentesco`,`rg`,`cpf`) values (1,1,'Murilo Almeida Silva','Filho','123.123.123-12','22.222.222-22'),(2,1,'Liliane A. Silva','Esposa','123.123.123-12','23.233.233-1'),(3,2,'Teste','Filho','12312312','12123123123');

/*Table structure for table `empresa` */

CREATE TABLE `empresa` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(120) DEFAULT NULL,
  `cnpj` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `empresa` */

insert  into `empresa`(`id`,`nome`,`cnpj`) values (1,'Frigorífico Angelelli Ltda.','44.802.528/0001-50');

/*Table structure for table `folha` */

CREATE TABLE `folha` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `funcionario_id` int(10) unsigned NOT NULL,
  `empresa_id` int(10) unsigned NOT NULL,
  `inss` decimal(10,2) DEFAULT NULL,
  `sindicato` decimal(10,2) DEFAULT NULL,
  `ajudacusto` decimal(10,2) DEFAULT NULL,
  `plr` decimal(10,2) DEFAULT NULL,
  `decimo` decimal(10,2) DEFAULT NULL,
  `periodo` int(10) DEFAULT NULL,
  `ferias` varchar(5) DEFAULT NULL,
  `datapagamento` datetime DEFAULT NULL,
  `salariofamilia` varchar(5) DEFAULT NULL,
  `salario` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_folha_funcionario` (`funcionario_id`),
  KEY `fk_folha_empresa` (`empresa_id`),
  CONSTRAINT `fk_folha_empresa` FOREIGN KEY (`empresa_id`) REFERENCES `empresa` (`id`),
  CONSTRAINT `fk_folha_funcionario` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `folha` */

insert  into `folha`(`id`,`funcionario_id`,`empresa_id`,`inss`,`sindicato`,`ajudacusto`,`plr`,`decimo`,`periodo`,`ferias`,`datapagamento`,`salariofamilia`,`salario`) values (1,1,1,'1000.00','1000.00','1000.00','100.00','100.00',30,'200','2015-12-05 00:00:00','Não','10000.00'),(2,2,1,'12.00','12.00','12.00','12.00','12.00',30,'12','2015-05-29 00:00:00','Não','10000.00');

/*Table structure for table `funcionario` */

CREATE TABLE `funcionario` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `departamento_id` int(10) unsigned NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `funcao` varchar(255) DEFAULT NULL,
  `registro` varchar(255) DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `fumante` varchar(3) DEFAULT NULL,
  `pai` varchar(60) DEFAULT NULL,
  `mae` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `departamento_id` (`departamento_id`),
  CONSTRAINT `funcionario_ibfk_1` FOREIGN KEY (`departamento_id`) REFERENCES `departamento` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `funcionario` */

insert  into `funcionario`(`id`,`departamento_id`,`nome`,`funcao`,`registro`,`cpf`,`fumante`,`pai`,`mae`) values (1,9,'Everson Silva','Administrador de Redes','27.185.233-1','286.114.228-64','Sim','David Gilberto da Silva','Marluce L. Silva'),(2,9,'Martins','Prof','123123','12312312','Não','asdfasdf','asdfasfasdf');

/*Table structure for table `usuario` */

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(15) DEFAULT NULL,
  `senha` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`id`,`usuario`,`senha`) values (1,'everson','123'),(2,'leonardo','123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
