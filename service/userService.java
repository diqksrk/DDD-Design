package com.codestates.universitysystem.service;

import com.codestates.universitysystem.domain.User;

import java.util.Map;

public class userService {

    Map<String, String> join(User user);

    Map<String, String> login(User user);
}
