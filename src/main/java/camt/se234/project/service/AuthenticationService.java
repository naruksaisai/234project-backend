package camt.se234.project.service;

import camt.se234.project.entity.User;

public interface AuthenticationService {
    User authenticate(String username, String password);
}
