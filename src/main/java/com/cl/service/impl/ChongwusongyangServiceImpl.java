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


import com.cl.dao.ChongwusongyangDao;
import com.cl.entity.ChongwusongyangEntity;
import com.cl.service.ChongwusongyangService;
import com.cl.entity.view.ChongwusongyangView;

@Service("chongwusongyangService")
public class ChongwusongyangServiceImpl extends ServiceImpl<ChongwusongyangDao, ChongwusongyangEntity> implements ChongwusongyangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwusongyangEntity> page = this.selectPage(
                new Query<ChongwusongyangEntity>(params).getPage(),
                new EntityWrapper<ChongwusongyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwusongyangEntity> wrapper) {
		  Page<ChongwusongyangView> page =new Query<ChongwusongyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChongwusongyangView> selectListView(Wrapper<ChongwusongyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwusongyangView selectView(Wrapper<ChongwusongyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
