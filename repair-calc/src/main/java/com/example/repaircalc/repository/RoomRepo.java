//Работа с базой данных (функции и методы для работы с бд)

package com.example.repaircalc.repository;
import com.example.repaircalc.entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepo extends CrudRepository<RoomEntity, Long> {
    RoomEntity findByLayout (String layout);
}
