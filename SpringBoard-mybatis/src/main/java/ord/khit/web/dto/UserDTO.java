package ord.khit.web.dto;

import lombok.Data;

/*@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter*/
@Data
public class UserDTO {
	//�ʵ�
	private Long id;
	private String userId;
	private String userPasswd;
	private String userName;
	private int userAge;
}
