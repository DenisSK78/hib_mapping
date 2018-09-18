package psvm;

import entity.Employee;
import entity.Meeting;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDateTime;

public class Go {

    private static final SessionFactory SESSION_FACTORY
            = new Configuration().configure().buildSessionFactory();

    public static void main(String[] args) {

        Session session = SESSION_FACTORY.openSession();
        Transaction transaction = session.beginTransaction();

//        Organization org = new Organization("Bank.");
//        session.save(org);
//        Employee em = new Employee("Gena", "manager", org);
//        Employee em1 = new Employee("Sveta", "boss", org);
//        session.save(em);
//        session.save(em1);

//        Organization org = session.find(Organization.class, 1L);
//        System.out.println(org);
//        Set<Employee> employees = org.getEmployees();
//        System.out.println(employees);
//        Employee em = session.find(Employee.class, 1L);
//        Phone phone = new Phone(375296893457L);
//        phone.setEmployee(em);
//        session.save(phone);
//        System.out.println(em);

//        Employee em1 = session.get(Employee.class, 1L);
//        Employee em2 = session.get(Employee.class, 2L);
//        Meeting meeting = new Meeting(LocalDateTime.now());
//        meeting.addParticipants(em2);
//        meeting.addParticipants(em1);
//        session.save(meeting);

//        Meeting met = session.get(Meeting.class, 1L);
//        System.out.println(met);

        Employee em = session.get(Employee.class, 2L);
        System.out.println(em);

        System.out.println();

        System.out.println(em.getMeetings());

        transaction.commit();
        session.close();
        SESSION_FACTORY.close();








    }
}
