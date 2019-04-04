package com.qianfeng.mapper;

import com.qianfeng.bean.Good;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodMapper {


    List<Good> selectByPage(@Param("index") Integer index,@Param("size") Integer size);


    int insert(Good good);
}