package com.netshop.exception;


/** 
*
* @ClassName: CustomException
* @Description: 系统自定义异常类，针对预期的异常，需要在程序中
* 抛出此类的异常
* @author  黄鼎梅
* @date 创建时间：2016年3月23日 下午9:10:41
*/
public class CustomException extends Exception {
   //异常消息
	public String message;
	
	public CustomException(String message){
		super(message);
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
