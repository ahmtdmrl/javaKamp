package business;


import dataAccess.InstructorDao;
import coreLogging.Logger;
import entities.Instructor;


public class InstructorManager {
    InstructorDao instructorDao;
    Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers){
        this.instructorDao=instructorDao;
        this.loggers=loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for (Logger logger:loggers){
            logger.log(instructor.getName());
        }

    }
}
