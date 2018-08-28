package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/8/28 0028.
 */

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    UserDAO userDAO;
    @Override
    public void save(User user) {
        userDAO.save(user);

    }

    @Override
    public List<User> queryAll() {
        return userDAO.queryAll();
    }
}
