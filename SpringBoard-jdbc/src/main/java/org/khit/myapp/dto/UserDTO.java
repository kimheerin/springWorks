package org.khit.myapp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class UserDTO {
	//�ʵ�
	private Long id;
	private String userId;
	private String userPasswd;
	private String userName;
	private Integer UserAge;
}
