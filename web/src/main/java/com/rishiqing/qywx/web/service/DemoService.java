package com.rishiqing.qywx.web.service;

import com.rishiqing.qywx.dao.mapper.corp.CorpDao;
import com.rishiqing.qywx.dao.model.corp.CorpDO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author Wallace Mao
 * Date: 2018-04-09 16:43
 */
public class DemoService {
    @Autowired
    private CorpDao corpDao;

    public String getTime(){
        return new Date().toString();
    }

    public String getCorpName(String id){
        CorpDO corp = corpDao.getCorpByCorpId(id);
        return corp == null ? null : corp.getCorpName();
    }
}
