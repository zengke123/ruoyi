-- 订单管理表
DROP TABLE IF EXISTS `sys_order`;
CREATE TABLE `sys_order` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `order_no` varchar(50) NOT NULL COMMENT '订单编号',
  `customer_name` varchar(50) NOT NULL COMMENT '客户姓名',
  `customer_phone` varchar(20) NOT NULL COMMENT '客户电话',
  `product_name` varchar(100) NOT NULL COMMENT '商品名称',
  `quantity` int(11) NOT NULL DEFAULT '1' COMMENT '数量',
  `unit_price` decimal(10,2) NOT NULL COMMENT '单价',
  `total_amount` decimal(10,2) NOT NULL COMMENT '总金额',
  `order_status` char(1) DEFAULT '0' COMMENT '订单状态（0待处理 1已确认 2配送中 3已完成 4已取消）',
  `payment_status` char(1) DEFAULT '0' COMMENT '支付状态（0未支付 1已支付 2已退款）',
  `shipping_address` varchar(200) DEFAULT NULL COMMENT '收货地址',
  `create_by` varchar(64) DEFAULT '' COMMENT '创建者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) DEFAULT '' COMMENT '更新者',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`order_id`),
  UNIQUE KEY `uk_order_no` (`order_no`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='订单管理表';

-- 菜单 SQL
INSERT INTO sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
VALUES ('订单管理', 1, 5, '/system/order', 'C', '0', 'system:order:view', 'fa fa-shopping-cart', 'admin', sysdate(), '', NULL, '订单管理菜单');

-- 按钮父菜单ID
SET @parentId = LAST_INSERT_ID();

-- 按钮 SQL
INSERT INTO sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
VALUES ('订单查询', @parentId, 1, '#', 'F', '0', 'system:order:list', '#', 'admin', sysdate(), '', NULL, '');

INSERT INTO sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
VALUES ('订单新增', @parentId, 2, '#', 'F', '0', 'system:order:add', '#', 'admin', sysdate(), '', NULL, '');

INSERT INTO sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
VALUES ('订单修改', @parentId, 3, '#', 'F', '0', 'system:order:edit', '#', 'admin', sysdate(), '', NULL, '');

INSERT INTO sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
VALUES ('订单删除', @parentId, 4, '#', 'F', '0', 'system:order:remove', '#', 'admin', sysdate(), '', NULL, '');
