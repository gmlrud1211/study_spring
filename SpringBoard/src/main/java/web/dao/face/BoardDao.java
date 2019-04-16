package web.dao.face;

import java.util.List;

import web.dto.Board;
import web.util.Paging;

public interface BoardDao {

	//게시글 목록 조회
	public List selectAll(Paging paging);

	//총 게시글 수 반환
	public int selectCntBoard();

	//조회수증가
	public void updateHit(Board board);

	//board_no 조회해서 게시글 조회
	public Board selectBoardByBoardno(Board board);

	//게시글 insert
	public void insertBoard(Board board);
	
}
