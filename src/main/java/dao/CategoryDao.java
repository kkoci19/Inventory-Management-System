package dao;

import entity.Category;
import entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import java.util.List;

import static util.HibernateUtil.getSessionFactory;


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

    public List<Category> displayCategory(){
        try (Session session=getSessionFactory().openSession()){
            return session.createQuery("FROM category_table",Category.class).list();
        }
    }
}
