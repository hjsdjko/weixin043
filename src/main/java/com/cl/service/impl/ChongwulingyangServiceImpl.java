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


import com.cl.dao.ChongwulingyangDao;
import com.cl.entity.ChongwulingyangEntity;
import com.cl.service.ChongwulingyangService;
import com.cl.entity.view.ChongwulingyangView;

@Service("chongwulingyangService")
public class ChongwulingyangServiceImpl extends ServiceImpl<ChongwulingyangDao, ChongwulingyangEntity> implements ChongwulingyangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwulingyangEntity> page = this.selectPage(
                new Query<ChongwulingyangEntity>(params).getPage(),
                new EntityWrapper<ChongwulingyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwulingyangEntity> wrapper) {
		  Page<ChongwulingyangView> page =new Query<ChongwulingyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChongwulingyangView> selectListView(Wrapper<ChongwulingyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwulingyangView selectView(Wrapper<ChongwulingyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
