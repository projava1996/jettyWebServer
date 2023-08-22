package com.projava.jetty.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/initialProject")
@Slf4j
public class BaseController {

    @PostMapping
    public Mono<String> initialProject() {
        return Mono.just("Hello world");
    }
}
