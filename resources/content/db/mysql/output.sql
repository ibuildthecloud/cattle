
DROP TABLE IF EXISTS `network_service_provider_instance_map`;
CREATE TABLE `network_service_provider_instance_map` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `kind` varchar(255) NOT NULL,
  `uuid` varchar(128) NOT NULL,
  `description` varchar(1024) DEFAULT NULL,
  `state` varchar(128) NOT NULL,
  `created` datetime DEFAULT NULL,
  `removed` datetime DEFAULT NULL,
  `remove_time` datetime DEFAULT NULL,
  `data` text,
  `network_service_provider_id` bigint(19),
  `instance_id` bigint(19),
  KEY `idx_network_service_provider_instance_map_name` (`name`),
  KEY `idx_network_service_provider_instance_map_removed` (`removed`),
  UNIQUE KEY `idx_network_service_provider_instance_map_uuid` (`uuid`),
  KEY `idx_network_service_provider_instance_map_remove_time` (`remove_time`),
  KEY `idx_network_service_provider_instance_map_state` (`state`),
  KEY `fk_nspim_network_service_provider_id` (`network_service_provider_id`),
  CONSTRAINT `fk_nspim_network_service_provider_id` FOREIGN KEY (`network_service_provider_id`) REFERENCES `network_service_provider` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  KEY `fk_network_service_provider_instance_map_instance_id` (`instance_id`),
  CONSTRAINT `fk_network_service_provider_instance_map__instance_id` FOREIGN KEY (`instance_id`) REFERENCES `instance` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;
