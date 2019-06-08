# --- create database for mica server
create database mica;
-- user info table
CREATE TABLE `user` (
  `id` INT(20) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(50) DEFAULT NULL COMMENT 'user name',
  `password` VARCHAR(50) DEFAULT NULL COMMENT 'user name',
  `create_time` datetime NOT NULL,
  `modify_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'user info';

-- job
CREATE TABLE `job` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) NOT NULL COMMENT 'job name',
  `cron` VARCHAR(50) NOT NULL,
  `app` VARCHAR(50) NOT NULL,
  `des` VARCHAR(1024) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'user info';


