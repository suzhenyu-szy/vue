package com.by.controller;

import com.by.entity.TUser;
import com.by.service.TUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUser)表控制层
 *
 * @author makejava
 * @since 2019-12-12 21:33:12
 */
@Controller
@RequestMapping("tUser")
public class TUserController {
    /**
     * 服务对象
     */
    @Resource
    private TUserService tUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TUser selectOne(Integer id) {
        return this.tUserService.queryById(id);
    }
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @ResponseBody
    @RequestMapping("findAll")
    public List<TUser> findAll(){
        List<TUser> tUsers = tUserService.queryAllByLimit(0, 10000);
        return tUsers;
    }
    @ResponseBody
    @RequestMapping("deleteById")
    public String deleteById(Integer id){
        tUserService.deleteById(id);
        return "success";
    }
    @ResponseBody
    @RequestMapping("addAll")
    public String addAll(TUser tUser){
        tUserService.insert(tUser);
        return "success";
    }

    @ResponseBody
    @RequestMapping("updateAll")
    public String updateAll(TUser tUser){
        tUserService.update(tUser);
        return "success";
    }

}