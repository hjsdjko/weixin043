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

import com.cl.entity.ChongwufenleiEntity;
import com.cl.entity.view.ChongwufenleiView;

import com.cl.service.ChongwufenleiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 宠物分类
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
@RestController
@RequestMapping("/chongwufenlei")
public class ChongwufenleiController {
    @Autowired
    private ChongwufenleiService chongwufenleiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwufenleiEntity chongwufenlei,
		HttpServletRequest request){
        EntityWrapper<ChongwufenleiEntity> ew = new EntityWrapper<ChongwufenleiEntity>();

		PageUtils page = chongwufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwufenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwufenleiEntity chongwufenlei, 
		HttpServletRequest request){
        EntityWrapper<ChongwufenleiEntity> ew = new EntityWrapper<ChongwufenleiEntity>();

		PageUtils page = chongwufenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwufenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwufenleiEntity chongwufenlei){
       	EntityWrapper<ChongwufenleiEntity> ew = new EntityWrapper<ChongwufenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwufenlei, "chongwufenlei")); 
        return R.ok().put("data", chongwufenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwufenleiEntity chongwufenlei){
        EntityWrapper< ChongwufenleiEntity> ew = new EntityWrapper< ChongwufenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwufenlei, "chongwufenlei")); 
		ChongwufenleiView chongwufenleiView =  chongwufenleiService.selectView(ew);
		return R.ok("查询宠物分类成功").put("data", chongwufenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwufenleiEntity chongwufenlei = chongwufenleiService.selectById(id);
		chongwufenlei = chongwufenleiService.selectView(new EntityWrapper<ChongwufenleiEntity>().eq("id", id));
        return R.ok().put("data", chongwufenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwufenleiEntity chongwufenlei = chongwufenleiService.selectById(id);
		chongwufenlei = chongwufenleiService.selectView(new EntityWrapper<ChongwufenleiEntity>().eq("id", id));
        return R.ok().put("data", chongwufenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwufenleiEntity chongwufenlei, HttpServletRequest request){
    	chongwufenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwufenlei);
        chongwufenleiService.insert(chongwufenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwufenleiEntity chongwufenlei, HttpServletRequest request){
    	chongwufenlei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwufenlei);
        chongwufenleiService.insert(chongwufenlei);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwufenleiEntity chongwufenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwufenlei);
        chongwufenleiService.updateById(chongwufenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwufenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
