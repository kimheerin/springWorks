package org.khit.myapp.controller;

import java.util.List;

import org.khit.myapp.dto.BoardDTO;
import org.khit.myapp.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor	//생성자 주입 new - 매개변수가 있는 생성자
@Slf4j
@RequestMapping("/board")
@Controller	//bean 객체로 등록
public class BoardController {
	
	//@Autowired
	//private BoardRepository boardRepository;
	private BoardService boardService;
	
	@GetMapping("/write")
	public String writeForm() {
		return "board/write";	// /board/write.jsp
	}
	
	//글 쓰기 처리
	@PostMapping("/write")
	public String write(@ModelAttribute BoardDTO boardDTO) {
		log.info("boardDTO=" + boardDTO);
		boardService.save(boardDTO);
		return "redirect:/board/list";	//response.sendRedirect()
	}
	
	//글 목록
	@GetMapping("/list")
	public String getListAll(Model model) {
		List<BoardDTO> boardDTOList =  boardService.getListAll();
		model.addAttribute("boardList", boardDTOList);
		//request.setAttribute()
		return "/board/list";
	}
	
	//글 상세보기
	//board?id=1
	@GetMapping
	public String getBoard(@RequestParam("id") Long id, Model model) {
		BoardDTO boardDTO =	boardService.findById(id);
		model.addAttribute("board", boardDTO);
		return "/board/detail";
	}
	
	//글 삭제 처리
	@GetMapping("/delete")
	public String delete(@RequestParam("id") long id) {
		boardService.delete(id);
		return "redirect:/board/list";	//response.sendRedirect()
	}
	
	//글 수정 페이지
	@GetMapping("/update")
	public String update(@RequestParam("id") long id, Model model) {
		//수정할 게시글 가져오기
		BoardDTO boardDTO =	boardService.findById(id);
		model.addAttribute("board", boardDTO);
		return "/board/update";	//update.jsp	
	}
	
	//글 수정 처리
	@PostMapping("/update")
	public String update(@ModelAttribute BoardDTO boardDTO) {
		boardService.update(boardDTO);
		return "redirect:/board/list";
	}
	
}
