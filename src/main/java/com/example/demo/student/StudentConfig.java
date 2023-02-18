package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student mati = new Student(
                    "Mati",
                    "mfalcon@gmail.com",
                    LocalDate.of(1997, JANUARY, 14),
                    26
            );
            Student franco = new Student(
                    "Franco",
                    "franco.monsalvo24@gmail.com",
                    LocalDate.of(1999, JANUARY, 14),
                    24
            );
            repository.saveAll(
                    List.of(mati, franco)
            );
        };
    }
}
