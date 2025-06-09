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
 * 报修信息：(RepairRequestInformation)表实体类
 *
 */
@TableName("`repair_request_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class RepairRequestInformation implements Serializable {

    // RepairRequestInformation编号
    @TableId(value = "repair_request_information_id", type = IdType.AUTO)
    private Integer repair_request_information_id;

    // 业主用户
    @TableField(value = "`owner_user`")
    private Integer owner_user;
    // 报修问题
    @TableField(value = "`problems_reported_for_repair`")
    private String problems_reported_for_repair;
    // 现场照片
    @TableField(value = "`site_photos`")
    private String site_photos;
    // 报修地点
    @TableField(value = "`repair_location`")
    private String repair_location;
    // 问题描述
    @TableField(value = "`problem_description`")
    private String problem_description;



    // 审核状态
    @TableField(value = "examine_state")
    private String examine_state;



    // 审核回复
    @TableField(value = "examine_reply")
    private String examine_reply;




    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
