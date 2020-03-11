package com.blog.service;

import com.blog.domain.User;
import com.blog.domain.UserConfiguration;

public class UserService {

  private UserConfigurationService userConfigurationService;

  public UserService(UserAdapter userAdapter, UserConfigurationService userConfigurationService) {
    this.userAdapter = userAdapter;
    this.userConfigurationService = userConfigurationService;
  }

  private UserAdapter userAdapter;

  public User getUser(String userId) {

    final UserConfiguration userConfiguration = userConfigurationService.getUserConfiguration(userId);

    User user = userAdapter.adapt(userConfiguration);
    return user;
  }

}
