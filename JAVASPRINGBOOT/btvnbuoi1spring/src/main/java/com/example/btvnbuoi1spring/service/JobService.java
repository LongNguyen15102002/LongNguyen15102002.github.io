package com.example.btvnbuoi1spring.service;

import com.example.btvnbuoi1spring.model.Job;
import com.example.btvnbuoi1spring.request.UpsertJobRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

@Service
public class JobService {
    private List<Job> jobs;

    public JobService(){
        jobs = new ArrayList<>();
        jobs.add(new Job(1, "title1", "Des1", "location1", 1000, 3000, "cp1@gmail.com"));
        jobs.add(new Job(2, "title2", "Des2", "location2", 1500, 5000, "cp1@gmail.com"));
        jobs.add(new Job(3, "title3", "Des3", "location3", 2000, 7000, "cp1@gmail.com"));
        jobs.add(new Job(4, "title4", "Des4", "location4", 2500, 9000, "cp1@gmail.com"));
        jobs.add(new Job(5, "title5", "Des5", "location5", 3000, 11000, "cp1@gmail.com"));
    }

    public List<Job> getJobs(){
        return jobs;
    }

    public Job getJobById(int id){
        for (Job job : jobs){
            if(job.getId() == id) {
                return job;
            }
        }
        return null;
    }

    public Job getRandomJob(){
        int random = new Random().nextInt(jobs.size());
        return jobs.get(random);
    }

    public List<Job> sortByDescendingMaxSalary(String field, String direction) {
        if (field.equalsIgnoreCase("maxSalary")) {
            if (direction.equalsIgnoreCase("ASC"))
                return jobs.stream().sorted(Comparator.comparing(Job::getMaxSalary)).toList();
            else
                return jobs.stream().sorted(Comparator.comparing(Job::getMaxSalary).reversed()).toList();
        } else return null;

    }
    public Job createJob(UpsertJobRequest request){
        Random rd = new Random();
        int id = rd.nextInt(100);

        Job job = new Job(
                id,
                request.getTitle(),
                request.getDescription(),
                request.getLocation(),
                request.getMinSalary(),
                request.getMaxSalary(),
                request.getEmail());
        jobs.add(job);
        return job;
    }

    public Job updateJobById(int id, UpsertJobRequest request){
        for (Job job : jobs){
            if(job.getId() == id){
                job.setTitle(request.getTitle());
                job.setDescription(request.getDescription());
                job.setLocation(request.getLocation());
                job.setMinSalary(request.getMinSalary());
                job.setMaxSalary(request.getMaxSalary());
                job.setEmail(request.getEmail());
                return job;
            }
        }
        return null;
    }

    public void deleteJobById(int id){
        jobs.removeIf(job -> job.getId() == id);
    }
}
