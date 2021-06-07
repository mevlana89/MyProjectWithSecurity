package com.wildcodeschool.myprojectwithsecurity.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers... Assemble";
    }
    @GetMapping("/secret-bases")
    public List<String> secret()
    {
        List<String> wildSchoolList = new ArrayList<>();
        wildSchoolList.add("Biarritz");
        wildSchoolList.add("Bordeaux");
        wildSchoolList.add("La Loupe");
        wildSchoolList.add("Lille");
        wildSchoolList.add("Lyon");
        wildSchoolList.add("Marseille");
        wildSchoolList.add("Nantes");
        wildSchoolList.add("Worldwide");

        return wildSchoolList.stream().collect(Collectors.toList());
        //return (List<String>) Arrays.stream(wildSchoolList.toArray());
        //return Arrays.asList(wildSchoolList).stream().collect(Collectors.toList());
    }
}
