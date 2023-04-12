package web311.dao;



import web311.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void add(User user);
    void remove(User user);
    void edit(User user);
    User getById(Long id);
}