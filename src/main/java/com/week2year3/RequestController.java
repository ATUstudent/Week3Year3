package com.week2year3;

import com.fasterxml.jackson.core.sym.Name;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/person")
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

@GetMapping("/details")
    public String info(@RequestParam String name1, @RequestParam String age)
    {
        return"I am " + name1 + "My age is " + age;
    }
    @GetMapping("/Calculator")
    public String calculator(@RequestParam float num1, @RequestParam (defaultValue = "0.0") float num2, String maths)
    {
        float total = 0;
        switch(maths)
        {
            case"+":
                total = num1 + num2;
                break;

            case"-":
                total = num1 - num2;
                break;

            case"*":
                total = num1 * num2;
                break;

            case"/":
                if (num2 != 0) {
                    total = num1 / num2;
                } else {
                    return "Error";
                }
                break;
            default:
                return "Error: Invalid operation.";
        }
        return "Total is " + total;
    }

}
