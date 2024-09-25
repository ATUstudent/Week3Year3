package com.week2year3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/person")
public class RequestController {
@GetMapping("hello")
    public String message()
{
    return "hello";
}

}
