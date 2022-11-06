/*
 Navicat Premium Data Transfer

 Source Server         : admin
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : pos

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 06/11/2022 12:20:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for pos_category
-- ----------------------------
DROP TABLE IF EXISTS `pos_category`;
CREATE TABLE `pos_category`  (
  `category_id` bigint NOT NULL AUTO_INCREMENT COMMENT '类别ID',
  `category_name` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '类别名称',
  `create_by` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建者',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新者',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`category_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pos_category
-- ----------------------------
INSERT INTO `pos_category` VALUES (1, '文具', NULL, '2022-11-06 12:18:08', NULL, NULL);
INSERT INTO `pos_category` VALUES (2, '日用品', NULL, '2022-11-06 12:18:12', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
