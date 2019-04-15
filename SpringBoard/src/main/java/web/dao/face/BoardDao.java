package web.dao.face;

import java.util.List;

import web.util.Paging;

public interface BoardDao {

	//게시글 목록 조회
	public List selectAll(Paging paging);

	//총 게시글 수 반환
	public int selectCntBoard();
	
}
