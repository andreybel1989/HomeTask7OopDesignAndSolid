

import java.util.Random;

public class Company {

    private Random random = new Random();


    private String name;

    private Publisher jobAgency;

    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        JobType jobType = getRandomJobType(); 
        Vacancy vacancy = new Vacancy(jobType, salary); 
        jobAgency.sendOffer(name, vacancy); 
    }
    
    private JobType getRandomJobType() {
        JobType[] jobTypes = JobType.values();
        return jobTypes[random.nextInt(jobTypes.length)];
    }
    
    
    

}
