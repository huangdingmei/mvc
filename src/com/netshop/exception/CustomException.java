package com.netshop.exception;


/** 
*
* @ClassName: CustomException
* @Description: ϵͳ�Զ����쳣�࣬���Ԥ�ڵ��쳣����Ҫ�ڳ�����
* �׳�������쳣
* @author  �ƶ�÷
* @date ����ʱ�䣺2016��3��23�� ����9:10:41
*/
public class CustomException extends Exception {
   //�쳣��Ϣ
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
