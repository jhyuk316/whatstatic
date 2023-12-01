package com.tutorial.whatstatic.controller;

import com.tutorial.whatstatic.util.CountUtil;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ApiController {

    @PostConstruct
    private void init() {
        CountUtil.setCount(100);
    }

    @Scheduled(fixedDelay = 5_000, initialDelay = 1_000)
    @GetMapping("/count")
    public ResponseEntity<String> getCount() {

        log.info("count : {}", CountUtil.getCount());

        log.error("error");

        log.info("count : {}", CountUtil.getCount());

        return ResponseEntity.ok().body(String.valueOf(CountUtil.getCount()));
    }

}
