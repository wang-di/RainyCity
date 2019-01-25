package com.wd.xyf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName TestServlet
 * @Description servlet测试
 * @Author wangdi
 * @Date 2019/1/18 15:16
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/test")
public class TestServlet extends HttpServlet {

	//重写get方法
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
		PrintWriter writer = resp.getWriter();
		writer.write("执行TestServlet的doGet方法成功");
		writer.close();
	}
}
