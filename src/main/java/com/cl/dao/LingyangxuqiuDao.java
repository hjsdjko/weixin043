package com.cl.dao;

import com.cl.entity.LingyangxuqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LingyangxuqiuView;


/**
 * 领养需求
 * 
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
public interface LingyangxuqiuDao extends BaseMapper<LingyangxuqiuEntity> {
	
	List<LingyangxuqiuView> selectListView(@Param("ew") Wrapper<LingyangxuqiuEntity> wrapper);

	List<LingyangxuqiuView> selectListView(Pagination page,@Param("ew") Wrapper<LingyangxuqiuEntity> wrapper);
	
	LingyangxuqiuView selectView(@Param("ew") Wrapper<LingyangxuqiuEntity> wrapper);
	

}
