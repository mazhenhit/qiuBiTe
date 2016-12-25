package com.zhenma.dao;

import java.util.List;

import com.zhenma.model.MatchInfo;

public interface MatchInfoMapper {
	void insertInfo(MatchInfo matchInfo);

	/**
	 * @return
	 */
	List<MatchInfo> selectAllMatchInfo();
}
