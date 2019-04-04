package com.qianfeng.mapper;

import com.qianfeng.bean.GoodSku;

public interface GoodSkuMapper {
    int deleteByPrimaryKey(String skuId);

    int insert(GoodSku record);

    int insertSelective(GoodSku record);

    GoodSku selectByPrimaryKey(String skuId);

    int updateByPrimaryKeySelective(GoodSku record);

    int updateByPrimaryKey(GoodSku record);
}