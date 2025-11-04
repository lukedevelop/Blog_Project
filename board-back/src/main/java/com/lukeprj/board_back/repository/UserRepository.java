package com.lukeprj.board_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lukeprj.board_back.entity.UserEntity;

// JpaRepository<UserEntity, String> <어떤 엔티티에, 지정한 엔티티의 pk값 타입>
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{
    
    boolean existsByEmail(String email);
    boolean existsByNickname(String nickname);
    boolean existsByTelNumber(String telNumber);

    UserEntity findByEmail (String email);

}
