package com.cl.dao;

import com.cl.entity.ChongwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongwuxinxiView;


/**
 * 宠物信息
 * 
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
public interface ChongwuxinxiDao extends BaseMapper<ChongwuxinxiEntity> {
	
	List<ChongwuxinxiView> selectListView(@Param("ew") Wrapper<ChongwuxinxiEntity> wrapper);

	List<ChongwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwuxinxiEntity> wrapper);
	
	ChongwuxinxiView selectView(@Param("ew") Wrapper<ChongwuxinxiEntity> wrapper);
	

}
