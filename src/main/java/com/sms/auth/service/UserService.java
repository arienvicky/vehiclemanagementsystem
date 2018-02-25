package com.sms.auth.service;

import com.sms.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
