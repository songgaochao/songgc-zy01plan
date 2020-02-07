package com.songaogchao.lx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.songaogchao.lx.dao.PlanDao;
import com.songaogchao.lx.entity.Depar;
import com.songaogchao.lx.entity.Plan;

@Service
public class PlanServiceImpl implements PlanService {
	@Autowired
	private PlanDao plandao;
	
	@Override
	public PageInfo<Plan> list(Plan plan, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);		
		List<Plan> list = plandao.list(plan);		
		return new PageInfo<>(list);
	}

	@Override
	public int deleteBid(String id) {
		return plandao.deleteBid(id);
	}

	@Override
	public Plan xiangq(Integer pid) {
		return plandao.xiangq(pid);
	}

	@Override
	public List<Depar> depar() {
		// TODO Auto-generated method stub
		return plandao.depar();
	}

	@Override
	public int toadd(Plan plan) {
		// TODO Auto-generated method stub
		return plandao.toadd(plan);
	}

}
