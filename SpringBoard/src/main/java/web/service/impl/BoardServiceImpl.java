package web.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.dao.face.BoardDao;
import web.dto.Board;
import web.service.face.BoardService;
import web.util.Paging;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired BoardDao boardDao;

	@Override
	public List list(Paging paging) {
		return boardDao.selectAll(paging);
	}
	
	@Override
	public int getTotalCount(Board board) {
		return boardDao.selectCntBoard();
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
		boardDao.selectBoardByBoardno(board);
		
		return board;
	}



}
