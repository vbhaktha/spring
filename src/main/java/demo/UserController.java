package demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController

public class UserController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    private String authUrl = "https://i.aol.com/oauth2/token";
       

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
//    @RequestMapping("/register")
//    public String register (@RequestParam(value="login") String login, 
//    		@RequestParam(value="password")String password){
//    		Customer c = new Customer("firstName", "lastName");
//    		repository.save(c);
//    		repository.save(new Customer ("Rahul", "Jayaraman"));
//    		repository.save(new Customer("Ram", "Jayaraman"));
//    		
//				return "abc";
//    	
//    }
    

    	
    }
