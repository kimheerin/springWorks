package ord.khit.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ord.khit.web.dto.UserDTO;
import ord.khit.web.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
   
   @Autowired
   private UserMapper userMapper;
   
   @Override
   public void insert(UserDTO userDTO) {
      userMapper.insert(userDTO);
   }

   @Override
   public List<UserDTO> findAll() {
      return userMapper.findAll();
   }

   @Override
   public UserDTO findById(Long id) {
      return userMapper.findById(id);
   }
   
   @Override
   public UserDTO login(UserDTO userDTO) {
      return userMapper.login(userDTO);
   }
}