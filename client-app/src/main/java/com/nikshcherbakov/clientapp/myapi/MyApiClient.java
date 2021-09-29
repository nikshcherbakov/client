package com.nikshcherbakov.clientapp.myapi;

import com.nikshcherbakov.api.MyApi;
import com.nikshcherbakov.api.dto.ObjectDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MyApiClient", url = "http://localhost:8080", path = "/api")
public interface MyApiClient extends MyApi {

    @GetMapping(value = "/object")
    ObjectDto getObject();
}
