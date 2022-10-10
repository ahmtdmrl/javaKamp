package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getName()+ "Kurs Eğitmeni Hibernate ile veritabanına eklendi");

    }
}
