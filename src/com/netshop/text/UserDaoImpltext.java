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
		
		cust.setU_addr("¿Æ¼¼´óÑ§");
		cust.setU_city("ÏæÌ¶");
		cust.setU_country("ÖÐ¹ú");
		cust.setU_name("»Æ¶¦Ã·");
		cust.setU_password("123456");
		cust.setU_state("ºþÄÏ");
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
		long count=userDAO.getCountWithName("ï¿½ï¿½ï¿½ï¿½");
		System.out.println(count);
	}

}
