package com.songaogchao.lx.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageInfo;
import com.songaogchao.lx.entity.Depar;
import com.songaogchao.lx.entity.Plan;

public interface PlanService {
PageInfo<Plan> list(Plan plan,Integer page,Integer pageSize);
	
	int deleteBid(@Param("ids") String id);

	Plan xiangq(Integer pid);

	List<Depar> depar();

	int toadd(Plan plan);
}
