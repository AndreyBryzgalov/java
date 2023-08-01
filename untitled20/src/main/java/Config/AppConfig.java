package Config;

import Application.ApplicationServercDepartament;
import Application.ApplicationServic;
import Application.ApplicationService;
import Application.ApplicationServiceDepartament;
import Domen.DeportamentRepository;
import Domen.StaffRepositiry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("Dolmen")
public class AppConfig {
    @Bean("ap")
    ApplicationService ap(){
        return new ApplicationServic();
    }
    @Bean("de")
    ApplicationServiceDepartament de(){
        return new ApplicationServercDepartament();
    }
    @Bean
    StaffRepositiry st(){
        return new StaffRepositiry();
    }
    @Bean
    DeportamentRepository dep(){
        return new DeportamentRepository();
    }
}
