package ru.feduncov.userservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "case-service", url = "${url.case-service}")
public interface CaseFeignService {

    @GetMapping
    String getRandomCase();
}
