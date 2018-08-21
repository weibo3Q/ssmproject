package service.impl;

import dao.Dao;
import domain.Student;
import service.Service;

public class ServiceImpl implements Service {
	private Dao dao;

	public void setDao(Dao dao) {//ͨ��set����ע������
		this.dao = dao;
	}

	public void save() {
//		int i=1/0;   //���������Ƿ�ɹ�����
		dao.save();
	}

	public void saveStudent(Student stu) {
		dao.saveStudent(stu);
	}
	
	
}
