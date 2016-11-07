package com.zhenma.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhenma.model.MsgInfo;
import com.zhenma.service.MsgInfoService;

@Controller
@RequestMapping("/msgInput")
public class MsgInputController {

	@Autowired
	MsgInfoService msgInfoService;
	
	@RequestMapping(value = "/getMsgForm", method = RequestMethod.GET)
	public String getMsgForm(Model model, HttpServletRequest request, HttpServletResponse response){
		return "msgForm";
	}
	
	@RequestMapping(value = "/addMsgForm", method = RequestMethod.POST)
	public String addMsgForm(HttpServletRequest request, Model model, MsgInfo msgInfo){
		System.out.println("HHhhhhhhhhhh!!!");
		System.out.println(msgInfo.toString());
		return "msgForm";
	}
}
