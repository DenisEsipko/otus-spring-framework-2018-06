package ru.otus.spring.sokolovsky.hw12.access;

import org.springframework.security.core.userdetails.UserDetails;

public interface TokenProviderService {
    String getToken(String username, String password);

    UserDetails getUserDetails(String token);
}
