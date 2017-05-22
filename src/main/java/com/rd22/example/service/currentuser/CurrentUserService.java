package com.rd22.example.service.currentuser;

import com.rd22.example.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
