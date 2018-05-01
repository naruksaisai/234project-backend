package camt.se234.project.service;

import camt.se234.project.dao.UserDao;
import camt.se234.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    UserDao userDao;
    @Override
    public User authenticate(String username, String password) {
        return userDao.getUser(username,password);
    }
}
