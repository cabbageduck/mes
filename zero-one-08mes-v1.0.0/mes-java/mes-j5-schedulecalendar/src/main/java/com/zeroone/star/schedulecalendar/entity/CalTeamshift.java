package com.zeroone.star.schedulecalendar.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 班组排班表
 * </p>
 *
 * @author nangua
 * @since 2024-05-28
 */
@Getter
@Setter
@TableName("cal_teamshift")
public class CalTeamshift implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 流水号
     */
    @TableId(value = "record_id", type = IdType.AUTO)
    private Long recordId;

    /**
     * 日期
     */
    private String theDay;

    /**
     * 班组ID
     */
    private Long teamId;

    /**
     * 班组名称
     */
    private String teamName;

    /**
     * 班次ID
     */
    private Long shiftId;

    /**
     * 班次名称
     */
    private String shiftName;

    /**
     * 序号
     */
    private Integer orderNum;

    /**
     * 计划ID
     */
    private Long planId;

    /**
     * 班组类型
     */
    private String calendarType;

    /**
     * 轮班方式
     */
    private String shiftType;

    /**
     * 备注
     */
    private String remark;

    /**
     * 预留字段1
     */
    private String attr1;

    /**
     * 预留字段2
     */
    private String attr2;

    /**
     * 预留字段3
     */
    private Integer attr3;

    /**
     * 预留字段4
     */
    private Integer attr4;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
