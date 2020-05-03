package com.study.study.domain.beantest.service;

import com.study.study.domain.beantest.model.BeanDto;
import com.study.study.domain.beantest.model.ScopeBean;
import org.springframework.stereotype.Component;

@Component
public class BeanConverterService {

    public <T extends ScopeBean> BeanDto convertToDto(T scopeBean) {
        BeanDto beanDto = new BeanDto();
        beanDto.setName(scopeBean.getName());
        beanDto.setAge(scopeBean.getAge());
        beanDto.setSex(scopeBean.getSex());
        return beanDto;
    }

}
