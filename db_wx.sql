/*
Navicat MySQL Data Transfer

Source Server         : mydata
Source Server Version : 50544
Source Host           : localhost:3306
Source Database       : db_wx

Target Server Type    : MYSQL
Target Server Version : 50544
File Encoding         : 65001

Date: 2019-03-18 23:56:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_area`
-- ----------------------------
DROP TABLE IF EXISTS `tb_area`;
CREATE TABLE `tb_area` (
  `area_id` int(2) NOT NULL AUTO_INCREMENT,
  `area_name` varchar(200) NOT NULL,
  `priority` int(2) NOT NULL DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `last_edit_time` datetime DEFAULT NULL,
  PRIMARY KEY (`area_id`),
  UNIQUE KEY `UK_AREA` (`area_name`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_area
-- ----------------------------
INSERT INTO `tb_area` VALUES ('2', '北苑', '1', null, null);
INSERT INTO `tb_area` VALUES ('3', '包河区', '5', '2019-03-18 21:11:15', '2019-03-18 21:55:39');
INSERT INTO `tb_area` VALUES ('4', '瑶海区', '5', '2019-03-18 21:56:06', '2019-03-18 22:06:13');
INSERT INTO `tb_area` VALUES ('5', '蜀山区', '6', '2019-03-18 21:58:26', '2019-03-18 21:58:26');
INSERT INTO `tb_area` VALUES ('6', '政务区', '10', '2019-03-18 21:59:16', '2019-03-18 21:59:16');
INSERT INTO `tb_area` VALUES ('7', '庐阳区', '7', '2019-03-18 22:00:37', '2019-03-18 22:00:37');
INSERT INTO `tb_area` VALUES ('9', '新站区', '5', '2019-03-18 22:02:28', '2019-03-18 22:07:21');
INSERT INTO `tb_area` VALUES ('10', '滨湖区', '5', '2019-03-18 22:08:03', '2019-03-18 22:08:03');
