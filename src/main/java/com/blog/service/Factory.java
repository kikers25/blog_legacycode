package com.blog.service;

public class Factory {

  public static UserConfigurationService getUserConfigurationService() {
    return new UserConfigurationService();
  }

}
