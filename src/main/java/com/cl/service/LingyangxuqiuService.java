package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.LingyangxuqiuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LingyangxuqiuView;


/**
 * 领养需求
 *
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
public interface LingyangxuqiuService extends IService<LingyangxuqiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyangxuqiuView> selectListView(Wrapper<LingyangxuqiuEntity> wrapper);
   	
   	LingyangxuqiuView selectView(@Param("ew") Wrapper<LingyangxuqiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyangxuqiuEntity> wrapper);
   	

}

