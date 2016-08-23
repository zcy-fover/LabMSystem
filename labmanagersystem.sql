/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50704
Source Host           : 127.0.0.1:3306
Source Database       : labmanagersystem

Target Server Type    : MYSQL
Target Server Version : 50704
File Encoding         : 65001

Date: 2016-07-09 10:04:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for lab_equipment
-- ----------------------------
DROP TABLE IF EXISTS `lab_equipment`;
CREATE TABLE `lab_equipment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `num` varchar(255) DEFAULT NULL,
  `point` varchar(255) DEFAULT NULL,
  `version` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lab_equipment
-- ----------------------------
INSERT INTO `lab_equipment` VALUES ('1', '酒精灯', '5次', '灯座', 'H12');

-- ----------------------------
-- Table structure for low_value_product
-- ----------------------------
DROP TABLE IF EXISTS `low_value_product`;
CREATE TABLE `low_value_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `badnum` int(11) DEFAULT NULL,
  `funtion` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `storenum` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of low_value_product
-- ----------------------------
INSERT INTO `low_value_product` VALUES ('1', '0', '切割', '刀子', '10块', '10把', '2015.12.12');

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('1', 'zhang', '123');
INSERT INTO `manager` VALUES ('2', 'haojunyi', '123');

-- ----------------------------
-- Table structure for pulish
-- ----------------------------
DROP TABLE IF EXISTS `pulish`;
CREATE TABLE `pulish` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `context` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pulish
-- ----------------------------
INSERT INTO `pulish` VALUES ('1', '提前预习', '大学物理实验');
INSERT INTO `pulish` VALUES ('2', '好好复习', '算法实验');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', 'haojunyi', '123');
INSERT INTO `student` VALUES ('2', 'zhang', '123');

-- ----------------------------
-- Table structure for stu_experiment
-- ----------------------------
DROP TABLE IF EXISTS `stu_experiment`;
CREATE TABLE `stu_experiment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isPass` tinyint(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `student` varchar(255) DEFAULT NULL,
  `teacher` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `time1` varchar(255) DEFAULT NULL,
  `time2` varchar(255) DEFAULT NULL,
  `time3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu_experiment
-- ----------------------------
INSERT INTO `stu_experiment` VALUES ('1', '1', '操作系统实验', 'yang', 'yang', '第1周 周一 第一二节', '1', '一', '一二');
INSERT INTO `stu_experiment` VALUES ('3', '1', '计算机网络实验', 'yang', 'yang', '第1周 周四 第五六节', '1', '四', '五六');
INSERT INTO `stu_experiment` VALUES ('4', '1', '操作系统实验', 'zhang', 'yang', '第1周 周一 第一二节', '1', '一', '一二');
INSERT INTO `stu_experiment` VALUES ('5', '1', '操作系统实验', 'zhang', 'yang', '第1周 周一 第一二节', '1', '一', '一二');
INSERT INTO `stu_experiment` VALUES ('6', '0', '数据库查询实验', 'zhang', 'yang', '第1周 周三 第七八节', '1', '三', '七八');

-- ----------------------------
-- Table structure for submit_experiment
-- ----------------------------
DROP TABLE IF EXISTS `submit_experiment`;
CREATE TABLE `submit_experiment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `context` varchar(255) DEFAULT NULL,
  `debug` varchar(255) DEFAULT NULL,
  `equipment` varchar(255) DEFAULT NULL,
  `experimentalProcedure` varchar(255) DEFAULT NULL,
  `experimenter` varchar(255) DEFAULT NULL,
  `experimenttime` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `resultofexperiment` varchar(255) DEFAULT NULL,
  `summaryOfExperiment` varchar(255) DEFAULT NULL,
  `teacher` varchar(255) DEFAULT NULL,
  `theBasicPrincipleAndDesignOfE` varchar(255) DEFAULT NULL,
  `path1` varchar(255) DEFAULT NULL,
  `path2` varchar(255) DEFAULT NULL,
  `path3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of submit_experiment
-- ----------------------------
INSERT INTO `submit_experiment` VALUES ('1', '内容', '调试', '工具', '步骤', 'yang', '第1周 周一 第一二节', '操作系统实验', '结果', '小结', 'yang', '原理', '/uploadfiles/student/1/IMG_1231.jpg', '/uploadfiles/student/1/IMG_1231.jpg', '/uploadfiles/student/1/IMG_1231.jpg');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', 'haojunyi', '123');
INSERT INTO `teacher` VALUES ('4', 'zhang', '123');

-- ----------------------------
-- Table structure for tea_experiment
-- ----------------------------
DROP TABLE IF EXISTS `tea_experiment`;
CREATE TABLE `tea_experiment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isPass` tinyint(1) DEFAULT NULL,
  `lab_equipment` varchar(255) DEFAULT NULL,
  `low_value_product` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `teacher` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `time1` varchar(255) DEFAULT NULL,
  `time2` varchar(255) DEFAULT NULL,
  `time3` varchar(255) DEFAULT NULL,
  `ExperimentalProcedure` varchar(255) DEFAULT NULL,
  `context` varchar(255) DEFAULT NULL,
  `equipment` varchar(255) DEFAULT NULL,
  `theBasicPrincipleAndDesignOfE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tea_experiment
-- ----------------------------
INSERT INTO `tea_experiment` VALUES ('1', '1', '尺子', '刀子', '操作系统实验', 'yang', '第1周 周一 第一二节', '1', '一', '一二', '操作系统实验步骤', '操作系统实验内容', '操作系统实验工具', '操作系统原理与设计');
INSERT INTO `tea_experiment` VALUES ('2', '1', '剪刀', '电线', '计算机网络实验', 'yang', '第1周 周四 第五六节', '1', '四', '五六', '计算机网络实验步骤', '计算机网络实验内容', '计算机网络实验工具', '计算机网络原理与设计');
INSERT INTO `tea_experiment` VALUES ('3', '1', '45', '23', '数据库查询实验', 'yang', '第1周 周三 第七八节', '1', '三', '七八', '43', '12', '54', '32');
