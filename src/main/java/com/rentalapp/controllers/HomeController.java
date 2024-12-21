package com.rentalapp.controllers;

import com.rentalapp.models.Property;
import com.rentalapp.models.PropertyImage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping()
    public String homePage(Model model) {
        List<Property> properties = List.of(
                new Property(1, 1, "Французский бульвар, 60В", "Здається вперше, тільки порядній дівчині чи парі без дітей та тварин.\n" +
                        "Від власника, без комісійних . Ціна 650 у.о. до літа (без виселення ціна\n" +
                        "750 у.о.) Якісний ремонт.. всі меблі mdf(AGT), стільниці - камінь, двері і\n" +
                        "вся столярка - нат.дуб, техніка/ сан.техніка вбудованого монтажу -…", 9900, "Одесса", "доступно",
                        List.of(new PropertyImage(1, 1, "/photo/main-file/property1_1.png"),
                                new PropertyImage(2, 1, "/photo/main-file/property1_1.png"),
                                new PropertyImage(3, 1, "/photo/main-file/property1_1.png"),
                                new PropertyImage(4, 1, "/photo/main-file/property1_1.png"))),
                new Property(2, 2, "Аркадия, 12", "Здається вперше, тільки порядній дівчині чи парі без дітей та тварин.\n" +
                        "Від власника, без комісійних . Ціна 650 у.о. до літа (без виселення ціна\n" +
                        "750 у.о.) Якісний ремонт.. всі меблі mdf(AGT), стільниці - камінь, двері і\n" +
                        "вся столярка - нат.дуб, техніка/ сан.техніка вбудованого монтажу -…", 12000, "Одесса", "доступно",
                        List.of(new PropertyImage(3, 2, "/photo/main-file/property1_1.png"),
                                new PropertyImage(2, 1, "/photo/main-file/property1_1.png"),
                                new PropertyImage(3, 1, "/photo/main-file/property1_1.png"),
                                new PropertyImage(4, 1, "/photo/main-file/property1_1.png"))),
                new Property(3, 3, "ЖК Кадор, 34А", "Элитная двухкомнатная квартира.", 18000, "Одесса", "доступно",
                        List.of(new PropertyImage(4, 3, "/photo/main-file/property1_1.png"),
                                new PropertyImage(2, 1, "/photo/main-file/property1_1.png"),
                                new PropertyImage(3, 1, "/photo/main-file/property1_1.png"),
                                new PropertyImage(4, 1, "/photo/main-file/property1_1.png")))
        );

        model.addAttribute("properties", properties);

        return "index";
    }
    @GetMapping("/login")
    public String loginPage() {
        return "auth/login";
    }
    @GetMapping("/registration")
    public String registrationPage() {
        return "auth/registration";
    }
    @GetMapping("/error")
    public String errorPage(){
        return "errors/error404";
    }
    @GetMapping("/error2")
    public String errorPage2(){
        return "errors/error2";
    }
}