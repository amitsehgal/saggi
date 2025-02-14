package com.example.saggi.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Authentication result = new CustomAuthenticationToken("cardid", "test");
        result.setAuthenticated(true);
        return result;

    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
