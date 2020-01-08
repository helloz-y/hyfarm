package com.hyfarm.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDMapper {

    List<String> getvison(@Param("type") String type, @Param("time") String time);

    void deleteByType(@Param("type") String type);

    void insertvison(@Param("type") String type,@Param("time") String time);
}
