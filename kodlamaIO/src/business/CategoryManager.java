package business;

import coreLogging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    CategoryDao categoryDao;
    Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    List<Category> categories = new ArrayList<Category>();

    public void add(Category category1) throws Exception {

        for (Category category : categories) {
            if (category.getName() == category1.getName()) {
                throw new Exception("Kurs isimleri aynı olamaz");

            }
        }
        categories.add(category1);
        categoryDao.add(category1);
        for (Logger logger : loggers) {
            logger.log(category1.getName());

        }
    }

}
