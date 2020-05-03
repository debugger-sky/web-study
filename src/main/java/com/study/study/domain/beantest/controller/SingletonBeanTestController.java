package com.study.study.domain.beantest.controller;

import com.study.study.common.service.BeanConverterService;
import com.study.study.domain.beantest.model.BeanDto;
import com.study.study.domain.beantest.model.SingletonBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class SingletonBeanTestController {

    private final BeanConverterService beanConverterService;
    private final SingletonBean testBean;

    public SingletonBeanTestController(SingletonBean testBean,
                                       BeanConverterService beanConverterService) {
        this.testBean = testBean;
        this.beanConverterService = beanConverterService;
    }

    @GetMapping(value = "getSingletonBean")
    public BeanDto getSingletonBean() {
        return beanConverterService.convertToDto(testBean);
    }

    @PostMapping(value = "setSingletonBean")
    public void setSingletonBean(@RequestBody BeanDto testBean) {
        this.testBean.setName(testBean.getName());
        this.testBean.setAge(testBean.getAge());
        this.testBean.setSex(testBean.getSex());
    }
}
