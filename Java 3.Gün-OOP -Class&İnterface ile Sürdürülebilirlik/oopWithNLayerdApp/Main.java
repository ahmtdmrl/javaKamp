package oopWithNLayerdApp;

import oopWithNLayerdApp.business.ProductManager;
import oopWithNLayerdApp.corelogging.DatabaseLogger;
import oopWithNLayerdApp.corelogging.FileLogger;
import oopWithNLayerdApp.corelogging.Logger;
import oopWithNLayerdApp.corelogging.MailLogger;
import oopWithNLayerdApp.dataAccess.HibernateProductDao;
import oopWithNLayerdApp.dataAccess.jdbcProductDao;
import oopWithNLayerdApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 =new Product(1, "Iphone Xr", 10000);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger() };
				
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
	}

}
