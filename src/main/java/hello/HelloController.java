package hello;

/**
 * Created by amitsethi on 17/10/2018.
 */

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pojos.Greeting;

@RestController
public class HelloController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestBody GreetingRequest greetingRequest) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, greetingRequest.getName()));
    }
}