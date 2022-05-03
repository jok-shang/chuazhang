/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50558
Source Host           : localhost:3306
Source Database       : jdbc

Target Server Type    : MYSQL
Target Server Version : 50558
File Encoding         : 65001

Date: 2022-05-03 14:23:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(40) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('2', 'HAHA', '45678910', '11111@email', '2022-05-03');
