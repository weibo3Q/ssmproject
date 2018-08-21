package dao;

import domain.Student;

public interface Dao {
	/**
	 * 测试保存数据到Student表
	 * 
	 */
	void save();
	/**
	 * 保存注册xinxi
	 * @param stu
	 */
	void saveStudent(Student stu);
	
}
