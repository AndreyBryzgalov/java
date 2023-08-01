package Presentation;

import Application.ApplicationServic;
import Application.ApplicationServiceDepartament;
import Config.AppConfig;
import Domen.Deportament;
import Domen.Staff;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        Staff set = new Staff();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationServic staff = (ApplicationServic) context.getBean("ap");
        ApplicationServiceDepartament departament = (ApplicationServiceDepartament) context.getBean("de");
        staff.CreateEntities(set);
        staff.SearchEntities(1);
    }
}