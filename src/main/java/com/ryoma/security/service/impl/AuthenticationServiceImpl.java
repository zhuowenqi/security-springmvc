package com.ryoma.security.service.impl;

import com.ryoma.security.model.AuthenticationRequest;
import com.ryoma.security.model.UserDetail;
import com.ryoma.security.service.AuthenticationService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Override
    public UserDetail authentication(AuthenticationRequest authenticationRequest) {
        if (authenticationRequest == null ||
                StringUtils.isEmpty(authenticationRequest.getUsername()) ||
                StringUtils.isEmpty(authenticationRequest.getPassword())) {
            throw new RuntimeException("账号或者密码不能为空");
        }
        UserDetail userDetail = getUserDetail(authenticationRequest.getUsername());
        if (userDetail == null) {
            throw new RuntimeException("查询不到该用户");
        }
        if (!authenticationRequest.getPassword().equalsIgnoreCase(userDetail.getPassword())) {
            throw new RuntimeException("用户名或者密码错误");
        }
        return userDetail;
    }

    private UserDetail getUserDetail(String username) {
        return userMap.get(username);
    }

    private Map<String, UserDetail> userMap = new HashMap<>();{
        userMap.put("zhangsan", new UserDetail("1", "zhangsan", "6", "张三", "13205921170"));
        userMap.put("lisi", new UserDetail("2", "lisi", "a", "李四", "18624406632"));
    }
}
