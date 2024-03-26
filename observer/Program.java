

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре,
     *  поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например,
     *  добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     *  *** воспользоваться методом removeObserver для удаления соискателя после получения работы
     * @param args
     */
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 120000);
        Company yandex = new Company("Yandex", publisher, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Student student = new Student("Student #1", JobType.DEVELOPER, publisher);
        Master master1 = new Master("Master #1", JobType.ENGINEER, publisher);
        Master master2 = new Master("Master #2", JobType.DOCTOR, publisher);
        Master master3 = new Master("Master #3", JobType.TEACHER, publisher);
        Master master4 = new Master("Master #4", JobType.TEACHER, publisher);
        Worker worker1 = new Worker("Worker #1", JobType.DEVELOPER, publisher);

        publisher.registerObserver(student);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(master3);
        publisher.registerObserver(master4);
        publisher.registerObserver(worker1);




        for (int i = 0; i < 100; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }

    }

}
