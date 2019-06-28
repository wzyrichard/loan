/*
Navicat MySQL Data Transfer

Source Server         : LocalMySQL
Source Server Version : 50725
Source Host           : 127.0.0.1:3306
Source Database       : db_loan

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-06-28 09:07:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_business_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_business_info`;
CREATE TABLE `tb_business_info` (
  `bizId` bigint(12) NOT NULL AUTO_INCREMENT COMMENT '营业信息主键',
  PRIMARY KEY (`bizId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_business_info
-- ----------------------------

-- ----------------------------
-- Table structure for tb_loan
-- ----------------------------
DROP TABLE IF EXISTS `tb_loan`;
CREATE TABLE `tb_loan` (
  `loanId` bigint(12) NOT NULL AUTO_INCREMENT COMMENT '贷款主键',
  PRIMARY KEY (`loanId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_loan
-- ----------------------------

-- ----------------------------
-- Table structure for tb_material
-- ----------------------------
DROP TABLE IF EXISTS `tb_material`;
CREATE TABLE `tb_material` (
  `mdId` bigint(12) NOT NULL AUTO_INCREMENT COMMENT '资料主键',
  PRIMARY KEY (`mdId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_material
-- ----------------------------

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `uid` bigint(12) NOT NULL AUTO_INCREMENT COMMENT '用户主键',
  `username` varchar(60) DEFAULT '' COMMENT '用户名称',
  `password` varchar(64) DEFAULT '' COMMENT '用户名称',
  `avatar` varchar(255) DEFAULT '' COMMENT '用户头像',
  `gender` varchar(8) DEFAULT '' COMMENT '用户性别',
  `age` int(4) DEFAULT '1' COMMENT '用户年龄',
  `id_card` varchar(18) DEFAULT '' COMMENT '用户身份证号码',
  `ancestral_home` varchar(255) DEFAULT '' COMMENT '用户祖籍',
  `current_residence` varchar(255) DEFAULT '' COMMENT '用户现居住地',
  `family_population` int(8) DEFAULT '0' COMMENT '用户家庭成员',
  `remark` varchar(255) DEFAULT '' COMMENT '用户备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'znlccy', 'e10adc3949ba59abbe56e057f20f883e', '', '', '1', '', '', '', '0', '', null, null);
