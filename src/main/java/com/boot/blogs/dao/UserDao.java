package com.boot.blogs.dao;

import com.boot.blogs.dto.UserDTO;

import java.util.List;

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
    UserDTO insertOrupdateUser(UserDTO userDTO) throws Exception;

    /**
     * 删除用户信息
     *
     * @param id
     * @throws Exception
     */
    void deleteUser(String id) throws Exception;


    /**
     * 查询用户信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    UserDTO selectUserById(String id) throws Exception;

    /**
     * 查询所有用户信息
     *
     * @return
     * @throws Exception
     */
    List<UserDTO> getListUsers() throws Exception;

}
