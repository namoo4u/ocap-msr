package io.swagger;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@SpringBootApplication
//@EnableSwagger2
//@ComponentScan(basePackages = { "io.swagger", "ocap.msr.api" })

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "io.swagger", "ocap.msr.api", "ocap.msr.service", "ocap.msr.util" })
@EnableJpaRepositories("ocap.msr.repository")
@EntityScan("ocap.msr.entity")
public class Swagger2SpringBoot implements CommandLineRunner {

    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }
    @Bean
    public ModelMapper modelMapper() {
    		return new ModelMapper(); 
    }
    public static void main(String[] args) throws Exception {
        new SpringApplication(Swagger2SpringBoot.class).run(args);
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }
}
