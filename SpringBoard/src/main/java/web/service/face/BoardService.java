package web.service.face;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import web.dto.Board;
import web.dto.Comment;
import web.util.Paging;

public interface BoardService {

	//전체 게시글 조회
	public List list(Paging paging, String type, String word);

	//전체 게시글 얻기
	public int getTotalCount(String type, String word);

	//현재 페이지 번호 
	public int getCurPage(HttpServletRequest req);

	//게시글 조회(조회시마다 게시글 조회수 1up)
	public Board view(Board board);

	//게시글 작성
	public void write(Board board);

	//게시글 수정
	public void boardUpdate(Board board);

	//게시글 삭제
	public void boardDelete(int board_no);

	//댓글 리스트로 불러오기
	public List<Comment> commentList(Board board);

	//댓글작성
	public void commentWrite(Comment comment);

	//검색된 boardlist 조회
	public List<Board> getSearch(String type, String word);

	
}
