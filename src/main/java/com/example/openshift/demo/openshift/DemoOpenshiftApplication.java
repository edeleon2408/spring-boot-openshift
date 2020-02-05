package com.example.openshift.demo.openshift;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoOpenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOpenshiftApplication.class, args);
	}

        @GetMapping("/")
        public String hello(){
            return "Hola Erwin De León";
        }
        
        @GetMapping("/{input}")
        public String helloParam(@PathVariable String name){
            return "Hola "+name+" De León";
        }
}
