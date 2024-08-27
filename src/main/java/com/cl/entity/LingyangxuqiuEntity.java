package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 领养需求
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
@TableName("lingyangxuqiu")
public class LingyangxuqiuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LingyangxuqiuEntity() {
		
	}
	
	public LingyangxuqiuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 宠物类型
	 */
					
	private String chongwuleixing;
	
	/**
	 * 领养目的
	 */
					
	private String lingyangmude;
	
	/**
	 * 领养期望
	 */
					
	private String lingyangqiwang;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：宠物类型
	 */
	public void setChongwuleixing(String chongwuleixing) {
		this.chongwuleixing = chongwuleixing;
	}
	/**
	 * 获取：宠物类型
	 */
	public String getChongwuleixing() {
		return chongwuleixing;
	}
	/**
	 * 设置：领养目的
	 */
	public void setLingyangmude(String lingyangmude) {
		this.lingyangmude = lingyangmude;
	}
	/**
	 * 获取：领养目的
	 */
	public String getLingyangmude() {
		return lingyangmude;
	}
	/**
	 * 设置：领养期望
	 */
	public void setLingyangqiwang(String lingyangqiwang) {
		this.lingyangqiwang = lingyangqiwang;
	}
	/**
	 * 获取：领养期望
	 */
	public String getLingyangqiwang() {
		return lingyangqiwang;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}

}
