package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.DiscusschongwuxinxiDao;
import com.cl.entity.DiscusschongwuxinxiEntity;
import com.cl.service.DiscusschongwuxinxiService;
import com.cl.entity.view.DiscusschongwuxinxiView;

@Service("discusschongwuxinxiService")
public class DiscusschongwuxinxiServiceImpl extends ServiceImpl<DiscusschongwuxinxiDao, DiscusschongwuxinxiEntity> implements DiscusschongwuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwuxinxiEntity> page = this.selectPage(
                new Query<DiscusschongwuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwuxinxiEntity> wrapper) {
		  Page<DiscusschongwuxinxiView> page =new Query<DiscusschongwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusschongwuxinxiView> selectListView(Wrapper<DiscusschongwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwuxinxiView selectView(Wrapper<DiscusschongwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
