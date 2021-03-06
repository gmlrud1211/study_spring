package web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import web.dto.Board;
import web.dto.Comment;
import web.service.face.BoardService;
import web.util.Paging;


@Controller
@SessionAttributes("id")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired BoardService boardService;
	
	@RequestMapping(value="/board/list", method=RequestMethod.GET)
	public void BoardList(HttpServletRequest req, Model model, 
						String type, String word ) {		
		
		//현재 페이지 번호 얻기
		int curPage = boardService.getCurPage(req);
		System.out.println(curPage);
		
		//총게시글 수 얻기
		int totalCount = boardService.getTotalCount(type, word);
		
		//페이지 객체 생성
		Paging paging = new Paging(totalCount, curPage);
		System.out.println(paging);
		
		List<Board> boardList = boardService.list(paging,type,word);
		
		
		model.addAttribute("boardList", boardList);
		model.addAttribute("paging",paging);
		
		model.addAttribute("type", type);
		model.addAttribute("word",word);		
		
		
	}
	
	@RequestMapping(value="/board/view", method=RequestMethod.GET)
	public void View(Board board, Model model, HttpSession session) {
		logger.info("게시글 읽기");
		
		Board view = boardService.view(board);
		
		List<Comment> commentList = boardService.commentList(board);

		model.addAttribute("view", view);
		model.addAttribute("commentList",commentList);
		
	}
	
	@RequestMapping(value="/board/write", method=RequestMethod.GET)
	public void WriteForm() {
		logger.info("게시글 쓰기 form");
	
	}
	
	@RequestMapping(value="/board/write", method=RequestMethod.POST)
	public String Write(Board board, Model model) {
		logger.info("게시글 쓰기 write");
		
		//전달받은 정보로 게시글 작성
		boardService.write(board);
		
		return "redirect:/board/list";
	}
	
	@RequestMapping(value="/board/update", method=RequestMethod.GET)
	public void BoardUpdateForm(Board board, Model model) {
		logger.info("게시글수정 form");
		
		Board view = boardService.view(board);
		
		model.addAttribute("view", view);
		
	}
	
	@RequestMapping(value="/board/update", method=RequestMethod.POST)
	public String BoardUpdate(Board board, Model model, @RequestParam("board_no") int board_no) {
		logger.info("게시글수정처리");
		
		//전달받은 정보로 게시글 수정
		boardService.boardUpdate(board);
		
		return "redirect:/board/list";
	}

	@RequestMapping(value="/board/delete", method=RequestMethod.GET)
	public String BoardDelete(Board board, int board_no) {
		logger.info("게시글삭제");
		
		//게시글 삭제 처리
		boardService.boardDelete(board_no);
		
		return "redirect:/board/list";
	}
	
	@RequestMapping(value="/board/comment", method=RequestMethod.POST)
	public ModelAndView BoardCommentWrite(Comment comment, Model model, @RequestParam("board_no") int board_no) {
		logger.info("댓글 등록");
		
		//댓글 등록
		boardService.commentWrite(comment);
		
		RedirectView redirectView = new RedirectView("redirect:/board/view?="+board_no);
		redirectView.setExposeModelAttributes(true);
		
		return new ModelAndView(redirectView);
		
	}
	
	@RequestMapping(value="/board/commentDelete", method=RequestMethod.GET)
	public void BoardCommentDelete(Comment comment, Model model, @RequestParam("board_no") int board_no) {
		logger.info("댓글 삭제");
		
		//댓글 등록
		//boardService.commentDelete(comment);
	
	}
	
	@RequestMapping(value="/board/search", method=RequestMethod.POST)
	public String BoardSearch(Model model, 
							@RequestParam("type") String type,
							@RequestParam("word") String word
							) {
		logger.info("게시글 검색");
		
		System.out.println(type);
		System.out.println(word);
		
		//수정필요 ㅅㅄㅄㅄㅄㅅㅂ
		//검색된게시글 조회
		List<Board> boardList = boardService.getSearch(type, word);
		
		//model로 전달
		model.addAttribute(boardList);
		
		return  "redirect:/board/list";
	
	}
	
	@RequestMapping(value="/board/recommend", method=RequestMethod.GET)
	public void BoardRecommend(Board board, Model model, @RequestParam("board_no") int board_no) {
		logger.info("게시글 추천");
		
		/*
		 * if(type.equals("recommend")) { // 추천인 경우 boardService.recommend(u_no, b_no);
		 * } else if(type.equals("cancel")) { // 추천취소인 경우
		 * boardService.recommendCancel(u_no, b_no); }
		 * 
		 * int count = boardService.getRecommendCnt(b_no);
		 */
		
		
	}
	
	
	
	

	
}
