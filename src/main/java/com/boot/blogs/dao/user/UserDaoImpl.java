package com.boot.blogs.dao.user;

import com.boot.blogs.dto.UserDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author chengzhengbo
 * @Date 2017/11/22
 * @TIME 下午4:12
 */
@Repository
public interface UserDaoImpl extends CrudRepository<UserDTO ,Long> {
    
}
