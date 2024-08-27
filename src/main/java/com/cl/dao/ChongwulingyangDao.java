package com.cl.dao;

import com.cl.entity.ChongwulingyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongwulingyangView;


/**
 * 宠物领养
 * 
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
public interface ChongwulingyangDao extends BaseMapper<ChongwulingyangEntity> {
	
	List<ChongwulingyangView> selectListView(@Param("ew") Wrapper<ChongwulingyangEntity> wrapper);

	List<ChongwulingyangView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwulingyangEntity> wrapper);
	
	ChongwulingyangView selectView(@Param("ew") Wrapper<ChongwulingyangEntity> wrapper);
	

}
