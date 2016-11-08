package com.zhenma.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhenma.dao.MatchInfoMapper;
import com.zhenma.model.MatchInfo;
import com.zhenma.service.MatchInfoService;

@Service("matchInfoService")
public class MatchInfoServiceImp implements MatchInfoService {

	@Resource
	private MatchInfoMapper matchInfoMapper;
	
	/* (non-Javadoc)
	 * @see com.zhenma.service.MatchInfoService#insertInfo(com.zhenma.model.MatchInfo)
	 */
	@Override
	public void insertInfo(MatchInfo matchInfo) {
		try{
			matchInfoMapper.insertInfo(matchInfo);
		} catch(Exception e){
			System.err.println("matchInfoMapper插入失败！");
		}
	}

}
