Job Portal REST API (In-Memory Version without Database)

This is a Spring Boot-based RESTful API that allows users to manage job postings. 
It demonstrates key backend development concepts including REST architecture, layered structure (Controller-Service-Repository), and in-memory data storage using Java collections. 
This version does not use any database or JPA. Instead, job data is stored in a Java List within the repository class. 
It is suitable for learning how to structure and build RESTful APIs with Spring Boot.

Features

1. RESTful API built using Spring Boot
2. Manual repository implementation with in-memory data
3. CRUD operations for job posts:
   - Create a new job post
   - Retrieve all job posts or a specific job post by ID
   - Update an existing job post
   - Delete a job post
4. Preloaded sample data is initialized in the repository
5. Tested using Postman

Technologies Used

1. Java 17 or later
2. Spring Boot
3. Spring Web
4. Maven
5. Postman


API Endpoints

1. GET /jobpost – Retrieve all job posts
2. GET /jobpost/{id} – Retrieve a job post by ID
3. POST /jobpost – Add a new job post
4. PUT /jobpost – Update an existing job post
5. DELETE /jobpost/{id} – Delete a job post by ID

Sample JSON for POST/PUT

{
  "postId": 6,
  "postProfile": "DevOps Engineer",
  "postDesc": "Experience with CI/CD pipelines and Docker",
  "reqExperience": 3,
  "postTechStack": ["Docker", "Jenkins", "Kubernetes"]
}

Notes

1. Data is stored in-memory and will be lost when the application stops or restarts.
2. No database or Spring Data JPA is used in this version.
3. This project is intended for learning and demonstration purposes.


Author
Venkatesh Dwivedi

