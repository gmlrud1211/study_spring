package controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao.EmpDao;
import dto.Emp;
import mybatis.MyBatisConnectionFactory;

public class EmpEx {

	public static void main(String[] args) {

		//마이바티스 실행객체
		SqlSession sqlSession = null;
		
		sqlSession  = MyBatisConnectionFactory.getSessionFactory()
					.openSession(true); //AutoCommit 설정
		
		EmpDao empDao = sqlSession.getMapper(EmpDao.class);
		
		//selectAll()
		List<Emp> list = empDao.selectAll();
		for(Emp e : list) {
			System.out.println(e);
		}
		
		
		//insertEmp(emp)// 출력
		Emp insertEmp = new Emp();
		insertEmp.setEmpno(9888);
		insertEmp.setEname("hkhk");
		insertEmp.setJob("SALESMAN");
		insertEmp.setMgr(7698);
		insertEmp.setHiredate("2019-04-04");
		insertEmp.setSal(3000);
		insertEmp.setComm(200);
		insertEmp.setDeptno(30);

		try {
			empDao.insert(insertEmp);
		}catch(Exception e) {
			System.out.println("이미삽입됨");
			sqlSession.rollback();
		}
		
		System.out.println("--------------");
		//empno로 조회
		Emp result = empDao.selectByEmpNo(9888);
		System.out.println("empno가 9888번인 사원 조회 : "+result);
		
		//사원삭제
		try {
			empDao.deleteByEmpNo(7934);
			System.out.println("삭제됨");
		}catch(Exception e) {
			System.out.println("없어서 삭제안됨");
			sqlSession.rollback();
		}
		System.out.println("--------------");
		
		
		
	}

}
