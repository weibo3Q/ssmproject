package dao;

import domain.Student;

public interface Dao {
	/**
	 * ���Ա������ݵ�Student��
	 * 
	 */
	void save();
	/**
	 * ����ע��xinxi
	 * @param stu
	 */
	void saveStudent(Student stu);
	
}
