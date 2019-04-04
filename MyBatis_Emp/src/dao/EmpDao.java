package dao;

import java.util.List;

import dto.Emp;

public interface EmpDao {


	//전체조회하기
	public List<Emp> selectAll();

	//삽입
	public void insert(Emp insertEmp);

	//empno로 조회
	public Emp selectByEmpNo(int empno);
	
	//삭제
	public void deleteByEmpNo(int empno);
	


}
