package co.edu.escuelaing.sparkd.microspring;


public class HelloController {

    @RequestMapping("/hola")
    public static String hola(){
        return "Greetings form Spring Boot!";
    }
}
