package com.study.study.domain.bean.controller;

import com.study.study.domain.bean.service.BeanConverterService;
import com.study.study.domain.bean.model.BeanDto;
import com.study.study.domain.bean.model.SessionBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionBeanController {

    private final BeanConverterService beanConverterService;
    private final SessionBean testBean;

    public SessionBeanController(SessionBean testBean,
                                 BeanConverterService beanConverterService) {
        this.testBean = testBean;
        this.beanConverterService = beanConverterService;
    }

    @GetMapping(value = "getSessionBean")
    public BeanDto getSessionBean() {
        return beanConverterService.convertToDto(testBean);
    }

    @PostMapping(value = "setSessionBean")
    public void setSessionBean(@RequestBody BeanDto testBean) {
        this.testBean.setName(testBean.getName());
        this.testBean.setAge(testBean.getAge());
        this.testBean.setSex(testBean.getSex());
    }
}
