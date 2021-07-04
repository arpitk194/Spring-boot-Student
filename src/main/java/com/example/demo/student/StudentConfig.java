package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.DECEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Arpit = new Student(
                    "Arpit",
                    "arpit@gmail.com",
                    LocalDate.of(1999, DECEMBER, 4)
            );

            Student Rahul = new Student(
                    "Rahul",
                    "rahul@gmail.com",
                    LocalDate.of(2004, DECEMBER, 27)
            );

            repository.saveAll(
                    List.of(Arpit, Rahul)
            );
        };
    }
}
