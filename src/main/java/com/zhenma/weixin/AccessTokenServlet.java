package com.zhenma.weixin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccessTokenServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException {
        TokenThread.appId = getInitParameter("appid");  //获取servlet初始参数appid和appsecret
        TokenThread.appSecret = getInitParameter("appsecret");
        System.out.println("appid:"+TokenThread.appId);
        System.out.println("appSecret:"+TokenThread.appSecret);
		new Thread(new TokenThread()).start(); //启动进程
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
    }
}
