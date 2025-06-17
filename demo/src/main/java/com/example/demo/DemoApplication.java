@RestController
public class DemoApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello from Java Spring Boot with Gradle!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
