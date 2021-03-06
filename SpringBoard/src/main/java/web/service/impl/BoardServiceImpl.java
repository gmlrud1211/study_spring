package web.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.face.BoardDao;
import web.dto.Board;
import web.dto.Comment;
import web.service.face.BoardService;
import web.util.Paging;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired BoardDao boardDao;

	@Override
	public List list(Paging paging, String type, String word) {
		return boardDao.selectAll(paging,type, word);
	}
	
	@Override
	public int getTotalCount(String type, String word) {
		return boardDao.selectCntBoard(type,word);
	}

	@Override
	public int getCurPage(HttpServletRequest req) {
		//요청 파라미터 curPage 받기
		String param = req.getParameter("curPage");

		//null이나 ""이 아니면 int리턴
		if(param!=null && !"".equals(param)) {
			int curPage = Integer.parseInt(param);
			return curPage;
		}
				
		//null이나 ""이면 0으로 반환
		return 0;
	}

	@Override
	public Board view(Board board) {
				
		//조회수 증가
		boardDao.updateHit(board);
		
		//게시글 반환
		board = boardDao.selectBoardByBoardno(board);
		
		return board;
	}

	@Override
	public void write(Board board) {
		boardDao.insertBoard(board);		
	}

	@Override
	public void boardUpdate(Board board) {
		boardDao.updateBoard(board);
	}

	@Override
	public void boardDelete(int board_no) {

		boardDao.deleteBoard(board_no);
	}

	@Override
	public List<Comment> commentList(Board board) {
		return boardDao.getComment(board);
	}

	@Override
	public void commentWrite(Comment comment) {
		boardDao.commentWrite(comment);
	}

	@Override
	public List<Board> getSearch(String type, String word) {
		return boardDao.search(type,word);
	}


}
