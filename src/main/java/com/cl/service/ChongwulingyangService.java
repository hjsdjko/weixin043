package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ChongwulingyangEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongwulingyangView;


/**
 * 宠物领养
 *
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
public interface ChongwulingyangService extends IService<ChongwulingyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwulingyangView> selectListView(Wrapper<ChongwulingyangEntity> wrapper);
   	
   	ChongwulingyangView selectView(@Param("ew") Wrapper<ChongwulingyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwulingyangEntity> wrapper);
   	

}

