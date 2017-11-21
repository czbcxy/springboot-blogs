package com.boot.blogs.dao;

import com.boot.blogs.dto.UserDTO;

/**
 * 用户持久层接口
 *
 * @author chengzhengbo
 * @Date 2017/11/21
 * @TIME 上午11:49
 */
public interface UserDao {
    /**
     * 添加用户信息
     *
     * @param userDTO
     * @return
     * @throws Exception
     */
    String insertUser(UserDTO userDTO) throws Exception;

    /**
     * 删除用户信息
     *
     * @param id
     * @throws Exception
     */
    void deleteUser(String id) throws Exception;

    /**
     * 更改用户信息
     *
     * @param userDTO
     * @throws Exception
     */
    void updateUser(UserDTO userDTO) throws Exception;

}
