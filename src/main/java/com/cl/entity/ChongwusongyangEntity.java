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
 * 宠物送养
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
@TableName("chongwusongyang")
public class ChongwusongyangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwusongyangEntity() {
		
	}
	
	public ChongwusongyangEntity(T t) {
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
	 * 宠物性别
	 */
					
	private String chongwuxingbie;
	
	/**
	 * 宠物年龄
	 */
					
	private String chongwunianling;
	
	/**
	 * 是否已注射疫苗
	 */
					
	private String shifouyizhusheyimiao;
	
	/**
	 * 是否已绝育
	 */
					
	private String shifouyijueyu;
	
	/**
	 * 是否已驱虫
	 */
					
	private String shifouyiquchong;
	
	/**
	 * 是否免费
	 */
					
	private String shifoumianfei;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 回复内容
	 */
					
	private String shhf;
	
	
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
	 * 设置：是否已注射疫苗
	 */
	public void setShifouyizhusheyimiao(String shifouyizhusheyimiao) {
		this.shifouyizhusheyimiao = shifouyizhusheyimiao;
	}
	/**
	 * 获取：是否已注射疫苗
	 */
	public String getShifouyizhusheyimiao() {
		return shifouyizhusheyimiao;
	}
	/**
	 * 设置：是否已绝育
	 */
	public void setShifouyijueyu(String shifouyijueyu) {
		this.shifouyijueyu = shifouyijueyu;
	}
	/**
	 * 获取：是否已绝育
	 */
	public String getShifouyijueyu() {
		return shifouyijueyu;
	}
	/**
	 * 设置：是否已驱虫
	 */
	public void setShifouyiquchong(String shifouyiquchong) {
		this.shifouyiquchong = shifouyiquchong;
	}
	/**
	 * 获取：是否已驱虫
	 */
	public String getShifouyiquchong() {
		return shifouyiquchong;
	}
	/**
	 * 设置：是否免费
	 */
	public void setShifoumianfei(String shifoumianfei) {
		this.shifoumianfei = shifoumianfei;
	}
	/**
	 * 获取：是否免费
	 */
	public String getShifoumianfei() {
		return shifoumianfei;
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
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：回复内容
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}

}
