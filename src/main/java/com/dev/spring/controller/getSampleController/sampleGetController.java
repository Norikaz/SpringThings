package com.dev.spring.controller.getSampleController;

import com.dev.spring.controller.API_Endpoints;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(API_Endpoints.SAMPLE_END_POINT)
public class sampleGetController {

    @GetMapping
    public String getSampleRequest() {
        return "Hello";
    }
}
