package observer;

public class ObserverMain {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		Observer observer1 = new ExerciseSubscriber("Observer 1");
		Observer observer2 = new ExerciseSubscriber("Observer 2");
		Observer observer3 = new ExerciseSubscriber("Observer 3");
		
		instructor.subscribe(observer1);
		instructor.subscribe(observer2);
		instructor.subscribe(observer3);
		
		instructor.setExercise("Push ups");
		instructor.setExercise("Pull ups");
	}

}