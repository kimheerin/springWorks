package org.khit.myapp.unittest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.khit.myapp.sample.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
@Log4j
public class BeanTest {
	
	@Autowired //new 하여 사용한 것과 동일
	private Company company;	
	
	@Test
	public void beanTest() {
		log.info(company);
	}
}
