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
	public void setService(Service service) {  //ͨ��set����ע������
		this.service = service;
	}
	@RequestMapping(value="/addstudent")
	public String save(Model model,Student stu){
//		service.save();
		service.saveStudent(stu);
		return "success";
	}
	/**
	 * �ֶ�����spring+mybatis�������
	 * 
	 * -----��springMVC��spring��������֮��spring.xml�����ļ���ͨ��springMVC
	 * 			�ĺ��Ŀ��������ã�web.xml�����ã���ʱ��  �Ϳ���ͨ���������ú��ˣ�����ʹ��Ĭ��·������ô�Ͳ�������)��
	 * 			���  �������ֶ�ͨ��ClassPathXmlApplicationContext()�����������ļ���
	 */
	/*
	 * 
	 * 
		@Test
		public void testsave(){
			ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");//ͨ���÷�ʽ  ����spring�������ļ�
			Controllers c=(Controllers) context.getBean("controllerid");
			c.save();
		}
	*/
}
