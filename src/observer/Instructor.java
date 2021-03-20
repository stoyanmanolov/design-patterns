package observer;

import java.util.ArrayList;
import java.util.List;

public class Instructor implements Observable {

	private List<Observer> observers;
	private String exercise;
	
	public Instructor() {
		this.observers = new ArrayList<>();
	}

	public void setExercise(String newExercise) {
		this.exercise = newExercise;
		this.notifyObservers();
	}
	
	@Override
	public void subscribe(Observer exerciseSubscriber) {
		this.observers.add(exerciseSubscriber);
		exerciseSubscriber.setExercise(this);
	}

	@Override
	public void unsubscribe(Observer exerciseSubscriber) {
		this.observers.remove(exerciseSubscriber);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.exercise;
	}

}