# Administrator
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| administrator_id  | int  | 主键 自增 | Id  |
| username | varchar(20)  | 非空，唯一索引 | 用户名  |
| real_name  | varchar(20)  | 索引 | 真实姓名  |
| email  | varchar(100)  | 唯一索引 | 邮箱  |
| encrypted_password  | varchar(100)  | 非空 | 加密密码  |
| status  | tinyint  | 非空，默认1启用  | 状态（0禁用，1启用）  |
| create_time  | datetime  |  非空 | 创建时间  |
| avatar_url  | varchar(100)  |   | 头像地址 |

# Address
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| address_id  | int  | 主键 自增 | Id  |
| customer_id | int  | 非空，索引,外建 | 客户id  |
| receiver_name  | varchar(20)  | 非空 | 收货人  |
| receiver_mobile  | varchar(20)  | 非空 | 收货人手机  |
| content  | varchar(100)  | 非空 | 地址内容  |
| tag  | varchar(20)  | 非空 | 地址内容  |

# Customer
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| customer_id | int | 主键自增 | id |
| username | varchar(30) | 非空,唯一索引 | 用户名 |
| real_name | varchar(20) | 非空 | 真实姓名 |
| avatar_url | varchar(100) |  | 头像 |
| encrypted_password | varchar(100) |  非空 | 加密密码 |
| mobile | varchar(20) | 唯一索引 | 手机 |
| mobile_verified | bit | 默认false | 验证邮箱 | 
| email | varchar(100) | 唯一索引 | 邮箱 | 
| email_verified | bit | 默认false | 验证邮箱 | 
| status | tinyint | 非空 | 状态(0禁用,1启用,2不安全) | 
| create_time | datetime | 非空 | 创建时间 | 
| new_subscribed | bit | 非空,默认false | 订阅新闻 | 
| reword_points | int | 非空,默认0 | 积分 | 
| default_address_id | int | 外建 | 默认地址 | 

# Product
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| product_id | int | 主键自增 | id |
| product_code | varchar(50) | 唯一索引,非空 | 商品代号 |
| product_name | varchar(100) | 非空 | 商品名称 |
| product_abstract | varchar(300) | 非空 | 摘要 |
| price | double | 非空 | 价格 |
| discount | double |  | 打折(0.01-0.99) |
| stock_quantity | int | 非空,默认0 | 库存量 |
| status | tinyint | 非空,默认1上架 | 状态(0下架,1上架,2待审核) | 
| main_pic_url  | varchar(100)  |  非空 | 主图 |
| reword_points | int | 非空 | 积分 |
| sort_order | int | | 排序(0升序,1倒序) |

# productDetail
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| product_id | int | 外建 | id |
| description | text | 非空 | 描述 |
| other_pic_urls | varchar(2000) |  | 图片(数组) |


# Order
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| order_id | bigint | 主键 自增 | id |
| customer_id | int | 非空,外建,索引 | 客户id |
| status | tinyint | 非空 | 订单状态(0已处理,1处理中,2代发货,3已发货,4代签收,5已签收,6待支付,7已支付,8取消,9拒绝,10完成,11待评价,12已评价) |
| total_price | double | 非空 | 总价 |
| reword_points | int |  | 积分 |
| create_time | datetime | 非空 | 创建时间 |
| update_time | datetime | 非空 | 更新时间 |

# OrderDetail
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| order_id | bigint | 外建 | int |
| ship_method | smallint | 非空 | 寄送方式 |
| ship_address | varchar(300) | 非空 | 寄送地址 |
| ship_price | double | 非空 | 寄送费用 |
| pay_method | smallint | 非空 | 支付方式 |
| invoic_address | varchar(300) |  | 发票地址 |
| invoice_price | double | 非空 | 发票价格 |
| comment | varchar(100) |  | 备注 |
| order_products | text | 非空 | 内容(对象数组json) |
| product_id | int | 非空 | id |
| product_code | string | 非空 | 商品代号 |
| product_name | string | 非空 | 商品名称 |
| quantity | int | 非空 | 商品数量 |
| unit_price | double | 非空 | 单价 |
| unit_reword_points | int |  | 单个积分 |

# OrderHistory
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| order_history_id | bigint | 主键 自增 | id |
| order_id | int | 非空,索引,外建 | 订单id |
| time | datetime | 非空 | 时间 |
| order_status | tinyint | 非空 | 订单状态 |
| comment | varchar(300) |  | 备注 |
| customer_notified | bit | 非空 | 是否通知客户 |

#  Return
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| return_id | int | 主键,自增 | id |
| order_id | bigint | 非空,索引,外建 | 订单id |
| order_time | datetime |  | 订单时间 |
| customer_id | int | 非空,索引,外建 | 下单客户id |
| customer_name | varchar(20) | 非空 | 退货人 |
| mobile | varchar(20) | 非空 | 手机 |
| email | varchar(100) | 非空 | 邮箱 | 
| status | tinyint | 非空 | 状态(0等待取货,1正在处理,完成) | 
| return_action | tinyint |  | 处理方式(0退货,1,换货,2修理) |
| product_code | varchar(50) | 非空 | 商品代号 |
| product_name | varchar(100) | 非空 | 商品名称 |
| quantity | int | 非空 | 商品数量 |
| reason | tinyint | 非空 | 退货原因(0发货过期,1订单错误,2收到错误商品,3质量问题) |
| opened | bit | 非空 | 是否开封 |
| comment | varchar(300) |  | 备注 |
| create_time | datetime | 非空,索引 | 创建时间 |
| update_time | datetime | 非空 | 更新时间 |

# ReturnHistory
| 字段  | 类型  | 约束  |  说明 |
|---|---|---|---|
| return_history_id | int | 主键,自增 | id |
| return_id | int | 非空,索引,外建 | 退货id |
| time | datetime | 非空 | 时间 |
| return_status | tinyint | 非空 | 退货状态 |
| comment | varchar(300) |  | 备注 |
| customer_notified | bit | 非空 | 是否通知客户 |
