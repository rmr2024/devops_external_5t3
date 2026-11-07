package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private final List<Registration> registrations = new ArrayList<>();

    public List<Registration> getAll() {
        return registrations;
    }

    public Registration add(Registration registration) {
        registrations.add(registration);
        return registration;
    }
}
