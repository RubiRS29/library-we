package com.library.app.domain.IRepository;

import com.library.app.domain.UserDomain;
import org.springframework.stereotype.Component;

import java.util.List;



public interface IUserRepository {
    List<UserDomain> getAll();
    UserDomain save(UserDomain userDomain);
    void delete(Long idUser);
}
