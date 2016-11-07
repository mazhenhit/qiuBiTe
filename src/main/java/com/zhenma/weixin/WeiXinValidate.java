package com.zhenma.weixin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WeiXinValidate {

	private final String token = "zhenma";

	@RequestMapping("/weixinvalidate")
	public void validate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("开始签名校验");
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");

		ArrayList<String> array = new ArrayList<String>();
		array.add(signature);
		array.add(timestamp);
		array.add(nonce);

		// 排序
		String sortString = sort(token, timestamp, nonce);
		// 加密
		String mytoken = Decript.SHA1(sortString);
		// 校验签名
		if (mytoken != null && mytoken != "" && mytoken.equals(signature)) {
			System.out.println("签名校验通过:" + echostr);
			response.getWriter().println(echostr); // 如果检验成功输出echostr，微信服务器接收到此输出，才会确认检验完成。
		} else {
			System.out.println("签名校验失败。");
		}
	}

	public static String sort(String token, String timestamp, String nonce) {
		String[] strArray = { token, timestamp, nonce };
		Arrays.sort(strArray);

		StringBuilder sbuilder = new StringBuilder();
		for (String str : strArray) {
			sbuilder.append(str);
		}

		return sbuilder.toString();
	}
}
