package web.dao.face;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import web.dto.Board;
import web.dto.Comment;
import web.util.Paging;

public interface BoardDao {

	//게시글 목록 조회
	public List selectAll(@Param("paging")Paging paging,@Param("type") String type, @Param ("word") String word);

	//총 게시글 수 반환
	public int selectCntBoard(@Param("type") String type, @Param ("word") String word);

	//조회수증가
	public void updateHit(Board board);

	//board_no 조회해서 게시글 조회
	public Board selectBoardByBoardno(Board board);

	//게시글 insert
	public void insertBoard(Board board);

	//게시글 수정 update
	public void updateBoard(Board board);

	//게시글 삭제 delete
	public void deleteBoard(int board_no);

	//댓글 insert
	public void commentWrite(Comment comment);

	//댓글목록 조회
	public List<Comment> getComment(Board board);

	//검색조회
	public List<Board> search(String type, String word);

}
