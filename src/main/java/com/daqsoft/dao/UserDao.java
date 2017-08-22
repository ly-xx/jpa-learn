package com.daqsoft.dao;

import com.daqsoft.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lxx
 */

@Component
public interface UserDao extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>{

    public List<User> findByAge(int age);

    @Query("select u from User u where id = :id")
    public User findUser(@Param(value = "id") long id);


}
