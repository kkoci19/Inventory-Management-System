package dao;

import entity.Product;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import java.util.List;

import static util.HibernateUtil.getSessionFactory;

public class ProductDao {
    SessionFactory sessionFactory;
    public ProductDao(){
        sessionFactory= getSessionFactory();
    }
    Session session;
    public Product createProductEntity(Product product){
        sessionFactory.getCurrentSession().save(product);
        return product;


    }
    public List<Product> displayProducts(){
        try (Session session=getSessionFactory().openSession()){
            return session.createQuery("FROM product_table",Product.class).list();
        }
    }

    public List<Product> notifyLowStock() {
        try (Session session = getSessionFactory().openSession()) {
            return session.createQuery("FROM product_table WHERE quantity<=3", Product.class).list();
        }
    }
}
