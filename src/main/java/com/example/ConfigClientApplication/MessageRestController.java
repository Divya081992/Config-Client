package com.example.ConfigClientApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {
	
	@Value("${msg}")
    private String msg;
 
    @RequestMapping(value = "/msg", method=RequestMethod.GET)
    public String getMsg() {
        return this.msg;
    }

}
