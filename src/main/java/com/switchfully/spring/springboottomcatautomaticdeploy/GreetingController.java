package com.switchfully.spring.springboottomcatautomaticdeploy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
 public class GreetingController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
 
     @RequestMapping("/")
     @ResponseBody
     String getWelcomeMessage() {
         logger.trace("I'll update you on every heartbeat 💓");
         logger.debug("I'm taking a (sub)step 🚶");
         logger.info("Business as usual, I processed an action correctly");
         logger.warn("Warning ⚠ I do not trust this situation?!");
         logger.error("Help 🆘 Something is broken!");
         return "Hello World!";
     }
 
 }