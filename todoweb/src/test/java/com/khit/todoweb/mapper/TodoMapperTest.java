package com.khit.todoweb.mapper;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.khit.todoweb.dto.TodoDTO;
import com.khit.todoweb.vo.TodoVO;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\\\main\\\\webapp\\\\WEB-INF\\\\spring\\\\root-context.xml")
public class TodoMapperTest {

	@Autowired	//�ڵ� ����
	private TodoMapper todoMapper;
		
	@Test
	public void testGetTime() {
		log.info(todoMapper.getTime());
	}
	
	/*
	@Test
	public void testInsert() {
		//������ 1�� ���� - setter-> bulider()
		

		TodoVO todoVO = new TodoVO();
		todoVO.setTno(1L);
		todoVO.setTitle("������ �Ա�");
		todoVO.setWriter("����");
		todoVO.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		 
		TodoVO todoVO = TodoVO.builder()
				.title("�и������ϱ�")
				.writer("user01")
				.createdDate(new Timestamp(System.currentTimeMillis()))
				.build();
		
		todoMapper.insert(todoVO);
		*/
		
	@Test
	public void testFindAll() {
		//db�� �ִ� ������ �����ϱ�(�˻��ϱ�)
		List<TodoVO> todoList = todoMapper.findAll();
		
		for(TodoVO todo : todoList) {
			log.info(todo);
		}
	}
}
