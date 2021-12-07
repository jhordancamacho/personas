package com.gestionpersonas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primer")
public class ejemplo {

    @GetMapping("/hola")
    public String saludar(){
        return "hola";
    }
}
