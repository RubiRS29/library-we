package com.library.app.persistence.mapper;


import com.library.app.domain.UserDomain;
import com.library.app.persistence.entity.UserLibrary;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Mapper(componentModel = "spring")
public interface IUserMapper {
    @Mappings({
            @Mapping(source = "id", target = "idUser"),
            @Mapping(source = "name", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "email", target = "userEmail"),
            @Mapping(source = "username", target = "username"),
            @Mapping(source = "password", target = "userPassword"),
            @Mapping(source = "nationality", target = "userNationality"),
            @Mapping(source = "phone", target = "userPhoneNumber"),
            @Mapping(source = "photoProfile", target = "userPhotoProfile"),
            @Mapping(source = "rol", target = "rolUser"),
            @Mapping(source = "create", target = "createAccount"),
            @Mapping(source = "update", target = "updateAccount"),
    })
    UserDomain toUser(UserLibrary user);

    List<UserDomain> toUsers(List<UserLibrary> users);

    @InheritInverseConfiguration
    UserLibrary toUserDomain(UserDomain userDomain);
}
