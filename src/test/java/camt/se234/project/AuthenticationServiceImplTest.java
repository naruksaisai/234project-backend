package camt.se234.project;

import camt.se234.project.dao.UserDao;
import camt.se234.project.entity.User;
import camt.se234.project.service.AuthenticationServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuthenticationServiceImplTest {
    UserDao userDao;
    AuthenticationServiceImpl authenticationService;

    @Before
    public void setUp() {
        userDao = mock(UserDao.class);
        authenticationService = new AuthenticationServiceImpl();
        authenticationService.setUserDao(userDao);
    }

    @Test
    public void testAuthenticate() {
        userDao = mock(UserDao.class);
        authenticationService = new AuthenticationServiceImpl();
        authenticationService.setUserDao(userDao);
        List<User> mockUser = new ArrayList<>();
        mockUser.add(new User("nongjoy","2345","Support"));
        mockUser.add(new User("nonguboa","2345","carry"));
        when(userDao.getUser("nongjoy","2345")).thenReturn(new User("nongjoy","2345","Support"));
        when(userDao.getUser("nonguboa","2345")).thenReturn(new User("nongjoy","2345","carry"));
    }
}