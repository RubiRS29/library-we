package com.library.app.persistence.JPA;


import com.library.app.persistence.entity.Rol;
import com.library.app.persistence.entity.UserLibrary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserJPA extends JpaRepository<UserLibrary, Long> {
    List<UserLibrary> getUsersByRol(Rol rol);

}
