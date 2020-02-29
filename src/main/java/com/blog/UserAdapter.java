package com.blog;

public class UserAdapter {
  public User adapt(UserConfiguration userConfiguration) {
    return new User()
        .setId(userConfiguration.getId());
  }

}
