public class Vacancy {
    private JobType jobType;
    private int salary;

    public Vacancy(JobType jobType, int salary) {
        this.jobType = jobType;
        this.salary = salary;
    }

    public JobType getJobType() {
        return jobType;
    }

    public int getSalary() {
        return salary;
    }
}
