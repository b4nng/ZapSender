package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPA {
    protected void setUp() throws Exception {
        EntityManagerFactory sessionFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
    }
}
