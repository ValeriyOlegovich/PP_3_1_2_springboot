package com.example.PP_3_1_2_springboot.dao;

import com.example.PP_3_1_2_springboot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}
