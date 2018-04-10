package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by erin.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);
}
