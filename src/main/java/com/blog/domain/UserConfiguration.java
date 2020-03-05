package com.blog.domain;

public class UserConfiguration {

  private String id;

  public UserConfiguration getUserConfiguration(String userId) {
    throw new RuntimeException("This method should not be called");
  }

  public UserConfiguration setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }
}
