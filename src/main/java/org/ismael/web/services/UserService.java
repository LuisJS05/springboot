package org.ismael.web.services;


import org.ismael.web.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User>  showAll();
    Optional<User> findById(Long id);
    User save(User user);
    void remove(Long id);
}
