package com.blog;

public class UserService {

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
    return Factory.getUserConfigurationService();
  }

}
