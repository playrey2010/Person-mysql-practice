package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long courseid;

    //    setting the table name manually for mysql
    @Column(name="coursename")
    private String name;
    // constructors
    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }
    // getters and setters
    public long getCourseid() {
        return courseid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
