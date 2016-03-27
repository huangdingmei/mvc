package com.netshop.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;


/** 
*
* @ClassName: CustomExceptionResolver
* @Description:全局异常处理器
* @author  黄鼎梅
* @date 创建时间：2016年3月23日 下午9:10:01
*/
public class CustomExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		CustomException customException=null;
		if (ex instanceof CustomException) {
			customException= (CustomException)ex;
		} else {
			customException=new CustomException("未知信息");
		}
		//错误信息
		String message=customException.getMessage();
		
		ModelAndView modelAndView=new ModelAndView();
		
		//将错误信息传到页面
		modelAndView.addObject("message",message);
		
		//指向错误页面
		modelAndView.setViewName("error");
		
		return modelAndView;
	}

}
