import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import coreLogging.DatabaseLogger;
import coreLogging.FileLogger;
import coreLogging.Logger;
import coreLogging.MailLogger;
import dataAccess.*;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course1=new Course(1,"JAVA", 360);
        Course course2=new Course(2, "JAVASC", 250);

        Logger[] loggers=new Logger[]{new DatabaseLogger(),new FileLogger(), new MailLogger()};
        CourseManager courseManager=new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);
        courseManager.add(course2);

        Category category=new Category(1, "JAVA");
        CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(),loggers);
        categoryManager.add(category);

        Instructor instructor=new Instructor(1,"Engin Demiroğ");
        InstructorManager instructorManager=new InstructorManager(new HibernateInstructorDao(),loggers);
        instructorManager.add(instructor);


    }
}