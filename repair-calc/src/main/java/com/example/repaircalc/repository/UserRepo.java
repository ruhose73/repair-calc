//Работа с базой данных (функции и методы для работы с бд)

package com.example.repaircalc.repository;
import com.example.repaircalc.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
