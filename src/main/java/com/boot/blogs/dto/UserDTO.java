package com.boot.blogs.dto;

import java.io.Serializable;

/**
 * 用户实体
 *
 * @author chengzhengbo
 * @Date 2017/11/21
 * @TIME 上午11:44
 */
public class UserDTO implements Serializable {

    private String id;
    private String name;
    private String email;

    public UserDTO(){}
    public UserDTO(String id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }


    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
