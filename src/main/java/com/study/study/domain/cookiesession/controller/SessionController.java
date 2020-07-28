package com.study.study.domain.cookiesession.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@Slf4j
public class SessionController {

    @GetMapping(value = "/sessionInfo")
    public ResponseEntity<String> sessionInfo(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();

        if(httpSession == null) {
            log.info("http session is null");
        } else {
            log.info("session id : {}", httpSession.getId());
            httpSession.setAttribute("user_name", "sky");
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/userInfo")
    public ResponseEntity<String> userInfo(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        log.info("user_name : {}", httpSession.getAttribute("user_name"));

        return new ResponseEntity<>((String) httpSession.getAttribute("user_name"), HttpStatus.OK);
    }
}
