package com.khit.web.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PageDTO {
	private int page;		//���� ������
	private int maxPage;	//�ִ� ������
	private int startPage;	//���� ������
	private int endPage;	//������ ������
}
