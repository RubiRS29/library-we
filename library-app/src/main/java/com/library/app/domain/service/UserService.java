package com.library.app.domain.service;


import com.library.app.domain.IRepository.IUserRepository;
import com.library.app.domain.UserDomain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Intermediario entre el controladoor y el repositorio

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public UserDomain save(UserDomain userDomain){
        return userRepository.save(userDomain);
    }
    public List<UserDomain> getAll(){
        return userRepository.getAll();
    }
    public void delete(Long idUser){
        userRepository.delete(idUser);
    }

}
