package com.boot.blogs.controller;

import com.boot.blogs.dto.UserDTO;
import com.boot.blogs.service.UserService;
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
    private UserService userService;

    /**
     * 查询All用户信息
     *
     * @param model
     * @return
     * @throws Exception
     */
    @GetMapping
    public ModelAndView userList(Model model) throws Exception {
        model.addAttribute("userList", userService.findAll());
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
        UserDTO userDTO = userService.findOne(id);
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
        model.addAttribute("user", new UserDTO(null, null, null));
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
    @PostMapping("/save")
    public ModelAndView insertOrUpdataUser(UserDTO userDTO) throws Exception {
        return new ModelAndView("users/list", "userModel", userService.save(userDTO));
    }

    /**
     * 删除用户
     *
     * @param userDTO
     * @return
     * @throws Exception
     */
    @PostMapping("/delete")
    public ModelAndView deleteUser(UserDTO userDTO) throws Exception {
        userService.delete(userDTO);
        return new ModelAndView("redirect/users");
    }

}
