package com.khit.web.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PageDTO {
	private int page;		//현재 페이지
	private int maxPage;	//최대 페이지
	private int startPage;	//시작 페이지
	private int endPage;	//마지막 페이지
}
