package controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Student;

import service.Service;
@Controller
@RequestMapping(value="/regist")
public class Controllers {
	@Autowired
	private Service service;
	public void setService(Service service) {  //通过set方法注入属性
		this.service = service;
	}
	@RequestMapping(value="/addstudent")
	public String save(Model model,Student stu){
//		service.save();
		service.saveStudent(stu);
		return "success";
	}
	/**
	 * 手动测试spring+mybatis框架整合
	 * 
	 * -----当springMVC与spring关联起来之后，spring.xml配置文件遍通过springMVC
	 * 			的核心控制器配置（web.xml中配置）的时候  就可以通过属性配置好了（或者使用默认路径，那么就不用配置)。
	 * 			因此  不必在手动通过ClassPathXmlApplicationContext()来加载配置文件了
	 */
	/*
	 * 
	 * 
		@Test
		public void testsave(){
			ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");//通过该方式  加载spring的配置文件
			Controllers c=(Controllers) context.getBean("controllerid");
			c.save();
		}
	*/
}
