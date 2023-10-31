
Automatic deployment to Heroku CI/CD Spring Boot + Maven + Github Actions

src/
└── main/
    └── java/
        └── com/
            └── healthscore/
                ├── medicaltests/
                │   ├── domain/
                │   │   ├── model/
                │   │   │   ├── MedicalTest.java
                │   │   │   ├── MedicalTestCategory.java
                │   │   │   └── ... (other domain entities & value objects)
                │   │   ├── repository/
                │   │   │   ├── MedicalTestRepository.java
                │   │   │   └── ... 
                │   │   └── service/
                │   │       ├── MedicalTestService.java
                │   │       └── ...
                │   └── application/
                │       └── api/
                │           ├── MedicalTestController.java
                │           └── ...
                ├── users/
                │   ├── domain/
                │   │   ├── model/
                │   │   │   ├── User.java
                │   │   │   ├── PatientTestReport.java
                │   │   │   └── ... 
                │   │   ├── repository/
                │   │   │   ├── UserRepository.java
                │   │   │   └── ...
                │   │   └── service/
                │   │       ├── UserService.java
                │   │       └── ...
                │   └── application/
                │       └── api/
                │           ├── UserController.java
                │           └── ...
                └── shared/
                    ├── infrastructure/
                    │   ├── db/
                    │   ├── logging/
                    │   └── ...
                    └── utils/

