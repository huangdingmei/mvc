package com.netshop.text;

import static org.junit.Assert.*;

import java.beans.PropertyVetoException;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class c3p0Test {

	@Test
	public void testc3p0() throws Exception {
		ComboPooledDataSource cpds = new ComboPooledDataSource();

		cpds.setDriverClass("com.mysql.jdbc.Driver"); //loads the jdbc driver

		cpds.setJdbcUrl( "jdbc:mysql://localhost/inventory_management" );

		cpds.setUser("root"); 

		cpds.setPassword("1210040125"); 
		
		System.out.println(cpds.getConnection());
	}

}
