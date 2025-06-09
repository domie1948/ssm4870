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
 * 投诉建议：(ComplaintSuggestions)表实体类
 *
 */
@TableName("`complaint_suggestions`")
@Data
@EqualsAndHashCode(callSuper = false)
public class ComplaintSuggestions implements Serializable {

    // ComplaintSuggestions编号
    @TableId(value = "complaint_suggestions_id", type = IdType.AUTO)
    private Integer complaint_suggestions_id;

    // 业主
    @TableField(value = "`owner`")
    private Integer owner;
    // 房号
    @TableField(value = "`room_number`")
    private String room_number;
    // 投诉问题
    @TableField(value = "`complaint_issues`")
    private String complaint_issues;
    // 建议反馈
    @TableField(value = "`suggested_feedback`")
    private String suggested_feedback;
    // 相关图片
    @TableField(value = "`related_pictures`")
    private String related_pictures;



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
