SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for zk_user
-- ----------------------------
DROP TABLE IF EXISTS `ts_role`;
CREATE TABLE `ts_role` (
  `role_id` int(11) NOT NULL auto_increment,
  `name` varchar(255) NOT NULL ,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 auto_increment=1;
