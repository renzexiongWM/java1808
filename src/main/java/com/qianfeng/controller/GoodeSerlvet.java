package com.qianfeng.controller;

import com.qianfeng.bean.Good;
import com.qianfeng.service.IGoodService;
import com.qianfeng.service.Impl.GoodServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 任泽雄 on 2019/3/28.
 */

public class GoodeSerlvet extends HttpServlet {

    private IGoodService iGoodService=new GoodServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = req.getParameter("page");
        try {
            page=page==null?"1":page;
            List<Good> goodsList = iGoodService.goodPage(Integer.parseInt(page));
            req.setAttribute("goodsList",goodsList);
            req.getRequestDispatcher("good_list.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
