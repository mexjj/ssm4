package com.xjj.service.impl;

import com.xjj.mapping.LoginMapper;
import com.xjj.model.Student;
import com.xjj.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Student getStudentByID(String id) {

        String s1 = "";
        return null;
    }
}
