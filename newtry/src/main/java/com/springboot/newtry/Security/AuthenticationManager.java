package com.springboot.newtry.Security;

import org.springframework.security.core.Authentication;

import javax.naming.AuthenticationException;

public interface AuthenticationManager {
    Authentication authenticate(Authentication authentication)
            throws AuthenticationException;
}
