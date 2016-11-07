--  databases: qiubite
--      by zhenma 2016-11-05  
--
DROP DATABASE IF EXISTS `qiubite`; 
CREATE DATABASE qiubite;

USE qiubite;
--  
-- tbl_user_info  
-- 
DROP TABLE IF EXISTS `tbl_user_info`;  
CREATE TABLE `tbl_user_info` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `open_id` varchar(32) NOT NULL,
  `sex` varchar(2),
  `city` varchar(64),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--  
-- tbl_msg_info  
-- 
DROP TABLE IF EXISTS `tbl_msg_info`;  
CREATE TABLE `tbl_msg_info` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `open_id` varchar(32) NOT NULL,  
  `phone_num` varchar(4) NOT NULL, 
  `msg`  varchar(512) NOT NULL,
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--  
-- tbl_match_info  
-- 
DROP TABLE IF EXISTS `tbl_match_info`;  
CREATE TABLE `tbl_match_info` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `open_id1` varchar(32) NOT NULL,  
  `phone_num1` varchar(4) NOT NULL,
  `open_id2` varchar(32) NOT NULL,  
  `phone_num2` varchar(4) NOT NULL,
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
