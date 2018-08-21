package service;

import domain.Student;

public interface Service {
	/**
	 * 测试保存数据到Student表
	 */
	public void save();
	/**
	 * 保存前台页面发送过来的数据
	 * @param stu
	 */
	public void saveStudent(Student stu);
}
