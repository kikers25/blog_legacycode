package com.blog.service;

import com.blog.domain.User;
import com.blog.domain.UserConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

@RunWith(org.mockito.runners.MockitoJUnitRunner.class)
public class UserServiceTest {

  private static final String USER_ID = "kikers25";
  private UserService userService;

  private UserConfigurationService userConfigurationService;

  @Before
  public void setUp() {
    final UserAdapter userAdapter = new UserAdapter();
    userConfigurationService = mock(UserConfigurationService.class);

    userService = new UserService(userAdapter, Factory.getUserConfigurationService())
            .setUserConfigurationService(userConfigurationService);
  }

  @Test
  public void should_work() throws Exception {
    final UserConfiguration aUser = new UserConfiguration().setId(USER_ID);
    Mockito.when(userConfigurationService.getUserConfiguration(Mockito.anyString()))
        .thenReturn(aUser);

    final User enrique = userService.getUser("kikers25");

    assertThat(enrique.getId(), is("kikers25"));
  }

}
