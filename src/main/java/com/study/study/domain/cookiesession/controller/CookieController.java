package com.study.study.domain.cookiesession.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class CookieController {

    @GetMapping(value = "/cookieInfo")
    public ResponseEntity<String> cookieInfo(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();

        if(cookies == null && cookies.length > 0) {
            log.info("cookie is null");
        } else {
            for(Cookie cookie : cookies) {
                log.info("cookie!!  {} : {}", cookie.getName(), cookie.getValue());
            }
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
