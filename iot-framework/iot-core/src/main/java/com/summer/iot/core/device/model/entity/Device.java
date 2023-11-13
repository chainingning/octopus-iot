package com.summer.iot.core.device.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 设备表
 *
 */
@Data
@TableName("dev_device")
public class Device {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer id;
    
	/**
	 * 产品 ID
	 */
	private Integer productId;
    
	/**
	 * 名称
	 */
	private String name;
    
	/**
	 * 所属机构id
	 */
	private Integer orgId;
    
	/**
	 * 标识
	 */
	private String code;
    
	/**
	 * 图片地址
	 */
	private String photoUrl;
    
	/**
	 * 设备状态[dev_device_state]
	 */
	private String state;
    
	/**
	 * 父设备ID
	 */
	private Integer parentId;
    
	/**
	 * 配置
	 */
	private String config;
    
	/**
	 * 激活时间
	 */
	private LocalDateTime registryTime;
    
	/**
	 * 描述
	 */
	private String remark;
    
	/**
	 * 逻辑删除标识，未删除为;0，已删除为删除时间
	 */
	private Long deleted;
    
	/**
	 * 租户ID
	 */
	private Integer tenantId;
    
	/**
	 * 创建人
	 */
	private Integer createBy;
    
	/**
	 * 修改人
	 */
	private Integer updateBy;
    
	/**
	 * 创建时间
	 */
	@TableField(fill = FieldFill.INSERT)
	private LocalDateTime createTime;
    
	/**
	 * 修改时间
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private LocalDateTime updateTime;
    

}
