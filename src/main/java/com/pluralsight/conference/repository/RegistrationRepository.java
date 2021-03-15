package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Registration;

public interface RegistrationRepository {
    Registration save(Registration registration);
}
