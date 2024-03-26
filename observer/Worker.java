public class Worker implements Observer {
    private String name;
    private int salary;
    private JobType vacancyJobType; 
    private Publisher jobAgency;

    public Worker(String name, JobType vacancyJobType, Publisher jobAgency) {
        this.name = name;
        this.vacancyJobType = vacancyJobType; 
        this.jobAgency = jobAgency;
        salary = 20000;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        int vacancySalary = vacancy.getSalary();
        JobType receivedVacancyJobType = vacancy.getJobType(); 

        
        if (receivedVacancyJobType == vacancyJobType) {
            if (this.salary <= vacancySalary) {
                System.out.printf(
                        "Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d; тип вакансии: %s)\n",
                        name, companyName, vacancySalary, receivedVacancyJobType);
                this.salary = vacancySalary;
                jobAgency.removeObserver(this);

            } else {
                System.out.printf(
                        "Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d; тип вакансии: %s)\n",
                        name, companyName, vacancySalary, receivedVacancyJobType);
            }
        }
    }

}
