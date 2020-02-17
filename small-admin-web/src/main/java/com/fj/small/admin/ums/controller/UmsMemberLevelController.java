package com.fj.small.admin.ums.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fj.small.to.CommonResult;
import com.fj.small.ums.entity.MemberLevel;
import com.fj.small.ums.service.MemberLevelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UmsMemberLevelController {
    @Reference
    MemberLevelService memberLevelService;

    @GetMapping("/memberLevel/list")
    public CommonResult memberLevellist(){
        List<MemberLevel> list = memberLevelService.list();

        return new CommonResult().success(list);
    }
}

