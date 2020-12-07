drop table if exists t_sys_dept;
create table t_sys_dept
(
  dept_id     int(11)     not null AUTO_INCREMENT comment '系统部门Id',
  dept_name   varchar(32) not null comment '部门名称',
  status      tinyint(4)       default 1 comment '0.无效 1.有效',
  create_id   int(11) comment '创建人',
  create_time datetime comment '创建时间',
  update_time TIMESTAMP   NULL DEFAULT CURRENT_TIMESTAMP() comment '更新时间',
  primary key (dept_id) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8 COMMENT ='系统部门表';

drop table if exists t_sys_app;
create table t_sys_app
(
  auto_id     int(11)     not null AUTO_INCREMENT comment '系统平台Id,',
  app_code    varchar(16) not null comment '平台编码, C00000001',
  app_name    varchar(32) comment '平台名称',
  status      tinyint(4)       default 1 comment '0.无效 1.有效',
  create_id   int(11) comment '创建人',
  create_time TIMESTAMP   NULL DEFAULT CURRENT_TIMESTAMP() comment '创建时间',
  update_time timestamp   NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() comment '更新时间',
  primary key (auto_id) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8 COMMENT ='系统平台表';

drop table if exists t_sys_user;
create table t_sys_user
(
  user_id     int(11)     not null AUTO_INCREMENT comment '系统用户Id',
  app_code    varchar(16) comment '平台编码',
  dept_id     int(11) comment '部门Id',
  user_type   tinyint(4) default 1 comment '用户类型 1.普通用户 2.系统管理员, 3.平台管理员',
  username    varchar(32) not null comment '登陆账号',
  password    varchar(32) comment '密码',
  salt        varchar(8)  not null comment '盐',
  name        varchar(16) comment '姓名',
  mobile      varchar(16) not null comment '手机号',
  status      tinyint(4)       default 1 comment '0.无效 1.有效',
  create_id   int(11) comment '创建人',
  create_time TIMESTAMP   NULL DEFAULT CURRENT_TIMESTAMP() comment '创建时间',
  update_time timestamp   NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() comment '更新时间',
  primary key (user_id) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8 COMMENT ='系统用户表';

drop table if exists t_user_role;
create table t_user_role
(
  auto_id int(11) not null AUTO_INCREMENT comment '自增id',
  user_id int(11) not null comment '系统用户Id',
  role_id int(11) not null comment '系统角色Id',
  primary key (auto_id) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8 COMMENT ='系统用户角色表';

drop table if exists t_sys_role;
create table t_sys_role
(
  role_id     int(11)     not null AUTO_INCREMENT comment '系统角色Id',
  role_name   varchar(32) not null comment '角色名称',
  status      tinyint(4)       default 1 comment '0.无效 1.有效',
  create_id   int(11) comment '创建人',
  create_time TIMESTAMP   NULL DEFAULT CURRENT_TIMESTAMP() comment '创建时间',
  update_time timestamp   NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() comment '更新时间',
  primary key (role_id) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8 COMMENT ='系统角色表';

drop table if exists t_role_menu;
create table t_role_menu
(
  auto_id int(11) not null AUTO_INCREMENT comment '自增id',
  role_id int(11) not null comment '系统角色Id',
  menu_id int(11) not null comment '系统菜单Id',
  primary key (auto_id) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8 COMMENT ='系统角色对应菜单表';

drop table if exists t_sys_menu;
create table t_sys_menu
(
  menu_id     int(11)     not null AUTO_INCREMENT comment '系统菜单Id',
  parent_id   int(11) comment '菜单父级Id',
  menu_code   varchar(16) comment '菜单编码',
  menu_name   varchar(32) not null comment '菜单名称',
  url         varchar(100) comment '菜单url',
  module_code tinyint(4) comment '模块编码, 默认是：0, 用来多系统菜单',
  menu_type   tinyint(4)       default 1 comment '菜单类型   0：目录   1：菜单   2：按钮',
  icon        varchar(32) comment '菜单图标',
  menu_sort   int(4) comment '菜单排序',
  remark      varchar(128) comment '菜单备注',
  status      tinyint(4)       default 1 comment '0.无效 1.有效',
  create_id   int(11) comment '创建人',
  create_time TIMESTAMP   NULL DEFAULT CURRENT_TIMESTAMP() comment '创建时间',
  update_time timestamp   NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() comment '更新时间',
  primary key (menu_id) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8 COMMENT ='系统菜单';