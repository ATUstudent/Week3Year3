package com.week2year3;

import com.fasterxml.jackson.core.sym.Name;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/person")
public class RequestController {
@GetMapping("/hello")
    public String message()
{
    return "hello";
}
@GetMapping("/greet")
public String message2()
{
    return "greet";
}
@GetMapping("/greet/{name}")
    public String myname(@PathVariable String name)
{
    return "My name is " + name;
}



}
