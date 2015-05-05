package com.bialkowski;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

//    nie musze dodawac obydwu obiektow. Hibernate sie tym zajmie za mnie

    public static void main(String[] args9) {

        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Address address = new Address();
        address.setUlica("Kasprowicza");
        address.setNrMieszkania(21);

        Employee employee = new Employee();
        employee.setImie("Darek");
        employee.setNazwisko("Kwiatek");

        employee.setAddress(address);

        Employee employee2 = new Employee();
        employee2.setImie("Darek");
        employee2.setNazwisko("Kwiatek");

        employee2.setAddress(address);

        session.beginTransaction();
//        session.save(address);
        session.save(employee);
        session.save(employee2);
        session.getTransaction().commit();

        session.close();
        factory.close();
    }

}
