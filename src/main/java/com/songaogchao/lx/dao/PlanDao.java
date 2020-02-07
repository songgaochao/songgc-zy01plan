package com.songaogchao.lx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.songaogchao.lx.entity.Depar;
import com.songaogchao.lx.entity.Plan;

public interface PlanDao {

	List<Plan> list(Plan plan);
	
	int deleteBid(@Param("ids") String id);

	Plan xiangq( Integer pid);

	List<Depar> depar();

	int toadd(Plan plan);

	
	
}
