package com.boot.blogs.service;

import com.boot.blogs.dto.UserDTO;
import org.springframework.stereotype.Service;

/**
 * @author chengzhengbo
 * @Date 2017/11/22
 * @TIME 下午5:01
 */
@Service
public interface UserService {
    /**
     * 查询全部用户
     *
     * @return
     */
    UserDTO findAll();

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    UserDTO findOne(Long id);

    /**
     * 添加用户
     *
     * @param userDTO
     * @return
     */
    UserDTO save(UserDTO userDTO);

    /**
     * 删除用户
     *
     * @param userDTO
     */
    void delete(UserDTO userDTO);
}
