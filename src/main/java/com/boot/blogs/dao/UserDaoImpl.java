package com.boot.blogs.dao;

import com.boot.blogs.dto.UserDTO;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author chengzhengbo
 * @Date 2017/11/21
 * @TIME 下午12:37
 */
@Repository
public class UserDaoImpl implements UserDao {

    private static AtomicLong counts = new AtomicLong();
    private final Map<Long, UserDTO> userMap = new ConcurrentHashMap<Long, UserDTO>();

    @Override
    public UserDTO insertOrUpdateUser(UserDTO userDTO) throws Exception {
        Long id = userDTO.getId();
        userDTO.setId(id == null ? counts.incrementAndGet() : id);
        this.userMap.put(id, userDTO);
        return userDTO;
    }

    @Override
    public void deleteUser(long id) throws Exception {
        this.userMap.remove(id);
    }

    @Override
    public UserDTO selectUserById(long id) throws Exception {
        return this.userMap.get(id);
    }

    @Override
    public List<UserDTO> getListUsers() throws Exception {
        return Lists.newArrayList(this.userMap.values());
    }
}
