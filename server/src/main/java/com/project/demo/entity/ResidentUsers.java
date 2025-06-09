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
 * 居民用户：(ResidentUsers)表实体类
 *
 */
@TableName("`resident_users`")
@Data
@EqualsAndHashCode(callSuper = false)
public class ResidentUsers implements Serializable {

    // ResidentUsers编号
    @TableId(value = "resident_users_id", type = IdType.AUTO)
    private Integer resident_users_id;

    // 姓名
    @TableField(value = "`full_name`")
    private String full_name;
    // 房号
    @TableField(value = "`room_number`")
    private String room_number;







    // 用户编号
    @TableField(value = "user_id")
    private Integer userId;



    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
