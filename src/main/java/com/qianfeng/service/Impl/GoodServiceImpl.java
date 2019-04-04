package com.qianfeng.service.Impl;

import com.qianfeng.bean.Good;
import com.qianfeng.commons.Info;
import com.qianfeng.dao.IGoodeDAO;
import com.qianfeng.dao.Impl.GoodDAOImpl;
import com.qianfeng.service.IGoodService;

import java.util.List;

/**
 * Created by 任泽雄 on 2019/3/28.
 */
public class GoodServiceImpl implements IGoodService{

     private   IGoodeDAO iGoodeDAO=new GoodDAOImpl();

    @Override
    public List<Good> goodPage(Integer page) throws Exception {
        if (page<0){
            throw  new IndexOutOfBoundsException("输入错误");
        }
        int index=(page-1)* Info.Page.GOOD_SIZE;
        List<Good> goods = iGoodeDAO.selectByPage(index);
        return goods;
    }

    @Override
    public int insert(Good good) throws Exception {
        int insert = iGoodeDAO.insert(good);
        return insert;
    }
}
