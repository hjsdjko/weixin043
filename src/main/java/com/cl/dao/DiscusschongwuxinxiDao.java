package com.cl.dao;

import com.cl.entity.DiscusschongwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusschongwuxinxiView;


/**
 * 宠物信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
public interface DiscusschongwuxinxiDao extends BaseMapper<DiscusschongwuxinxiEntity> {
	
	List<DiscusschongwuxinxiView> selectListView(@Param("ew") Wrapper<DiscusschongwuxinxiEntity> wrapper);

	List<DiscusschongwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwuxinxiEntity> wrapper);
	
	DiscusschongwuxinxiView selectView(@Param("ew") Wrapper<DiscusschongwuxinxiEntity> wrapper);
	

}
