package com.example.FirstProject.service;

import com.example.FirstProject.dto.UserDto;
import com.example.FirstProject.entity.User;
import com.example.FirstProject.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public UserDto saveUser(UserDto userDto){
        userRepository.save(modelMapper.map(userDto, User.class));
        return  userDto;
    }

    public List<UserDto> getAllUsers(){
        List<User> userList = userRepository.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDto>>(){}.getType());
    }

    public UserDto updateUser(UserDto userDto){
        userRepository.save(modelMapper.map(userDto,User.class));
        return  userDto;
    }
    public String deleteUser(UserDto userDto){
        userRepository.delete(modelMapper.map(userDto,User.class));
        return "Delete User Successfully";
    }
}
