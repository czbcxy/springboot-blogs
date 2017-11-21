package com.boot.blogs.controller;

import com.boot.blogs.dao.UserDao;
import com.boot.blogs.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author chengzhengbo
 * @Date 2017/11/21
 * @TIME 下午12:54
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserDao userDao;

    /**
     * 查询All用户信息
     *
     * @param model
     * @return
     * @throws Exception
     */
    @GetMapping
    public ModelAndView userList(Model model) throws Exception {
        model.addAttribute("userList", userDao.getListUsers());
        model.addAttribute("title", "用户管理");
        return new ModelAndView("users/list", "userModel", model);
    }

    /**
     * 根据用户id查询用户信息
     *
     * @param id
     * @param model
     * @return
     * @throws Exception
     */
    @GetMapping("{id}")
    public ModelAndView gitView(@PathVariable("id") Long id, Model model) throws Exception {
        UserDTO userDTO = userDao.selectUserById(id);
        model.addAttribute("user", userDTO);
        model.addAttribute("title", "查看用户");
        return new ModelAndView("users/list", "userModel", model);
    }

    /**
     * 创建表单页面
     *
     * @param model
     * @return
     * @throws Exception
     */
    @GetMapping("/form")
    public ModelAndView createForm(Model model) throws Exception {
        model.addAttribute("user", new UserDTO());
        model.addAttribute("title", "创建用户");
        return new ModelAndView("users/list", "userModel", model);
    }

    /**
     * 添加修改用户
     *
     * @param userDTO
     * @return
     * @throws Exception
     */
    @PostMapping
    public ModelAndView insertOrUpdataUser(UserDTO userDTO) throws Exception {
        return new ModelAndView("users/list", "userModel", userDao.insertOrUpdateUser(userDTO));
    }

}
