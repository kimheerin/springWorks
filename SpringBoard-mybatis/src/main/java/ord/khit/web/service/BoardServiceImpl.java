package ord.khit.web.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ord.khit.web.dto.BoardDTO;
import ord.khit.web.mapper.BoardMapper;

@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{
	
	private BoardMapper boardMapper;
	
	@Override
	public void insert(BoardDTO boardDTO) {
		
		boardMapper.insert(boardDTO);
	}

}
