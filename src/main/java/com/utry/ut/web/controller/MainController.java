package com.utry.ut.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @版权: Copyright (c) 2016-2017 *********公司技术开发部
 * @author : huangjiapeng
 * @E-mail:1625545295@qq.com
 * @版本: 1.0
 * @创建日期: 2019年4月13日 下午1:18:55
 * @ClassName MainController
 * @类描述-Description: TODO
 * @修改记录:
 * @版本: 1.0
 */

@Controller
public class MainController {
	@RequestMapping("/")
	public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "index";
	}
}
