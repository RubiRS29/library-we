package com.library.app.persistence;


import com.library.app.domain.IRepository.IUserRepository;
import com.library.app.domain.UserDomain;
import com.library.app.persistence.JPA.IUserJPA;
import com.library.app.persistence.entity.UserLibrary;
import com.library.app.persistence.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserRepository implements IUserRepository{
    @Autowired
    private IUserJPA iUserJPA;

    @Autowired
    private IUserMapper mapper;

    @Override
    public List<UserDomain> getAll() {

        List<UserLibrary> users = (List<UserLibrary>) iUserJPA.findAll();
        return mapper.toUsers(users);
    }

    @Override
    public UserDomain save(UserDomain userDomain) {

        UserLibrary user = mapper.toUserDomain(userDomain);
        return mapper.toUser(iUserJPA.save(user));
    }

    @Override
    public void delete(Long idUser) {
        iUserJPA.deleteById(idUser);
    }
}
