package com.cl.dao;

import com.cl.entity.ChongwusongyangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongwusongyangView;


/**
 * 宠物送养
 * 
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
public interface ChongwusongyangDao extends BaseMapper<ChongwusongyangEntity> {
	
	List<ChongwusongyangView> selectListView(@Param("ew") Wrapper<ChongwusongyangEntity> wrapper);

	List<ChongwusongyangView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwusongyangEntity> wrapper);
	
	ChongwusongyangView selectView(@Param("ew") Wrapper<ChongwusongyangEntity> wrapper);
	

}
