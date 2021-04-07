package com.ryoma.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetail {

    private String id;

    private String username;

    private String password;

    private String fullname;

    private String mobile;

}
