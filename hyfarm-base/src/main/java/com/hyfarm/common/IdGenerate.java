package com.hyfarm.common;

import com.hyfarm.utils.SpringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class IdGenerate {

    public static String uuid(){
       return  UUID.randomUUID().toString().replaceAll("-", "");
    }

    public synchronized static String getCode(String type){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String time=sdf.format(new Date());
        IDGenService service= SpringUtils.getBean("idGenService");
        String num=service.getvison(type,time);
        String code="";
         switch (type){
             case "10000001":
                 code= "N"+time;
                 break;
             case "10000002":
                 code= "C"+time;
                 break;
             default: break;
         }
         return code;
    }
}
