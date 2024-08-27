package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ChongwuxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongwuxinxiView;


/**
 * 宠物信息
 *
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
public interface ChongwuxinxiService extends IService<ChongwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuxinxiView> selectListView(Wrapper<ChongwuxinxiEntity> wrapper);
   	
   	ChongwuxinxiView selectView(@Param("ew") Wrapper<ChongwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuxinxiEntity> wrapper);
   	

}

