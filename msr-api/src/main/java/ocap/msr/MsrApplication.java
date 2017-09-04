package ocap.msr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
}
