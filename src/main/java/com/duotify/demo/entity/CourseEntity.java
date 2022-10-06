package com.duotify.demo.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Course", schema = "dbo", catalog = "ContosoUniversity")
public class CourseEntity {
    @Id
    @Column(name = "CourseID", nullable = false)
    private int courseId;

    @Basic
    @Column(name = "Title", nullable = true, length = 50)
    private String title;

    @Basic
    @Column(name = "Credits", nullable = false)
    private int credits;
}
