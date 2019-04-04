package main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.DeptDao;
import dto.Dept;
import mybatis.MyBatisConnectionFactory;

public class MyBatisEx {

	public static void main(String[] args) {

		//마이바티스 실행객체
		SqlSession sqlSession = null;
		
		sqlSession  = MyBatisConnectionFactory.getSessionFactory()
//					.openSession();
					.openSession(true); //AutoCommit 설정
		
		//dao객체 생성
		DeptDao deptDao = sqlSession.getMapper(DeptDao.class); //네임스페이스 걸었던걸 찾아옴
		
		//마이바티스 호출
		Dept result = deptDao.selectByDeptno(10);
		
		System.out.println(result);
		System.out.println("---------------");
		
		List<Dept> list = deptDao.selectAll();
		for(Dept d : list) {
			System.out.println(d);
		}
		
		System.out.println("---------------");
		
		String str = "SALES";
		Dept result2 = deptDao.selectByDname(str);		
		
		System.out.println(result2);
		System.out.println("---------------");
	}

}
