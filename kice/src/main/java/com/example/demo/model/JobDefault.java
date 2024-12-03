package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "job_02_default")
public class JobDefault {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job02_pk")
    private Long jobId;

    @Column(name = "job02_kind")
    private String jobKind;

    @Column(name = "job02_title", nullable = false)
    private String jobTitle; // School name

    @Column(name = "job02_client")
    private String jobClient;

    @Column(name = "job02_client_tel")
    private String jobClientTel;

    @Column(name = "job02_client_manager")
    private String jobClientManager;

    @Column(name = "job02_client_manager_phone")
    private String jobClientManagerPhone;

    @Column(name = "job02_client_address")
    private String jobClientAddress;

    @Column(name = "job02_client_address2")
    private String jobClientAddress2;

    @Column(name = "job02_contents")
    private String jobContents;

    @Column(name = "job02_date", nullable = false)
    private LocalDateTime jobDate;

    // Getters and Setters
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobKind() {
        return jobKind;
    }

    public void setJobKind(String jobKind) {
        this.jobKind = jobKind;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobClient() {
        return jobClient;
    }

    public void setJobClient(String jobClient) {
        this.jobClient = jobClient;
    }

    public String getJobClientTel() {
        return jobClientTel;
    }

    public void setJobClientTel(String jobClientTel) {
        this.jobClientTel = jobClientTel;
    }

    public String getJobClientManager() {
        return jobClientManager;
    }

    public void setJobClientManager(String jobClientManager) {
        this.jobClientManager = jobClientManager;
    }

    public String getJobClientManagerPhone() {
        return jobClientManagerPhone;
    }

    public void setJobClientManagerPhone(String jobClientManagerPhone) {
        this.jobClientManagerPhone = jobClientManagerPhone;
    }

    public String getJobClientAddress() {
        return jobClientAddress;
    }

    public void setJobClientAddress(String jobClientAddress) {
        this.jobClientAddress = jobClientAddress;
    }

    public String getJobClientAddress2() {
        return jobClientAddress2;
    }

    public void setJobClientAddress2(String jobClientAddress2) {
        this.jobClientAddress2 = jobClientAddress2;
    }

    public String getJobContents() {
        return jobContents;
    }

    public void setJobContents(String jobContents) {
        this.jobContents = jobContents;
    }

    public LocalDateTime getJobDate() {
        return jobDate;
    }

    public void setJobDate(LocalDateTime jobDate) {
        this.jobDate = jobDate;
    }
}
