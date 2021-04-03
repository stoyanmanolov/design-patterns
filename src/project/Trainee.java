package project;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable {
	private String name;
	private List<Observer> observers;
	private String exercise;
	
	public Trainee(String name) {
		this.setName(name);
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void watch(Observer exerciseObserver) {
		this.observers.add(exerciseObserver);
		exerciseObserver.setExercise(this);
	}
	
	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.getExercise();
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
		this.notifyObservers();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
