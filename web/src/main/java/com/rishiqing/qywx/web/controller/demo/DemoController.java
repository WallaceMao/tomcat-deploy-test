package com.rishiqing.qywx.web.controller.demo;

import com.rishiqing.qywx.web.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {
    private static final Logger webLogger = LoggerFactory.getLogger("WEB_LOGGER");
    private static final Logger serviceLogger = LoggerFactory.getLogger("SERVICE_LOGGER");

    @Autowired
    private DemoService demoService;

    @RequestMapping("/getTime")
    @ResponseBody
    public String demoLog(){
        webLogger.info("this is webLogger from demoLogController");
        serviceLogger.info("this is serviceLogger from demoLogController");
        return demoService.getTime();
    }

    @RequestMapping("getCorpName")
    @ResponseBody
    public String getCorpName(
            @RequestParam("corpId") String corpId
    ){
        String str = demoService.getCorpName(corpId);
        System.out.println("----str----" + str);
        return str;
    }
}
