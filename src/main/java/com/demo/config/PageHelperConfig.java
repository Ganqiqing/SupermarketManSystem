package com.demo.config;

import com.github.pagehelper.PageHelper;

import java.util.Properties;

//@Configuration
public class PageHelperConfig {
    //@Bean
    public PageHelper getPageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        //是否将参数offset作为PageNum(当前页)使用
        p.setProperty("offsetAsPageNum", "true");
        //
        p.setProperty("rowBoundsWithCount", "true");
        //分页参数合理化
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }

}
