package com.example.demo20240507;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstAPI {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Say Hello!";
    }

    @RequestMapping("/hello/{name}/{times}")
    public String sayHelloNameTimes(@PathVariable String name, @PathVariable int times)
    {
        String str = "";

        for(int i=0; i<times; i++)
        {
            str += "Hello " +  name + " " + (i+1);
            str += "<BR>";
        }

        return str;

    }



}
