package com.netshop.text;



import java.util.List;
import org.junit.Test;
import com.netshop.dao.UserDao;
import com.netshop.dao.UserDao;
import com.netshop.model.User;

public class UserDaoImpltext {
    private UserDao userDAO=new UserDao();
	@Test
	public void testGetAll() {
		List<User> cust=userDAO.getAll();
		System.out.println(cust);
	}

	@Test
	public void testSave() {
		User cust=new User();
		
		cust.setU_addr("�Ƽ���ѧ");
		cust.setU_city("��̶");
		cust.setU_country("�й�");
		cust.setU_name("�ƶ�÷");
		cust.setU_password("123456");
		cust.setU_state("����");
		cust.setU_tel("15574480221");
		cust.setU_zip("505111");
		userDAO.save(cust);
	}

	@Test
	public void testGet() {
		User cust=userDAO.get(1);
		System.out.println(cust);
	}

	@Test
	public void testDelete() {
		userDAO.delete(1);
	}
	@Test
	public void getCountWithName(){
		long count=userDAO.getCountWithName("����");
		System.out.println(count);
	}

}
