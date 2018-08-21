package dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.Dao;
import domain.Student;

public class DaoImpl implements Dao{
	private SqlSessionFactory sqlSessionFactory;//不要new  而要通过配置文件注入
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) { //通过get方法注入
		this.sqlSessionFactory = sqlSessionFactory;
	}
	public void save() {
		
		SqlSession sqlSession=sqlSessionFactory.openSession();
//		List<Student> stuList=
		sqlSession.selectList("domain.Student.insertStudent");
//		for(Student stu:stuList){
//			System.out.println(stu.getId()+":"+stu.getName()+":"+stu.getSal()+"元");
//		}
	}
	public void saveStudent(Student stu) {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		sqlSession.insert("domain.Student.insertStudentregist", stu);
	}

}
