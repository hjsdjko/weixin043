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

import com.cl.entity.ChongwusongyangEntity;
import com.cl.entity.view.ChongwusongyangView;

import com.cl.service.ChongwusongyangService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 宠物送养
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
@RestController
@RequestMapping("/chongwusongyang")
public class ChongwusongyangController {
    @Autowired
    private ChongwusongyangService chongwusongyangService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwusongyangEntity chongwusongyang,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			chongwusongyang.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChongwusongyangEntity> ew = new EntityWrapper<ChongwusongyangEntity>();

		PageUtils page = chongwusongyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwusongyang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwusongyangEntity chongwusongyang, 
		HttpServletRequest request){
        EntityWrapper<ChongwusongyangEntity> ew = new EntityWrapper<ChongwusongyangEntity>();

		PageUtils page = chongwusongyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwusongyang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwusongyangEntity chongwusongyang){
       	EntityWrapper<ChongwusongyangEntity> ew = new EntityWrapper<ChongwusongyangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwusongyang, "chongwusongyang")); 
        return R.ok().put("data", chongwusongyangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwusongyangEntity chongwusongyang){
        EntityWrapper< ChongwusongyangEntity> ew = new EntityWrapper< ChongwusongyangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwusongyang, "chongwusongyang")); 
		ChongwusongyangView chongwusongyangView =  chongwusongyangService.selectView(ew);
		return R.ok("查询宠物送养成功").put("data", chongwusongyangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwusongyangEntity chongwusongyang = chongwusongyangService.selectById(id);
		chongwusongyang = chongwusongyangService.selectView(new EntityWrapper<ChongwusongyangEntity>().eq("id", id));
        return R.ok().put("data", chongwusongyang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwusongyangEntity chongwusongyang = chongwusongyangService.selectById(id);
		chongwusongyang = chongwusongyangService.selectView(new EntityWrapper<ChongwusongyangEntity>().eq("id", id));
        return R.ok().put("data", chongwusongyang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwusongyangEntity chongwusongyang, HttpServletRequest request){
    	chongwusongyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwusongyang);
        chongwusongyangService.insert(chongwusongyang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwusongyangEntity chongwusongyang, HttpServletRequest request){
    	chongwusongyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwusongyang);
        chongwusongyangService.insert(chongwusongyang);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwusongyangEntity chongwusongyang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwusongyang);
        chongwusongyangService.updateById(chongwusongyang);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<ChongwusongyangEntity> list = new ArrayList<ChongwusongyangEntity>();
        for(Long id : ids) {
            ChongwusongyangEntity chongwusongyang = chongwusongyangService.selectById(id);
            chongwusongyang.setSfsh(sfsh);
            chongwusongyang.setShhf(shhf);
            list.add(chongwusongyang);
        }
        chongwusongyangService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwusongyangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
