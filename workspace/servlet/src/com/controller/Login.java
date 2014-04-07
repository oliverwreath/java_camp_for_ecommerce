package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		uname = uname.trim();
		pwd = pwd.trim();
		
		if("123".equals(uname) && "123".equals(pwd)){
			//登录成功
			User user = new User(uname, pwd);
			request.getSession().setAttribute("user", user);
			
			//转发或重定向
			request.getRequestDispatcher("login_OK.jsp").forward(request, response);
			return; 
		}else{
			//登录失败
			request.setAttribute("loginError", "用户名或者密码错误！"+uname+"|"+pwd);
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		uname = uname.trim();
		pwd = pwd.trim();
		
		if("123".equals(uname) && "123".equals(pwd)){
			//登录成功
			User user = new User(uname, pwd);
			request.getSession().setAttribute("user", user);
			
			//转发或重定向
			request.getRequestDispatcher("login_OK.jsp").forward(request, response);
			return; 
		}else{
			//登录失败
			request.setAttribute("loginError", "用户名或者密码错误！"+uname+"|"+pwd);
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
	}
}
