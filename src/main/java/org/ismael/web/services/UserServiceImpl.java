package org.ismael.web.services;


import org.ismael.web.entity.User;
import org.ismael.web.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> showAll() {
        return (List<User>) this.repository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
