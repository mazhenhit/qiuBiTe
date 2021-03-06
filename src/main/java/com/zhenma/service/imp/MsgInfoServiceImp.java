package com.zhenma.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhenma.dao.MsgInfoMapper;
import com.zhenma.model.MsgInfo;
import com.zhenma.service.MsgInfoService;

@Service("msgInfoService")
public class MsgInfoServiceImp implements MsgInfoService {

	@Resource
	private MsgInfoMapper msgInfoMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.zhenma.service.MsgInfoService#insertInfo(com.zhenma.model.MsgInfo)
	 */
	@Override
	public void insertInfo(MsgInfo msgInfo) {
		try {
			msgInfoMapper.insertInfo(msgInfo);
		} catch (Exception e) {
			System.err.println("msgInfo插入失败！" + e);
		}
	}

	/* (non-Javadoc)
	 * @see com.zhenma.service.MsgInfoService#selectAllInfo()
	 */
	@Override
	public List<MsgInfo> selectAllInfo() {
		List<MsgInfo> msgInfos = null;
		try{
			msgInfos = msgInfoMapper.selectAllInfo();
		}catch(Exception e){
			System.err.println("msgInfoMapper.selectAllInfo" + e);
		}
		return msgInfos;
	}

}
