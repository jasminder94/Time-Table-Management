CREATE DATABASE timetable1;
USE `timetable1`;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `teachers` */

DROP TABLE IF EXISTS `teachers`;

CREATE TABLE `teachers` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `tname` CHAR(100) DEFAULT NULL,
  `sname` CHAR(100) DEFAULT NULL,
  `sem` CHAR(50) DEFAULT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Data for the table `teachers` */

/*Table structure for table `time_table_student` */

DROP TABLE IF EXISTS `time_table_student`;

CREATE TABLE `time_table_student` (
  `id` INT(4) NOT NULL AUTO_INCREMENT,
  `day1` CHAR(50) DEFAULT NULL,
  `p1` CHAR(100) DEFAULT NULL,
  `p2` CHAR(100) DEFAULT NULL,
  `p3` CHAR(100) DEFAULT NULL,
  `p4` CHAR(100) DEFAULT NULL,
  `p5` CHAR(100) DEFAULT NULL,
  `lab1` CHAR(100) DEFAULT NULL,
  `lab2` CHAR(100) DEFAULT NULL,
  `sem` CHAR(100) DEFAULT NULL,
  `session` CHAR(100) DEFAULT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Data for the table `time_table_student` */

/*Table structure for table `time_table_teacher` */

DROP TABLE IF EXISTS `time_table_teacher`;

CREATE TABLE `time_table_teacher` (
  `id` INT(4) NOT NULL AUTO_INCREMENT,
  `day1` CHAR(50) DEFAULT NULL,
  `p1` CHAR(100) DEFAULT NULL,
  `p2` CHAR(100) DEFAULT NULL,
  `p3` CHAR(100) DEFAULT NULL,
  `p4` CHAR(100) DEFAULT NULL,
  `p5` CHAR(100) DEFAULT NULL,
  `lab1` CHAR(100) DEFAULT NULL,
  `lab2` CHAR(100) DEFAULT NULL,
  `sem` CHAR(100) DEFAULT NULL,
  `session` CHAR(100) DEFAULT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Data for the table `time_table_teacher` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` INT(4) NOT NULL AUTO_INCREMENT,
  `uname` CHAR(50) DEFAULT NULL,
  `passw` CHAR(50) DEFAULT NULL,
  `addr` CHAR(100) DEFAULT NULL,
  `email` CHAR(50) DEFAULT NULL,
  `mobile` CHAR(50) DEFAULT NULL,
  `sem` CHAR(50) DEFAULT NULL,
  `session` CHAR(50) DEFAULT NULL,
  `utype` CHAR(50) DEFAULT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `users` */

INSERT INTO `users` (`id`,`uname`,`passw`,`addr`,`email`,`mobile`,`sem`,`session`,`utype`) VALUES (1,'admin','admin','mandi','admin@mail.com','9887876567','0','0','admin');

SET SQL_MODE=@OLD_SQL_MODE;