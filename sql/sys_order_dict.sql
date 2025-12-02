-- 订单状态字典
INSERT INTO sys_dict_type (dict_name, dict_type, status, create_by, create_time, remark) 
VALUES ('订单状态', 'order_status', '0', 'admin', sysdate(), '订单状态列表');

SET @dictTypeId = LAST_INSERT_ID();

INSERT INTO sys_dict_data (dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, remark)
VALUES (1, '待处理', '0', 'order_status', '', 'info', 'Y', '0', 'admin', sysdate(), '订单待处理');

INSERT INTO sys_dict_data (dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, remark)
VALUES (2, '已确认', '1', 'order_status', '', 'primary', 'N', '0', 'admin', sysdate(), '订单已确认');

INSERT INTO sys_dict_data (dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, remark)
VALUES (3, '配送中', '2', 'order_status', '', 'warning', 'N', '0', 'admin', sysdate(), '订单配送中');

INSERT INTO sys_dict_data (dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, remark)
VALUES (4, '已完成', '3', 'order_status', '', 'success', 'N', '0', 'admin', sysdate(), '订单已完成');

INSERT INTO sys_dict_data (dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, remark)
VALUES (5, '已取消', '4', 'order_status', '', 'danger', 'N', '0', 'admin', sysdate(), '订单已取消');

-- 支付状态字典
INSERT INTO sys_dict_type (dict_name, dict_type, status, create_by, create_time, remark) 
VALUES ('支付状态', 'payment_status', '0', 'admin', sysdate(), '支付状态列表');

SET @dictTypeId2 = LAST_INSERT_ID();

INSERT INTO sys_dict_data (dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, remark)
VALUES (1, '未支付', '0', 'payment_status', '', 'warning', 'Y', '0', 'admin', sysdate(), '未支付');

INSERT INTO sys_dict_data (dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, remark)
VALUES (2, '已支付', '1', 'payment_status', '', 'success', 'N', '0', 'admin', sysdate(), '已支付');

INSERT INTO sys_dict_data (dict_sort, dict_label, dict_value, dict_type, css_class, list_class, is_default, status, create_by, create_time, remark)
VALUES (3, '已退款', '2', 'payment_status', '', 'danger', 'N', '0', 'admin', sysdate(), '已退款');
