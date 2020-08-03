package com.study.study.domain.javadefault.service;

import com.study.study.domain.javadefault.dto.GetterBooleanDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GetterBooleanService {

    public void getterTest(GetterBooleanDto getterBooleanDto) {
        if(getterBooleanDto.isBool()) {
            log.info("this is true");
        } else {
            log.info("this is false");
        }
    }
}
