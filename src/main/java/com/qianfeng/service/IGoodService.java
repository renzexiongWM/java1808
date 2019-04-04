package com.qianfeng.service;

import com.qianfeng.bean.Good;

import java.util.List;

/**
 * Created by 任泽雄 on 2019/3/28.
 */
public interface IGoodService {

    List<Good> goodPage(Integer page)throws Exception;


    int insert(Good good)throws Exception;
}
