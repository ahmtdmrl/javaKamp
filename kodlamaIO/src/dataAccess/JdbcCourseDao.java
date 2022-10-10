package dataAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println(course.getName()+ "Kursu JDBC ile veritabanına eklenmiştir.");

    }
}
