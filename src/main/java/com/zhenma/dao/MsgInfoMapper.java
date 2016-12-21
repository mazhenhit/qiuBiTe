package com.zhenma.dao;

import java.util.List;

import com.zhenma.model.MsgInfo;

public interface MsgInfoMapper {

	/**
	 * @param msgInfo
	 */
	void insertInfo(MsgInfo msgInfo);

	/**
	 * @return
	 */
	List<MsgInfo> selectAllInfo();

}
