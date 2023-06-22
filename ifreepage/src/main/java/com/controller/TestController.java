package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.model.TpmTestLog;
import com.service.TpmTestLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TpmTestLogService tpmTestLogService;

    @GetMapping("/test")
    public JSONObject test(){

        JSONObject jsonObject = new JSONObject();

        TpmTestLog tpmTestLog = new TpmTestLog();
        tpmTestLog.setSyscreatedate("asfasgags");
        tpmTestLog.setTestmainUuid("fdasgassfsarew");
        tpmTestLog.setOperation("新增");
        tpmTestLogService.ceshi(tpmTestLog);

        jsonObject.put("title", "测试成功" + tpmTestLog.getLogUuid());
        return jsonObject;
    }

}