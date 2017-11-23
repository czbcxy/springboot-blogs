package com.boot.blogs.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 用户实体
 *
 * @author chengzhengbo
 * @Date 2017/11/21
 * @TIME 上午11:44
 */
@Entity
public class UserDTO {

//    EntityManager entityManager；springdate中跟踪实体类，并进行类似herbernate映射为CRUD等方法，进行持久化映射；

    /**
     * 设置id策略为主键自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    private String rpassword;

    public void setId(Long id) {
        this.id = id;
    }

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String email, String password, String rpassword) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.rpassword = rpassword;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }

    @Override
    public String toString() {
        return String.format("User[id=%d,name=%s,email=s%,password=s%,rpassword=s%]", id, name, email, password, rpassword
        );
    }
}
