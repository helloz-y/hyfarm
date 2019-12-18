package com.hyfarm.service.demo.impl;

import com.hyfarm.demo.Demo;
import com.hyfarm.mapper.DemoMapper;
import com.hyfarm.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;
    @Override
    public String getname() {
        List<Demo> demos= demoMapper.getnames();
        String s="";
        if (demos!=null && demos.size()>0){
            for (Demo iteam:demos
                 ) {
                s+=iteam.getName();
            }
        }
        return s;
    }
}
