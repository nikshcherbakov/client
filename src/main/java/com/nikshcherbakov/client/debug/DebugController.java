package com.nikshcherbakov.client.debug;

import com.nikshcherbakov.api.dto.ObjectDto;
import com.nikshcherbakov.client.myapi.MyApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/debug")
public class DebugController {

    private final MyApiClient myApiClient;

    @GetMapping("/test")
    public ResponseEntity<ObjectDto> requestObject() {
        ObjectDto object = myApiClient.getObject();
        return new ResponseEntity<>(object, HttpStatus.OK);
    }

}
