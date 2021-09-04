CREATE TABLE `standard` (
    `id` INT(10) NOT NULL AUTO_INCREMENT COMMENT 'Id',
    `std_num` VARCHAR(50) NOT NULL COMMENT '标准号',
    `zhname` VARCHAR(40) NOT NULL COMMENT '中文名称',
    `version` VARCHAR(10) NOT NULL COMMENT '版本',
    `keys` VARCHAR(50) NOT NULL COMMENT '关键字',
    `release_date` DATETIME DEFAULT NULL COMMENT '发布日期',
    `impl_date` DATETIME DEFAULT NULL COMMENT '实施日期',
    `package_path` VARCHAR(100) NOT NULL COMMENT '附件路径',
PRIMARY KEY (`id`),
UNIQUE KEY `std_num` (`std_num`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8

INSERT INTO `standard` (`id`, `std_num`, `zhname`, `version`, `keys`, `release_date`, `impl_date`, `package_path`) VALUES('1','GB 6657.1-2014','玩具安全 第一部分：基本规范','2014','1','2014-05-06 00:00:00','2016-01-01 00:00:00','e:a/b/v');
INSERT INTO `standard` (`id`, `std_num`, `zhname`, `version`, `keys`, `release_date`, `impl_date`, `package_path`) VALUES('2','GB 6657.2-2014','玩具安全 第二部分：机械与物理性能','2014','2','2014-05-06 00:00:00','2016-01-01 00:00:00','e:a/b/c');
INSERT INTO `standard` (`id`, `std_num`, `zhname`, `version`, `keys`, `release_date`, `impl_date`, `package_path`) VALUES('3','GB 6657.3-2014','玩具安全 第三部分：易燃性能','2014','3','2014-05-06 00:00:00','2016-01-01 00:00:00','e:a/b/c');
INSERT INTO `standard` (`id`, `std_num`, `zhname`, `version`, `keys`, `release_date`, `impl_date`, `package_path`) VALUES('4','GB 6657.4-2014','玩具安全 第四部分：特定元素的迁移','2014','4','2014-05-06 00:00:00','2016-01-01 00:00:00','e:a/b/c');

INSERT INTO `standard` (`id`, `std_num`, `zhname`, `version`, `keys`, `release_date`, `impl_date`, `package_path`) VALUES('5','GB 6657.5-2014','玩具 第五部分：特定','2014','4','2014-05-06','2016-01-01','e:a/b/c');