package com.pluralsight.conference.service;

import com.pluralsight.conference.model.Registration;

import javax.transaction.Transactional;

public interface RegistrationService {
    @Transactional
    Registration addRegistration(Registration registration);
}
