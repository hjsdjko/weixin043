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
 * 用户
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
@TableName("yonghu")
public class YonghuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonghuEntity() {
		
	}
	
	public YonghuEntity(T t) {
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
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 生日
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shengri;
	
	/**
	 * 所在城市
	 */
					
	private String suozaichengshi;
	
	/**
	 * 我的宠物
	 */
					
	private String wodechongwu;
	
	/**
	 * 个人标签
	 */
					
	private String gerenbiaoqian;
	
	/**
	 * 我的简介
	 */
					
	private String wodejianjie;
	
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：生日
	 */
	public void setShengri(Date shengri) {
		this.shengri = shengri;
	}
	/**
	 * 获取：生日
	 */
	public Date getShengri() {
		return shengri;
	}
	/**
	 * 设置：所在城市
	 */
	public void setSuozaichengshi(String suozaichengshi) {
		this.suozaichengshi = suozaichengshi;
	}
	/**
	 * 获取：所在城市
	 */
	public String getSuozaichengshi() {
		return suozaichengshi;
	}
	/**
	 * 设置：我的宠物
	 */
	public void setWodechongwu(String wodechongwu) {
		this.wodechongwu = wodechongwu;
	}
	/**
	 * 获取：我的宠物
	 */
	public String getWodechongwu() {
		return wodechongwu;
	}
	/**
	 * 设置：个人标签
	 */
	public void setGerenbiaoqian(String gerenbiaoqian) {
		this.gerenbiaoqian = gerenbiaoqian;
	}
	/**
	 * 获取：个人标签
	 */
	public String getGerenbiaoqian() {
		return gerenbiaoqian;
	}
	/**
	 * 设置：我的简介
	 */
	public void setWodejianjie(String wodejianjie) {
		this.wodejianjie = wodejianjie;
	}
	/**
	 * 获取：我的简介
	 */
	public String getWodejianjie() {
		return wodejianjie;
	}

}
