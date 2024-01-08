package com.khit.todoweb.unittest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.khit.todoweb.dto.TodoDTO;
import com.khit.todoweb.service.TodoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
public class TodoServiceTest {
   
   @Autowired
   private TodoService todoService;
   
   @Test
   public void testInsert() {
      TodoDTO todoDTO = TodoDTO.builder()   
                     .title("취업하기")
                     .writer("Compony")
                     .build();
      
      todoService.insert(todoDTO);
   }
}