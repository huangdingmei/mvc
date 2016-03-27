package com.netshop.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;


/** 
*
* @ClassName: CustomExceptionResolver
* @Description:ȫ���쳣������
* @author  �ƶ�÷
* @date ����ʱ�䣺2016��3��23�� ����9:10:01
*/
public class CustomExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		CustomException customException=null;
		if (ex instanceof CustomException) {
			customException= (CustomException)ex;
		} else {
			customException=new CustomException("δ֪��Ϣ");
		}
		//������Ϣ
		String message=customException.getMessage();
		
		ModelAndView modelAndView=new ModelAndView();
		
		//��������Ϣ����ҳ��
		modelAndView.addObject("message",message);
		
		//ָ�����ҳ��
		modelAndView.setViewName("error");
		
		return modelAndView;
	}

}
