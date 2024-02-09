package dao;

import entity.Category;
import entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;


public class CategoryDao {
    SessionFactory sessionFactory;
    public CategoryDao(){
        sessionFactory= HibernateUtil.getSessionFactory();
    }
    Session session;
    public Category createCategoryEntity(Category category){
        sessionFactory.getCurrentSession().save(category);
        return category;


    }
}
