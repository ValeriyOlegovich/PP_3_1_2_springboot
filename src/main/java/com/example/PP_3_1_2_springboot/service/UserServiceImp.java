package com.example.PP_3_1_2_springboot.service;


import com.example.PP_3_1_2_springboot.dao.UserDao;
import com.example.PP_3_1_2_springboot.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp{

   private final UserDao userDao;
   @Autowired
   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   public void add(User user) {
      userDao.save(user);
   }

   public void upd(User user) {

   }

   public List<User> listUsers() {
      return userDao.findAll();
   }

   public void delete(long id) {
      userDao.deleteById(id);
   }

   public User getUserById(long id) {
      return userDao.getOne(id);
   }

}
