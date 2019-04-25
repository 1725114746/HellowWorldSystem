SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for zk_user
-- ----------------------------
DROP TABLE IF EXISTS `ts_drivercard`;
CREATE TABLE `ts_drivercard` (
  `card_id` int(11) NOT NULL auto_increment,
  `carnum` varchar(255) NOT NULL ,
  `cardname` varchar(255) NOT NULL ,
  `password` varchar(255) NOT NULL,
  `salt` varchar(255) NOT NULL,
  `sex` varchar(255),
  `city_id` int(11),
  `role_id` int(11),
  `date` date,
  PRIMARY KEY (`card_id`),
  UNIQUE `idx_carnum`(`carnum`),
  UNIQUE `idx_cardname`(`cardname`),
  UNIQUE `idx_password`(`password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 auto_increment=1;
