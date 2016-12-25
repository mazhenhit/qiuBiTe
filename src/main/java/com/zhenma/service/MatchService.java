/**
 * @file_name: MatchService.java
 */
package com.zhenma.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhenma.model.MatchInfo;
import com.zhenma.model.MsgInfo;

/**
 * @author: Mz
 * @time: 2016年12月25日-下午3:40:03
 * @Description: 
 */
@Service
public class MatchService {

	@Resource
	private MsgInfoService msgInfoService;
	@Resource
	private MatchInfoService matchInfoService;
	
	public void matchDbInfo(MsgInfo msgInfo){
		List<MsgInfo> msgInfos = null;
		try{
			msgInfos = msgInfoService.selectAllInfo();
		} catch(Exception e){
			System.err.println("msginfo selectall 失败！");
			e.printStackTrace();
		}
		
		if(msgInfo != null){
			for (MsgInfo msgInfo2 : msgInfos) {
				System.out.println("msgInfo2" + msgInfo2.toString());
				System.out.println("msgInfo" + msgInfo.toString());
				if(msgInfo2.getPhoneNum().equals(msgInfo.getPhoneNum())){
					MatchInfo matchInfo = new MatchInfo();
					matchInfo.setPhoneNum1(msgInfo.getPhoneNum());
					matchInfo.setName1(msgInfo.getName());
					matchInfo.setPhoneNum2(msgInfo2.getPhoneNum());
					matchInfo.setName2(msgInfo2.getName());
					try{
						matchInfoService.insertInfo(matchInfo);
					} catch (Exception e) {
						System.err.println("matchInfoMapper.insertMatchInfo失败！");
						System.err.println(matchInfo.toString());
						e.printStackTrace();
					}
				}
			}
		}
	}
}
