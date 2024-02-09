package dao;

import entity.Product;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class ProductDao {
    SessionFactory sessionFactory;
    public ProductDao(){
        sessionFactory= HibernateUtil.getSessionFactory();
    }
    Session session;
    public Product createProductEntity(Product product){
        sessionFactory.getCurrentSession().save(product);
        return product;


    }
}
