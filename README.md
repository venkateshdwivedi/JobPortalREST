
# Job Portal REST API (Spring Boot - In-Memory Version)

This is a Spring Boot-based RESTful API that allows users to manage job postings. It demonstrates core backend concepts such as REST architecture, layered structure (Controller-Service-Repository), and in-memory data handling using Java collections. This version does not use any database or JPA.

## Features

1. RESTful API built using Spring Boot  
2. Manual repository implementation using Java List  
3. CRUD operations for job posts  
4. Preloaded sample job data stored in memory  
5. Tested using Postman

## Technologies Used

- Java 17 or later  
- Spring Boot  
- Spring Web  
- Maven  
- Postman

## API Endpoints

| Method | Endpoint        | Description                    |
|--------|------------------|--------------------------------|
| GET    | `/jobpost`       | Retrieve all job posts         |
| GET    | `/jobpost/{id}`  | Retrieve a job post by ID      |
| POST   | `/jobpost`       | Add a new job post             |
| PUT    | `/jobpost`       | Update an existing job post    |
| DELETE | `/jobpost/{id}`  | Delete a job post by ID        |

## Sample JSON for POST/PUT

```json
{
  "postId": 6,
  "postProfile": "DevOps Engineer",
  "postDesc": "Experience with CI/CD pipelines and Docker",
  "reqExperience": 3,
  "postTechStack": ["Docker", "Jenkins", "Kubernetes"]
}
```

## Notes

- Data is stored in memory and will be lost when the application is stopped or restarted.  
- No database or Spring Data JPA is used in this version.  
- Suitable for learning Spring Boot fundamentals and API development.

## Author

**Venkatesh Dwivedi**  

