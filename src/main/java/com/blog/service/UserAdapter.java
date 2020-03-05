package com.blog.service;


import com.blog.domain.User;
import com.blog.domain.UserConfiguration;

public class UserAdapter {
  public User adapt(UserConfiguration userConfiguration) {
    return new User()
        .setId(userConfiguration.getId());
  }

}
