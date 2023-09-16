package com.springboot.newtry.Security;

import javax.naming.AuthenticationException;

public interface Authentication {

    Authentication authenticate(Authentication authentication)
            throws AuthenticationException;
}
