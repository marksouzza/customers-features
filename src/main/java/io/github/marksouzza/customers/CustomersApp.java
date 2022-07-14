package io.github.marksouzza.customers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomersApp {

//    @Bean
//    public CommandLineRunner run(@Autowired ClienteRepository repository) {
//        return args -> {
//          Cliente cliente = Cliente.builder().cpf("01234567891").nome("Maike").build();
//          repository.save(cliente);
//        };
//    }

    public static void main(String[] args) {
        SpringApplication.run(CustomersApp.class, args);

    }
}
