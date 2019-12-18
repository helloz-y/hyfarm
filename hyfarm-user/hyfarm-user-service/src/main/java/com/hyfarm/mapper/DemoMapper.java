package com.hyfarm.mapper;

import com.hyfarm.demo.Demo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoMapper {
    List<Demo> getnames();
}
