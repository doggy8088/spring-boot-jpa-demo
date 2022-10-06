package com.duotify.demo.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.duotify.demo.entity.CourseEntity;

@Repository
public interface CourseRepository extends CrudRepository<CourseEntity, Integer> {

}
