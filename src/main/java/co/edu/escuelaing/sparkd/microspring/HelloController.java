package co.edu.escuelaing.sparkd.microspring;


public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Greetings form Spring Boot!";
    }
}
