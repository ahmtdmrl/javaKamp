package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getName()+ "Kurs Eğitmeni JDBC ile veritabanına eklendi");

    }
}
