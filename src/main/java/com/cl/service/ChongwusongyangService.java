package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ChongwusongyangEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ChongwusongyangView;


/**
 * 宠物送养
 *
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
public interface ChongwusongyangService extends IService<ChongwusongyangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwusongyangView> selectListView(Wrapper<ChongwusongyangEntity> wrapper);
   	
   	ChongwusongyangView selectView(@Param("ew") Wrapper<ChongwusongyangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwusongyangEntity> wrapper);
   	

}

