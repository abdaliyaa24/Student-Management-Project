package com.example.Student.Management.System.entity;


import javax.persistence.*;

@Entity
@Table(name= "students")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "first_name", nullable = false)
    private String firstname;
    @Column(name= "last_name")
    private String lastname;
    @Column(name= "email")
    private String email;

    public Student() {

    }

    public Long getId() {
        return id;
    }

    public Student(String firstname, String lastname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
