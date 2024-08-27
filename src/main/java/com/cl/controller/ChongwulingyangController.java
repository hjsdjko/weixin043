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

import com.cl.entity.ChongwulingyangEntity;
import com.cl.entity.view.ChongwulingyangView;

import com.cl.service.ChongwulingyangService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 宠物领养
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-15 20:03:12
 */
@RestController
@RequestMapping("/chongwulingyang")
public class ChongwulingyangController {
    @Autowired
    private ChongwulingyangService chongwulingyangService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwulingyangEntity chongwulingyang,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			chongwulingyang.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();

		PageUtils page = chongwulingyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwulingyang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwulingyangEntity chongwulingyang, 
		HttpServletRequest request){
        EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();

		PageUtils page = chongwulingyangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwulingyang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwulingyangEntity chongwulingyang){
       	EntityWrapper<ChongwulingyangEntity> ew = new EntityWrapper<ChongwulingyangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwulingyang, "chongwulingyang")); 
        return R.ok().put("data", chongwulingyangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwulingyangEntity chongwulingyang){
        EntityWrapper< ChongwulingyangEntity> ew = new EntityWrapper< ChongwulingyangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwulingyang, "chongwulingyang")); 
		ChongwulingyangView chongwulingyangView =  chongwulingyangService.selectView(ew);
		return R.ok("查询宠物领养成功").put("data", chongwulingyangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwulingyangEntity chongwulingyang = chongwulingyangService.selectById(id);
		chongwulingyang = chongwulingyangService.selectView(new EntityWrapper<ChongwulingyangEntity>().eq("id", id));
        return R.ok().put("data", chongwulingyang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwulingyangEntity chongwulingyang = chongwulingyangService.selectById(id);
		chongwulingyang = chongwulingyangService.selectView(new EntityWrapper<ChongwulingyangEntity>().eq("id", id));
        return R.ok().put("data", chongwulingyang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwulingyangEntity chongwulingyang, HttpServletRequest request){
    	chongwulingyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwulingyang);
        chongwulingyangService.insert(chongwulingyang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwulingyangEntity chongwulingyang, HttpServletRequest request){
    	chongwulingyang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwulingyang);
        chongwulingyangService.insert(chongwulingyang);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChongwulingyangEntity chongwulingyang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwulingyang);
        chongwulingyangService.updateById(chongwulingyang);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<ChongwulingyangEntity> list = new ArrayList<ChongwulingyangEntity>();
        for(Long id : ids) {
            ChongwulingyangEntity chongwulingyang = chongwulingyangService.selectById(id);
            chongwulingyang.setSfsh(sfsh);
            chongwulingyang.setShhf(shhf);
            list.add(chongwulingyang);
        }
        chongwulingyangService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwulingyangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
