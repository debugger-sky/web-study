package com.study.study.domain.nativequery.controller;

import com.study.study.domain.nativequery.service.NativeQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class NativeQueryController {

    private final NativeQueryService nativeQueryService;

    public NativeQueryController(NativeQueryService nativeQueryService) {
        this.nativeQueryService = nativeQueryService;
    }

    @GetMapping("deleteFreeboard")
    public @ResponseBody String deleteFreeboard() {
        Integer deleted = nativeQueryService.deleteFreeboard();
        log.info("deleted count = {}", deleted);

        return "deleted count = " + deleted;
    }
}
