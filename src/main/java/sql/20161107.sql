--  databases: qiubite
--      by zhenma 2016-11-05  
--
DROP DATABASE IF EXISTS `qiubite`; 
CREATE DATABASE qiubite;

USE qiubite;

--  
-- tbl_msg_info  
-- 
DROP TABLE IF EXISTS `tbl_msg_info`;  
CREATE TABLE `tbl_msg_info` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phone_num` varchar(4) NOT NULL,
  `name` varchar(64) NOT NULL,
  `msg`  varchar(512),
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--  
-- tbl_match_info  
-- 
DROP TABLE IF EXISTS `tbl_match_info`;  
CREATE TABLE `tbl_match_info` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `phone_num1` varchar(4) NOT NULL,
  `name1` varchar(64) NOT NULL,
  `phone_num2` varchar(4) NOT NULL,
  `name2` varchar(64) NOT NULL,
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
