package cms.zy01;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

import org.aspectj.weaver.patterns.DeclareParentsMixin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.songaogchao.lx.dao.DeparDao;
import com.songaogchao.lx.dao.PlanDao;
import com.songaogchao.lx.entity.Plan;
import com.songgaochao.common.utils.FileUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class PlanTest {
	@Autowired	
	private PlanDao planDao;
	
	@Autowired
	private DeparDao adeparDao;
	
	@Test
	public void name() {
		File file = new File("src\\test\\resources\\data.txt");
		File absoluteFile = file.getAbsoluteFile();
		System.out.println(absoluteFile);
		List<String> readTextFileToList = FileUtil.readTextFileToList(file);
		for (String string : readTextFileToList) {
			System.out.println(string);
			String[] split = string.split("\\|\\|");
			//String am= split[1];
			//BigDecimal bigDecimal = new BigDecimal(am);
			
			String dept=split[4];
			com.songaogchao.lx.entity.Depar selectBYname = adeparDao.selectBYname(dept);
			//Plan plan2 = new Plan(null, split[0],bigDecimal, split[3], split[2],selectBYname.getId());
		//planDao.toadd(plan2);
		}
	}
}
