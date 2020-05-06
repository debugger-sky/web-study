package com.study.study.domain.trycatch.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class TryCatchController {

    @GetMapping(value = "getTryCatchTest")
    public @ResponseBody String getTryCatchTest(@RequestParam(name = "num1") String num1,
                                                @RequestParam(name = "num2") String num2,
                                                @RequestParam(name = "num3") String num3,
                                                @RequestParam(name = "num4") String num4,
                                                @RequestParam(name = "num5") String num5) {

        List<String> numList = new ArrayList<>();
        numList.add(num1);
        numList.add(num2);
        numList.add(num3);
        numList.add(num4);
        numList.add(num5);

        int sum = 0;
        for(String num : numList) {

            try {
                sum += Integer.parseInt(num);
                log.info("num is number! [num={}]", num);

            } catch (NumberFormatException e) {
                sum = 0;
                log.info("num is NOT number..[num='{}']", num);

            } finally {
                log.info("finally");
            }
        }

        log.info("THE END! sum = {}", sum);

        return "SUM = " + sum;

    }

    @GetMapping(value = "getThrowsException")
    public @ResponseBody String getThrowsException(@RequestParam(value = "num1") String num1,
                                                   @RequestParam(value = "num2") String num2,
                                                   @RequestParam(value = "num3") String num3,
                                                   @RequestParam(value = "num4") String num4,
                                                   @RequestParam(value = "num5") String num5) {

        List<String> numList = new ArrayList<>();
        numList.add(num1);
        numList.add(num2);
        numList.add(num3);
        numList.add(num4);
        numList.add(num5);

        int sum = 0;
        for(String num : numList) {
            log.info("Is num number? [num = {}]", num);
            sum += Integer.parseInt(num);
        }

        return "SUM = " + sum;
    }
}
