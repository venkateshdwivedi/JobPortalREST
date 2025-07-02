package com.example.jobportalrest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobportalrest.model.JobPost;
import com.example.jobportalrest.repo.JobRepo;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;


    public void addJob(JobPost jobpost){
        repo.addJob(jobpost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }


    public JobPost getjob(int id){
       return repo.getjob(id);
    }

    public void updatejob(JobPost jobpost){
        repo.updatejob(jobpost);
    }

    public void deletejob(int id){
        repo.deletejob(id);
    }
   
}
