package pl.sdacademy.spring.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.sdacademy.spring.model.UserModel;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(UserModel user) {
        sessionFactory.getCurrentSession().save(user);
    }

    public List<UserModel> list() {
        @SuppressWarnings("unchecked")
        TypedQuery<UserModel> query = sessionFactory.getCurrentSession().createQuery("from UserModel");
        return query.getResultList();
    }
}
