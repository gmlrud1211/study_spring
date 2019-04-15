package web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dto.Board;
import web.service.face.BoardService;
import web.util.Paging;


@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired BoardService boardService;
	
	@RequestMapping(value="/board/main", method=RequestMethod.GET)
	public void Main() {
		
	}
	
	@RequestMapping(value="/board/list", method=RequestMethod.GET)
	public void BoardList(int curPage, int totalCount) {
	
		//페이지 객체 생성
		Paging paging = new Paging(totalCount, curPage);
				
		List<Board> boardList = boardService.list(paging);
		
		
		
		
	
	}

	
}
