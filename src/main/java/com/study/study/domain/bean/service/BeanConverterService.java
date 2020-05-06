package com.study.study.domain.bean.service;

import com.study.study.domain.bean.model.BeanDto;
import com.study.study.domain.bean.model.ScopeBean;
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
