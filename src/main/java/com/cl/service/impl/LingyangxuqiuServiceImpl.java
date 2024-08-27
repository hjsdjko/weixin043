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


import com.cl.dao.LingyangxuqiuDao;
import com.cl.entity.LingyangxuqiuEntity;
import com.cl.service.LingyangxuqiuService;
import com.cl.entity.view.LingyangxuqiuView;

@Service("lingyangxuqiuService")
public class LingyangxuqiuServiceImpl extends ServiceImpl<LingyangxuqiuDao, LingyangxuqiuEntity> implements LingyangxuqiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingyangxuqiuEntity> page = this.selectPage(
                new Query<LingyangxuqiuEntity>(params).getPage(),
                new EntityWrapper<LingyangxuqiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingyangxuqiuEntity> wrapper) {
		  Page<LingyangxuqiuView> page =new Query<LingyangxuqiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<LingyangxuqiuView> selectListView(Wrapper<LingyangxuqiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingyangxuqiuView selectView(Wrapper<LingyangxuqiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
