package ord.khit.web.mapper;

import java.util.List;

import ord.khit.web.dto.UserDTO;

public interface UserMapper {
	
	void insert(UserDTO userDTO);
	
	List<UserDTO> findAll();

	UserDTO findById(Long id);

	UserDTO login(UserDTO userDTO);
}
