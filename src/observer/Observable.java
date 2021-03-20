package observer;

public interface Observable {
	void subscribe(Observer exerciseSubcriber);
	void unsubscribe(Observer exerciseSubscriber);
	void notifyObservers();
	String getUpdate();
}