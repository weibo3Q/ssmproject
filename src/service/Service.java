package service;

import domain.Student;

public interface Service {
	/**
	 * ���Ա������ݵ�Student��
	 */
	public void save();
	/**
	 * ����ǰ̨ҳ�淢�͹���������
	 * @param stu
	 */
	public void saveStudent(Student stu);
}
