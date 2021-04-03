package project;

public interface Observable {
	void watch(Observer exerciseObserver);
	void notifyObservers();
	String getUpdate();
}
