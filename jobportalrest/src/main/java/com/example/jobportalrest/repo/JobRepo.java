package com.example.jobportalrest.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.jobportalrest.model.JobPost;

@Repository
public class JobRepo {
        
  List<JobPost> jobs=new ArrayList<>(Arrays.asList(

            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),


            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                    List.of("HTML", "CSS", "JavaScript", "React")),


            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                    List.of("Python", "Machine Learning", "Data Analysis")),


            new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                    List.of("Networking", "Cisco", "Routing", "Switching")),


            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                    List.of("iOS Development", "Android Development", "Mobile App"))
    ));


    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        // System.out.println(jobs);
    }

    public JobPost getjob(int id){

        for(JobPost job:jobs){
                if(job.getPostId()==id){
                        return job;
                }
        }

        return null;
    }


    public void updatejob(JobPost jobpost){

        for(JobPost jobpost1:jobs){
                if(jobpost1.getPostId() == jobpost.getPostId()){
                        jobpost1.setPostDesc(jobpost.getPostDesc());
                        jobpost1.setPostProfile(jobpost.getPostProfile());
                        jobpost1.setPostTechStack(jobpost.getPostTechStack());
                        jobpost1.setReqExperience(jobpost.getReqExperience());
                }
        }
    }

    public void deletejob(int id){
        for(JobPost jobpost:jobs){
                if(jobpost.getPostId()==id){
                        jobs.remove(jobpost);
                }
        }
    }

  
}


