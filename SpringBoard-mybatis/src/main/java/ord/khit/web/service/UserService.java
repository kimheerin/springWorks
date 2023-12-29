package ord.khit.web.service;

import java.util.List;

import ord.khit.web.dto.UserDTO;

public interface UserService {

	void insert(UserDTO userDTO);

	List<UserDTO> findAll();

	UserDTO findById(Long id);

	UserDTO login(UserDTO userDTO);
}
