package business;

import coreLogging.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao=courseDao;
        this.loggers=loggers;
    }
List<Course> courses=new ArrayList<Course>();

    public void add(Course course1) throws Exception{
        if (course1.getPrice()<0){
            throw new Exception("Kursun Fiyatı 0'dan küçük olamaz.");

        }
        for (Course course:courses){
            if (course.getName()==course1.getName()){
                throw new Exception("Kurs isimleri aynı olamaz");
            }
        }
        courses.add(course1);
        courseDao.add(course1);

        for (Logger logger:loggers) {
            logger.log(course1.getName());
        }

    }
}
