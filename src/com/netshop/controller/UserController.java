package com.netshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.netshop.model.User;
import com.netshop.service.UserService;
/** 
* @Description:TODO
* @parameter  
* @since  
* @author  黄鼎梅
* @date 创建时间：2016年3月23日 下午8:15:39
*/
@Controller
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/login")
	public String loginView(){
		return "/user/login";
	}
	
	@RequestMapping("/user/registerView")
	public String registerView(){
		return "register";
	}
	
	@RequestMapping("/loginView")
	public ModelAndView login(User user){
		ModelAndView mav = new ModelAndView();
		User u = userService.loginCheck(user);
		if(null==u){
			mav.setViewName("login");
			mav.addObject("errorMsg","用户名或密码有误！");
			return mav;
		}
		else{
			mav.setViewName("success");
			mav.addObject("user", u);
			return mav;
		}
	}
	
	@RequestMapping("/user/register")
	public ModelAndView register(User user){
		ModelAndView mav = new ModelAndView();
		if(userService.register(user)){
			mav.setViewName("register_succ");
			return mav;
		}
		else{
			mav.setViewName("register");
			mav.addObject("errorMsg","用户名已被占用，请更换！！");
			return mav;
		}
	}
}
