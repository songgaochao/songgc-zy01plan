package com.songaogchao.lx.dao;

import org.apache.ibatis.annotations.Select;

import com.songaogchao.lx.entity.Depar;

public interface DeparDao {

	@Select("select * from department where `names`=#{dept}")
	Depar selectBYname(String dept);

}
