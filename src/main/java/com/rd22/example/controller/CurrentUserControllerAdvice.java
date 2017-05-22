package com.rd22.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.rd22.example.domain.CurrentUser;

@ControllerAdvice
//@Component
public class CurrentUserControllerAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(CurrentUserControllerAdvice.class);

    @ModelAttribute("currentUser")
    public CurrentUser getCurrentUser(Authentication authentication) {
    	String s = (authentication == null) ? "" : "" + (CurrentUser) authentication.getPrincipal();
    	LOGGER.debug(s);
        return (authentication == null) ? null : (CurrentUser) authentication.getPrincipal();
    }


}
