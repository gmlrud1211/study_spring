package web.dao.face;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import web.dto.Member;

public interface MemberDao {

public void insert(Member member);
	
	public List<Member> selectAll();

//	public List<Member> selectByName(Member member);
	
//	public List<Member> selectByName(HashMap map);
	
	public List<Member> selectByName(@Param("name") String name,
									@Param("email") String email);

}
