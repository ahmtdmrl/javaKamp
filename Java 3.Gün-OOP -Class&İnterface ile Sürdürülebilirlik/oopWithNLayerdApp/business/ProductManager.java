package oopWithNLayerdApp.business;

import java.util.List;

import oopWithNLayerdApp.corelogging.Logger;
import oopWithNLayerdApp.dataAccess.HibernateProductDao;
import oopWithNLayerdApp.dataAccess.ProductDao;
import oopWithNLayerdApp.dataAccess.jdbcProductDao;
import oopWithNLayerdApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao; 
	//sağ tıkla-source-general cons using field yap
	
	private Logger[] loggers; 
	

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product ) throws Exception {
		//iş kuralları yazılır...business rolls
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
					
		}
		
		//ProductDao productDao = new HibernateProductDao(); 
		productDao.add(product);
		
		for (Logger logger : loggers) { //[db,mail]
			logger.log(product.getName());
						
		}
		
	}
	
}
