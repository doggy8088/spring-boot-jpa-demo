package com.duotify.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duotify.demo.domain.CourseRepository;
import com.duotify.demo.entity.CourseEntity;


/**
 * HomeController
 */
@RestController
@RequestMapping("/api/Home")
public class HomeController {
    private CourseRepository repository;

    public HomeController(CourseRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<String> getString() {
        Optional<String> String = Optional.empty();

        String = Optional.of("Hello World");

        if (String.isPresent()) {
            return ResponseEntity.ok(String.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("Courses")
    public ResponseEntity<List<CourseEntity>> getAllCourseEntity() {
        try {
            List<CourseEntity> items = new ArrayList<CourseEntity>();

            repository.findAll().forEach(items::add);

            return ResponseEntity.ok(items);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

}