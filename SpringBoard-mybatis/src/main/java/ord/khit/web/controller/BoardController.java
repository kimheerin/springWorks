package ord.khit.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ord.khit.web.dto.BoardDTO;
import ord.khit.web.service.BoardService;

@AllArgsConstructor	
@Slf4j
@RequestMapping("/board")
@Controller
public class BoardController {
	
	private BoardService boardService;
	
	//글쓰기 페이지
	@GetMapping("/write")
	public String writeForm() {
		return "/board/write";
	}

	// 글쓰기
	@PostMapping("/write")
	public String write(BoardDTO boardDTO) {
		log.info("boardDTO=", boardDTO);
		boardService.insert(boardDTO);
		return "redirect:/board/";
	}

	// 글 목록
	@GetMapping("/")
	public String getList() {
		return "board/boardlist";
	}

}
