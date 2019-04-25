SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for zk_user
-- ----------------------------
DROP TABLE IF EXISTS `ts_city`;
CREATE TABLE `ts_city` (
  `city_id` int(11) NOT NULL auto_increment,
  `cityname` varchar(255) NOT NULL ,
  `parent_id` int(11) NOT NULL ,
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 auto_increment=1;
