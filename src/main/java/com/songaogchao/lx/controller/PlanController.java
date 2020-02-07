package com.songaogchao.lx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.songaogchao.lx.entity.Depar;
import com.songaogchao.lx.entity.Plan;
import com.songaogchao.lx.service.PlanService;

@Controller
public class PlanController {
	
	@Autowired
	private PlanService planService;
	
	@RequestMapping("list")
	public String name(Model model,Plan plan,@RequestParam(defaultValue="1") Integer page,@RequestParam(defaultValue="6")Integer pageSize) {
		PageInfo<Plan> info = planService.list(plan, page, pageSize);
		model.addAttribute("info", info);
		return "list";	
	}
	@GetMapping("xiangq")
	public String xiangq(Model model,Plan plan, @RequestParam("pid")Integer pid) {
		Plan inf = planService.xiangq(pid);
		//System.out.println(inf);
		model.addAttribute("inf", inf);
		
		return "xiangq";
		
	}
	@ResponseBody
	@PostMapping("todel")
	public int name(@RequestParam("id")String id) {
	return	planService.deleteBid(id);
	}
	
	@RequestMapping("add")
	public String add(Model model,Plan plan) {
		List<Depar> depar = planService.depar();
		model.addAttribute("depar", depar);
		return "add";
		
	}
	
	@PostMapping("toadd")
	public String toadd(Plan plan) {
		
		planService.toadd(plan);
		return "redirect:list";
		
	}
}
