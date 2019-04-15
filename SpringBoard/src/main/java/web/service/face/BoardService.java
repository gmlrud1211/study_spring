package web.service.face;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import web.dto.Board;
import web.util.Paging;

public interface BoardService {

	//전체 게시글 조회
	public List list(Paging paging);

	//전체 게시글 얻기
	public int getTotalCount(Board board);

	//현재 페이지 번호 
	public int getCurPage(HttpServletRequest req);

}
