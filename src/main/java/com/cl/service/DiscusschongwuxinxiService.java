package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusschongwuxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusschongwuxinxiView;


/**
 * 宠物信息评论表
 *
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
public interface DiscusschongwuxinxiService extends IService<DiscusschongwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwuxinxiView> selectListView(Wrapper<DiscusschongwuxinxiEntity> wrapper);
   	
   	DiscusschongwuxinxiView selectView(@Param("ew") Wrapper<DiscusschongwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwuxinxiEntity> wrapper);
   	

}

