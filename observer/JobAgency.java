
import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, Vacancy vacancy) {

        Collection<Observer> copyObservers = new ArrayList<>(observers);

        for (Observer observer : copyObservers) {
            observer.receiveOffer(companyName, vacancy);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}
