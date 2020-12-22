package com.ruilin.web.list;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.ruilin.pojo.ClassifyGoods;
import com.ruilin.service.list.impl.FiltrateServiceImpl;

/**
 * Servlet implementation class MoneyServlet
 */
public class MoneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MoneyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String money = request.getParameter("money");
		String type = request.getParameter("type");
		String weight = request.getParameter("weight");
		String selected = request.getParameter("select");
		int mon = Integer.parseInt(money);
		int ty = Integer.parseInt(type);
		int wei = Integer.parseInt(weight);
		int select = Integer.parseInt(selected);
		FiltrateServiceImpl fsi = new FiltrateServiceImpl();
		 List<ClassifyGoods> list = fsi.getMoney(mon,ty,wei,select);
		String json = JSONArray.toJSONString(list);
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.write(json);
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
