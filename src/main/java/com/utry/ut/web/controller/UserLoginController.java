package com.utry.ut.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.utry.ut.pojo.TestUser;
import com.utry.ut.pojo.TestUserExample;
import com.utry.ut.service.TestUserService;

@Controller
@RequestMapping("user")
public class UserLoginController {

	@Autowired
	TestUserService testUserService;

	// }/user/LoginUI
	@RequestMapping("/LoginUI")
	public String toLoginUI(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "main/login";
	}

	// user/toLogin
	@RequestMapping("/toLogin")
	public String toLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model,
			TestUser user) {
		// 登录之后
		System.out.println("user=" + user);
		TestUserExample example = new TestUserExample();
		com.utry.ut.pojo.TestUserExample.Criteria create = example.createCriteria();
		create.andUsernameEqualTo(user.getUsername());
		// create.andUseridEqualTo(user.getUserid());
		List<TestUser> selectByExample = testUserService.selectByExample(example);
		TestUser u = null;
		if (selectByExample != null && selectByExample.size() != 0 && selectByExample.isEmpty() == false) {
			u = selectByExample.get(0);
			System.out.println(u.getPassword() + "密码" + u.getUsername());
		} else {
			request.setAttribute("msg1", "失败，账号不存在！");
			return "main/login";
		}
		if (u.getPassword().equals(user.getPassword())) {
			request.setAttribute("msg1", "登录成功");
			session.setAttribute("currentUser", u);
			// 重定向到另一个界面
			System.err.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			return "redirect:listUI";
		} else {
			// session.setAttribute("lists", newsLists);
			request.setAttribute("msg1", "失败;密码错误！");
			return "main/login";
		}
	}

	// 去目录
	@RequestMapping("/listUI")
	public String toListUI(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "main/listPage";
	}
}