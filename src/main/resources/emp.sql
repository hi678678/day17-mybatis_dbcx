/*
 Navicat Premium Data Transfer

 Source Server         : 111
 Source Server Type    : MySQL
 Source Server Version : 80100
 Source Host           : localhost:3306
 Source Schema         : mybaits

 Target Server Type    : MySQL
 Target Server Version : 80100
 File Encoding         : 65001

 Date: 05/09/2023 16:53:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '员工姓名',
  `age` int NULL DEFAULT NULL COMMENT '员工年龄',
  `addr` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '籍贯',
  `salary` decimal(10, 2) NULL DEFAULT NULL COMMENT '薪资',
  `dept_id` int NULL DEFAULT NULL COMMENT '部门id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (1, '张三', 20, '广西来宾', 7600.00, 1);
INSERT INTO `emp` VALUES (2, '李四', 22, '浙江绍兴', 6800.00, 4);
INSERT INTO `emp` VALUES (3, '小明', 25, '广东云浮', 6600.00, 2);
INSERT INTO `emp` VALUES (4, '小红', 23, '河南信阳', 7000.00, 3);

SET FOREIGN_KEY_CHECKS = 1;
