package service.impl;

import dao.Dao;
import domain.Student;
import service.Service;

public class ServiceImpl implements Service {
	private Dao dao;

	public void setDao(Dao dao) {//通过set方法注入属性
		this.dao = dao;
	}

	public void save() {
//		int i=1/0;   //测试事务是否成功加上
		dao.save();
	}

	public void saveStudent(Student stu) {
		dao.saveStudent(stu);
	}
	
	
}
