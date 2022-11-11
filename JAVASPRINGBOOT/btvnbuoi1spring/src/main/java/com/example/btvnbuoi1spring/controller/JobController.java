package com.example.btvnbuoi1spring.controller;

import com.example.btvnbuoi1spring.model.Job;
import com.example.btvnbuoi1spring.request.UpsertJobRequest;
import com.example.btvnbuoi1spring.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping("jobs")
    public List<Job> getJobs(){
        return jobService.getJobs();
    }

    @GetMapping("jobs/{id}")
    public Job getJobById(@PathVariable int id){
        return jobService.getJobById(id);
    }

    @GetMapping("jobs/random")
    public Job getRandomJob (){
        return jobService.getRandomJob();
    }

    @GetMapping("jobs/sortByDescendingMaxSalary")
    public Job getJobWithSorting(@RequestParam(value = "id", defaultValue = "maxSalary") String field,
                                 @RequestParam(value = "direction", defaultValue = "DESC") String direction){
        return (Job) jobService.sortByDescendingMaxSalary(field, direction);
    }

    @PostMapping("jobs")
    public Job createJob(@RequestBody UpsertJobRequest request){
        return jobService.createJob(request);
    }

    @PutMapping("jobs/{id}")
    public Job updateJobById(@PathVariable int id, @RequestBody UpsertJobRequest request){
        return jobService.updateJobById(id, request);
    }
    @DeleteMapping("jobs/{id}")
    public void deleteJobById (@PathVariable int id){
        jobService.deleteJobById(id);
    }

}
