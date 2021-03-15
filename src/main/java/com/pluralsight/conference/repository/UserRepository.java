package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.User;

public interface UserRepository {
    User save(User user);
}
