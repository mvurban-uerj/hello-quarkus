package org.example.crud.service;

import org.example.crud.entity.UserEntity;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {
 
   public UserEntity createUser(UserEntity userEntity){

      UserEntity.persist(userEntity);
      return userEntity;

   }
}
