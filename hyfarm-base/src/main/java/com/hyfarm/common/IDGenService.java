package com.hyfarm.common;

import com.hyfarm.mapper.IDMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service("idGenService")
public class IDGenService {

    @Autowired
    private IDMapper iDMapper;

    public String getvison(String type,String time) {
        List<String> visons=iDMapper.getvison(type,time);
        int num=10000;
        String vison=num+"";
        if (visons==null||visons.size()==0){
            iDMapper.deleteByType(type);
            iDMapper.insertvison(type,time);
        }else{
            vison=(Integer.parseInt(visons.get(0))+1)+"";
        }
        return vison;
    }
}
