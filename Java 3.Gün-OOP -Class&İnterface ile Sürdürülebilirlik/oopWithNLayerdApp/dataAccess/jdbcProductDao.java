package oopWithNLayerdApp.dataAccess;

import oopWithNLayerdApp.entities.Product;

public class jdbcProductDao implements ProductDao {  //Dao data access object
	public void add(Product product) {
		//bu katmana sadece ve sadece DB erişim kodları buraya yazılır.
		System.out.println("JDBC ile veritabanına eklendi");
		
	}

	
}

//Hibernate

