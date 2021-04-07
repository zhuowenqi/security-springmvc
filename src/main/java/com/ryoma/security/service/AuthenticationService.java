package com.ryoma.security.service;

import com.ryoma.security.model.AuthenticationRequest;
import com.ryoma.security.model.UserDetail;

public interface AuthenticationService {

    UserDetail authentication(AuthenticationRequest authenticationRequest);

}
