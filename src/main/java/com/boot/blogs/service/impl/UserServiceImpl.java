package com.boot.blogs.service.impl;

import com.boot.blogs.dao.user.UserDaoImpl;
import com.boot.blogs.dto.UserDTO;
import com.boot.blogs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chengzhengbo
 * @Date 2017/11/22
 * @TIME 下午5:02
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDaoImpl userDao;

    @Override
    public UserDTO findAll() {
        return (UserDTO) userDao.findAll();
    }

    @Override
    public UserDTO findOne(Long id) {
        return userDao.findOne(id);
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        return userDao.save(userDTO);
    }

    @Override
    public void delete(UserDTO userDTO) {
        userDao.delete(userDTO);
    }
}
