package dao;

import java.util.List;

import dto.Dept;

public interface DeptDao {
	
	//deptno로 조회하기
	public Dept selectByDeptno(int deptno);

	//전체조회하기
	public List<Dept> selectAll();

	//dname으로 조회하기
	public Dept selectByDname(String str);

	//삽입
	public void insert(Dept dept);

}
