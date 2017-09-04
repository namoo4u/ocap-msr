package ocap.msr;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//@ComponentScan(basePackages = { "io.swagger", "ocap.msr.api", "ocap.msr.service" })
//@EnableJpaRepositories("ocap.msr.repository")
//@EntityScan("ocap.msr.entity")
public class MsrApplication  {

    public static void main(String[] args) throws Exception {
        new SpringApplication(MsrApplication.class).run(args);
    }
    
    @Bean
    public ModelMapper modelMapper() {
    		return new ModelMapper(); 
    }
}
