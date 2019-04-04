package com.qianfeng.dao;

import com.qianfeng.bean.Good;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 任泽雄 on 2019/3/28.
 */
public interface IGoodeDAO  {
    List<Good> selectByPage(@Param("index") Integer index)throws Exception;



}
