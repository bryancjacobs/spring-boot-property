package org.spring.boot.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bryan.jacobs on 9/21/14.
 */
@RestController
@RequestMapping("/message")
public class MessageRest {

    @Value("${message.value}")
    String message;

    @RequestMapping(method = RequestMethod.GET)
    public List<String> getAll() {
        return Arrays.asList(message, "my", "friends");

    }

}

