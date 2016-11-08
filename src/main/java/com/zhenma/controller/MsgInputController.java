package com.zhenma.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhenma.model.MatchInfo;
import com.zhenma.model.MsgInfo;
import com.zhenma.service.MsgInfoService;

@Controller
@RequestMapping("/msgInput")
public class MsgInputController {

	@Resource
	private MsgInfoService msgInfoService;
//	@Resource
//	private MatchInfoService matchInfoService;
	
	@RequestMapping(value = "/getMsgForm", method = RequestMethod.GET)
	public String getMsgForm(Model model, HttpServletRequest request, HttpServletResponse response){
		return "msgForm";
	}
	
	@RequestMapping(value = "/addMsgForm", method = RequestMethod.POST)
	public String addMsgForm(HttpServletRequest request, Model model, MsgInfo msgInfo){
		System.out.println("HHhhhhhhhhhh!!!");
		System.out.println(msgInfo.toString());
		msgInfoService.insertInfo(msgInfo);
		MatchInfo matchInfo = new MatchInfo();
		matchInfo.setName1("aa");
		matchInfo.setName2("bb");
		matchInfo.setPhoneNum1("1111");
		matchInfo.setPhoneNum2("2222");
		System.out.println(matchInfo.toString());
//		matchInfoService.insertInfo(matchInfo);
		return "msgForm";
	}
}
