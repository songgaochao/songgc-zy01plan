package com.songaogchao.lx.test;

import java.text.DecimalFormat;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.songaogchao.lx.dao.PlanDao;
import com.songaogchao.lx.entity.Plan;
import com.songgaochao.common.utils.FileUtil;
import com.songgaochao.common.utils.NumberUtil;

public class PlanTest {

	@Test
	public void name() {
		
	//	ApplicationContext ac = new ClassPathXmlApplicationContext("spring-beans.xml");
	//PlanDao de = ac.getBean(PlanDao.class);
	//Plan plan = new Plan();
	//plan.setPname("收");
	//List<Plan> list = de.list(plan);
	//for (Plan plan2 : list) {
	///	System.out.println(plan2);
	//}
	}
	@Test
	public void name2() {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-beans.xml");
	PlanDao de = ac.getBean(PlanDao.class);
	
	
	Plan xiangq = de.xiangq(1);
	System.out.println(xiangq);
	}
	
	@Test
	public void name3() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-beans.xml");
		PlanDao de = ac.getBean(PlanDao.class);
	List<String> list = FileUtil.readTextFileToList("D:\\te.txt");
	for (String string : list) {
		try {
		String[] split = string.split("||")	;
			//Plan plan = new Plan();
			//plan.setPname(split[1]);
		//	plan.setAmount(split[2]);
			//plan.setContent(split[3]);
			//plan.setManager(split[4]);
			
		//System.out.println(plan);
			//de.toadd(plan);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	}
	public static void main(String[] args) {
		
		String percent = NumberUtil.getPercent(51, 68);
		System.out.println(percent);
	}
	
	
	
}
