package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "actor_01_default")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a01_pk")
    private Long a01Pk; // Primary Key

    @Column(name = "a01_id",nullable = false, unique = true, length = 100)
    private String a01Id; // User ID

    @Column(name = "a01_pw",nullable = false, length = 100)
    private String a01Pw; // User Password

    @Column(name = "a01_status",nullable = false, length = 50)
    private String a01Status; // User Status

    @Column(name = "a01_type",nullable = false, length = 20)
    private String a01Type; // User Type (e.g., admin, user)

    @Column(name = "a01_name",nullable = false, length = 100)
    private String a01Name; // User Name

    @Column(name = "a01_mobile",nullable = false, length = 100)
    private String a01Mobile; // User Contact

    @Lob
    @Column(name = "a01_memo")
    private String a01Memo; // Additional User Information

    @Column(name = "a01_date",nullable = false)
    private LocalDateTime a01Date = LocalDateTime.now(); // Account Creation Date

    // Getter and Setter Methods

    public Long getA01Pk() {
        return a01Pk;
    }

    public void setA01Pk(Long a01Pk) {
        this.a01Pk = a01Pk;
    }

    public String getA01Id() {
        return a01Id;
    }

    public void setA01Id(String a01Id) {
        this.a01Id = a01Id;
    }

    public String getA01Pw() {
        return a01Pw;
    }

    public void setA01Pw(String a01Pw) {
        this.a01Pw = a01Pw;
    }

    public String getA01Status() {
        return a01Status;
    }

    public void setA01Status(String a01Status) {
        this.a01Status = a01Status;
    }

    public String getA01Type() {
        return a01Type;
    }

    public void setA01Type(String a01Type) {
        this.a01Type = a01Type;
    }

    public String getA01Name() {
        return a01Name;
    }

    public void setA01Name(String a01Name) {
        this.a01Name = a01Name;
    }

    public String getA01Mobile() {
        return a01Mobile;
    }

    public void setA01Mobile(String a01Mobile) {
        this.a01Mobile = a01Mobile;
    }

    public String getA01Memo() {
        return a01Memo;
    }

    public void setA01Memo(String a01Memo) {
        this.a01Memo = a01Memo;
    }

    public LocalDateTime getA01Date() {
        return a01Date;
    }

    public void setA01Date(LocalDateTime a01Date) {
        this.a01Date = a01Date;
    }
}
