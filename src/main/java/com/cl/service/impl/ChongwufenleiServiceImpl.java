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


import com.cl.dao.ChongwufenleiDao;
import com.cl.entity.ChongwufenleiEntity;
import com.cl.service.ChongwufenleiService;
import com.cl.entity.view.ChongwufenleiView;

@Service("chongwufenleiService")
public class ChongwufenleiServiceImpl extends ServiceImpl<ChongwufenleiDao, ChongwufenleiEntity> implements ChongwufenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwufenleiEntity> page = this.selectPage(
                new Query<ChongwufenleiEntity>(params).getPage(),
                new EntityWrapper<ChongwufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwufenleiEntity> wrapper) {
		  Page<ChongwufenleiView> page =new Query<ChongwufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ChongwufenleiView> selectListView(Wrapper<ChongwufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwufenleiView selectView(Wrapper<ChongwufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
