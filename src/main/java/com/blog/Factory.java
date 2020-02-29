package com.blog;

public class Factory {

  public static UserConfigurationService getUserConfigurationService() {
    return new UserConfigurationService();
  }

}
