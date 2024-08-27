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
 * 宠物信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
@TableName("chongwuxinxi")
public class ChongwuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwuxinxiEntity() {
		
	}
	
	public ChongwuxinxiEntity(T t) {
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
	 * 宠物名称
	 */
					
	private String chongwumingcheng;
	
	/**
	 * 宠物图片
	 */
					
	private String chongwutupian;
	
	/**
	 * 宠物类型
	 */
					
	private String chongwuleixing;
	
	/**
	 * 宠物品种
	 */
					
	private String chongwupinzhong;
	
	/**
	 * 宠物性别
	 */
					
	private String chongwuxingbie;
	
	/**
	 * 宠物年龄
	 */
					
	private String chongwunianling;
	
	/**
	 * 健康状况
	 */
					
	private String jiankangzhuangkuang;
	
	/**
	 * 领养条件
	 */
					
	private String lingyangtiaojian;
	
	/**
	 * 宠物状态
	 */
					
	private String chongwuzhuangtai;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	
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
	 * 设置：宠物名称
	 */
	public void setChongwumingcheng(String chongwumingcheng) {
		this.chongwumingcheng = chongwumingcheng;
	}
	/**
	 * 获取：宠物名称
	 */
	public String getChongwumingcheng() {
		return chongwumingcheng;
	}
	/**
	 * 设置：宠物图片
	 */
	public void setChongwutupian(String chongwutupian) {
		this.chongwutupian = chongwutupian;
	}
	/**
	 * 获取：宠物图片
	 */
	public String getChongwutupian() {
		return chongwutupian;
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
	 * 设置：宠物品种
	 */
	public void setChongwupinzhong(String chongwupinzhong) {
		this.chongwupinzhong = chongwupinzhong;
	}
	/**
	 * 获取：宠物品种
	 */
	public String getChongwupinzhong() {
		return chongwupinzhong;
	}
	/**
	 * 设置：宠物性别
	 */
	public void setChongwuxingbie(String chongwuxingbie) {
		this.chongwuxingbie = chongwuxingbie;
	}
	/**
	 * 获取：宠物性别
	 */
	public String getChongwuxingbie() {
		return chongwuxingbie;
	}
	/**
	 * 设置：宠物年龄
	 */
	public void setChongwunianling(String chongwunianling) {
		this.chongwunianling = chongwunianling;
	}
	/**
	 * 获取：宠物年龄
	 */
	public String getChongwunianling() {
		return chongwunianling;
	}
	/**
	 * 设置：健康状况
	 */
	public void setJiankangzhuangkuang(String jiankangzhuangkuang) {
		this.jiankangzhuangkuang = jiankangzhuangkuang;
	}
	/**
	 * 获取：健康状况
	 */
	public String getJiankangzhuangkuang() {
		return jiankangzhuangkuang;
	}
	/**
	 * 设置：领养条件
	 */
	public void setLingyangtiaojian(String lingyangtiaojian) {
		this.lingyangtiaojian = lingyangtiaojian;
	}
	/**
	 * 获取：领养条件
	 */
	public String getLingyangtiaojian() {
		return lingyangtiaojian;
	}
	/**
	 * 设置：宠物状态
	 */
	public void setChongwuzhuangtai(String chongwuzhuangtai) {
		this.chongwuzhuangtai = chongwuzhuangtai;
	}
	/**
	 * 获取：宠物状态
	 */
	public String getChongwuzhuangtai() {
		return chongwuzhuangtai;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
