package com.study.study.domain.bean.controller;

import com.study.study.domain.bean.service.BeanConverterService;
import com.study.study.domain.bean.model.BeanDto;
import com.study.study.domain.bean.model.SingletonBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class SingletonBeanController {

    private final BeanConverterService beanConverterService;
    private final SingletonBean testBean;

    public SingletonBeanController(SingletonBean testBean,
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
