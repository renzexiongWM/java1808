package com.qianfeng.dao.Impl;

import com.qianfeng.bean.Good;
import com.qianfeng.commons.Info;
import com.qianfeng.commons.SystemCommonsUtils;
import com.qianfeng.dao.IGoodeDAO;
import com.qianfeng.mapper.GoodMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 任泽雄 on 2019/3/28.
 */
public class GoodDAOImpl implements IGoodeDAO {
    @Override
    public List<Good> selectByPage(@Param("index") Integer index) throws Exception {
        GoodMapper mapper = SystemCommonsUtils.getSqlsession().getMapper(GoodMapper.class);
        List<Good> goods = mapper.selectByPage(index, Info.Page.GOOD_SIZE);
        return goods;
    }



}
