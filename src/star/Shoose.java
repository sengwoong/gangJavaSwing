package star;

import java.util.ArrayList;

public class Shoose {
	   private ArrayList<Observer> observers = new ArrayList<>();

	    public void addObserver(Observer observer) {
	        observers.add(observer);
	    }

	    public void removeObserver(Observer observer) {
	        observers.remove(observer);
	    }

	    public void notifyObservers(int score) {
	        for (Observer observer : observers) {
	            observer.update(score);
	        }
	    }

	    public void receiveScore(int score) {
	        System.out.println("별점:" + score+"정보");
	        notifyObservers(score);
	    }
}
