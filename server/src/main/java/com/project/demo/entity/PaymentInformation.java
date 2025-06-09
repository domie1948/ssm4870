package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 缴费信息：(PaymentInformation)表实体类
 *
 */
@TableName("`payment_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class PaymentInformation implements Serializable {

    // PaymentInformation编号
    @TableId(value = "payment_information_id", type = IdType.AUTO)
    private Integer payment_information_id;

    // 业主
    @TableField(value = "`owner`")
    private Integer owner;
    // 月份
    @TableField(value = "`month`")
    private String month;
    // 房号
    @TableField(value = "`room_number`")
    private String room_number;
    // 缴费名称
    @TableField(value = "`payment_name`")
    private String payment_name;
    // 缴费金额
    @TableField(value = "`payment_amount`")
    private Integer payment_amount;
    // 备注
    @TableField(value = "`remarks`")
    private String remarks;




    // 支付状态
    @TableField(value = "pay_state")
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @TableField(value = "pay_type")
    private String pay_type;






    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
