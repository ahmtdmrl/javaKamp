package oopWithNLayerdApp.dataAccess;

import oopWithNLayerdApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		//bu katmana sadece ve sadece DB erişim kodları buraya yazılır.
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}

}
