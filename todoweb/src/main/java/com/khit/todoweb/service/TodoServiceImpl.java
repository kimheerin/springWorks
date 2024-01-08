package com.khit.todoweb.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.khit.todoweb.dto.TodoDTO;
import com.khit.todoweb.mapper.TodoMapper;
import com.khit.todoweb.vo.TodoVO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class TodoServiceImpl implements TodoService {
	
	private TodoMapper todoMapper;
	
	private ModelMapper modelMapper;
	
	@Override
	public void insert(TodoDTO todoDTO) {
		/*
		//DTO -> VO 변환
		//1. 모듈을 사용하지 않은 경우
		TodoVO todoVO = TodoVO.builder()
				.title(todoDTO.getTitle())
				.writer(todoDTO.getWriter())
				.build();
		
		todoMapper.insert(todoVO);
		*/
		
		//2. 모듈(ModelMapper)을 사용한 경우
		TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
		todoMapper.insert(todoVO);
		
	}

	@Override
	public List<TodoDTO> findAll() {
		//VO -> DTO 변환
		//vo 리스트 데이터 가져오기
		List<TodoVO> voList =  todoMapper.findAll();
		
		//vo 리스트 데이터를 dto로 저장 후 반환
		List<TodoDTO> dtoList = voList.stream()
				.map(vo -> modelMapper.map(vo, TodoDTO.class))
				.collect(Collectors.toList());
		
		return dtoList;
	}

}
