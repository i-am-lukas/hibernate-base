package com.bialkowski;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

    public static void main(String[] args9) {

        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Address address = new Address();
        address.setUlica("Kasprowicza");
        address.setNrMieszkania(21);

        Employee employee = new Employee();
        employee.setImie("Darek");
        employee.setNazwisko("Kwiatek");

        session.beginTransaction();
        session.save(address);
        session.save(employee);
        session.getTransaction().commit();

        session.close();
        factory.close();
    }

}
