package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.LingyangxuqiuEntity;
import com.cl.entity.view.LingyangxuqiuView;

import com.cl.service.LingyangxuqiuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 领养需求
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
@RestController
@RequestMapping("/lingyangxuqiu")
public class LingyangxuqiuController {
    @Autowired
    private LingyangxuqiuService lingyangxuqiuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LingyangxuqiuEntity lingyangxuqiu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			lingyangxuqiu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LingyangxuqiuEntity> ew = new EntityWrapper<LingyangxuqiuEntity>();

		PageUtils page = lingyangxuqiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lingyangxuqiu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LingyangxuqiuEntity lingyangxuqiu, 
		HttpServletRequest request){
        EntityWrapper<LingyangxuqiuEntity> ew = new EntityWrapper<LingyangxuqiuEntity>();

		PageUtils page = lingyangxuqiuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, lingyangxuqiu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LingyangxuqiuEntity lingyangxuqiu){
       	EntityWrapper<LingyangxuqiuEntity> ew = new EntityWrapper<LingyangxuqiuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( lingyangxuqiu, "lingyangxuqiu")); 
        return R.ok().put("data", lingyangxuqiuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LingyangxuqiuEntity lingyangxuqiu){
        EntityWrapper< LingyangxuqiuEntity> ew = new EntityWrapper< LingyangxuqiuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( lingyangxuqiu, "lingyangxuqiu")); 
		LingyangxuqiuView lingyangxuqiuView =  lingyangxuqiuService.selectView(ew);
		return R.ok("查询领养需求成功").put("data", lingyangxuqiuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LingyangxuqiuEntity lingyangxuqiu = lingyangxuqiuService.selectById(id);
		lingyangxuqiu = lingyangxuqiuService.selectView(new EntityWrapper<LingyangxuqiuEntity>().eq("id", id));
        return R.ok().put("data", lingyangxuqiu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LingyangxuqiuEntity lingyangxuqiu = lingyangxuqiuService.selectById(id);
		lingyangxuqiu = lingyangxuqiuService.selectView(new EntityWrapper<LingyangxuqiuEntity>().eq("id", id));
        return R.ok().put("data", lingyangxuqiu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LingyangxuqiuEntity lingyangxuqiu, HttpServletRequest request){
    	lingyangxuqiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lingyangxuqiu);
        lingyangxuqiuService.insert(lingyangxuqiu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LingyangxuqiuEntity lingyangxuqiu, HttpServletRequest request){
    	lingyangxuqiu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(lingyangxuqiu);
        lingyangxuqiuService.insert(lingyangxuqiu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LingyangxuqiuEntity lingyangxuqiu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(lingyangxuqiu);
        lingyangxuqiuService.updateById(lingyangxuqiu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        lingyangxuqiuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
