package xyz.subho.retail.banking.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import xyz.subho.retail.banking.entity.User;

@Service("userDetailsService")
public interface UserService {

    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);

    void save(User user);

    User createUser(User user, Set<User> userRoles);

    User saveUser(User user);

    List<User> findUserList();

    void enableUser(String username);

    void disableUser(String username);

}