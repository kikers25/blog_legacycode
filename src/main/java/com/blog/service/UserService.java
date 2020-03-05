package com.blog.service;

import com.blog.domain.User;
import com.blog.domain.UserConfiguration;

public class UserService {

  private UserConfigurationService userConfigurationService = null;

  public UserService(UserAdapter userAdapter) {
    this.userAdapter = userAdapter;
  }

  private UserAdapter userAdapter;

  public User getUser(String userId) {

    final UserConfigurationService userConfigurationService = getUserConfigurationService();
    final UserConfiguration userConfiguration = userConfigurationService.getUserConfiguration(userId);

    User user = userAdapter.adapt(userConfiguration);
    return user;
  }

  protected UserConfigurationService getUserConfigurationService() {
    if (userConfigurationService == null) {
      return Factory.getUserConfigurationService();
    }
    return userConfigurationService;
  }

  // Just for testing purposes
  public UserService setUserConfigurationService(UserConfigurationService userConfigurationService) {
    this.userConfigurationService = userConfigurationService;
    return this;
  }
}
