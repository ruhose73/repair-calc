//Конкретная логика

package com.example.repaircalc.service;

import com.example.repaircalc.entity.UserEntity;
import com.example.repaircalc.exception.UserAlreadyExistException;
import com.example.repaircalc.exception.UserNotFoundException;
import com.example.repaircalc.model.User;
import com.example.repaircalc.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;


    public UserEntity registration (UserEntity user) throws UserAlreadyExistException {
        if(userRepo.findByUsername(user.getUsername()) != null) {
            throw new UserAlreadyExistException("Пользователь с таким именем существует");
        }
        return userRepo.save(user);
    }

    public User getOne (Long id) throws UserNotFoundException {
        UserEntity user = userRepo.findById(id).get();
        if(user == null) {
            throw new UserNotFoundException("Пользователь не был найден");
        }
        return User.toModel(user);
    }

    public Long delete (Long id) {
        userRepo.deleteById(id);
        return id;
    }

}
