package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    private String description;

    @ManyToMany(mappedBy = "skills", fetch = FetchType.EAGER) //getting an error whenever I add in mappedBy="skills"
    private final List<Job> jobs = new ArrayList<>();

    public List<Job> getJobs() {
        return jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addJob(Job jobs){
        this.jobs.add(jobs);
    }
}
