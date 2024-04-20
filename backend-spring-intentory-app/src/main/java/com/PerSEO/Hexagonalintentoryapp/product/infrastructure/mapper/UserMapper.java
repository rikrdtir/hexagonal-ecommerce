package com.PerSEO.Hexagonalintentoryapp.product.infrastructure.mapper;

import com.PerSEO.Hexagonalintentoryapp.product.domain.model.User;
import com.PerSEO.Hexagonalintentoryapp.product.infrastructure.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(
            {
                    @Mapping(source = "id",target = "id"),
                    @Mapping(source = "username",target = "username"),
                    @Mapping(source = "lastname",target = "lastname"),
                    @Mapping(source = "email",target = "email"),
                    @Mapping(source = "address",target = "address"),
                    @Mapping(source = "cellphone",target = "cellphone"),
                    @Mapping(source = "password",target = "password"),
                    @Mapping(source = "userType",target = "userType"),
                    @Mapping(source = "dateCreated",target = "dateCreated"),
                    @Mapping(source = "dateUpdated",target = "dateUpdated")
            }
    )

    User toUser(UserEntity userEntity);

    Iterable<User> toUsers(Iterable<UserEntity> userEntities);

    @InheritInverseConfiguration
    UserEntity toUserEntity(User user);

}
