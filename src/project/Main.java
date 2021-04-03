package project;

public class Main {

	public static void main(String[] args) {
	Instructor instructor = new Instructor("John");
	Trainee trainee = new Trainee("Sam");
	ExerciseObserver observerOne = new ExerciseObserver("Observer 1");
	ExerciseObserver observerTwo = new ExerciseObserver("Observer 2");
	ExerciseObserver observerThree = new ExerciseObserver("Observer 3");
	
	instructor.setTrainee(trainee);
	
	trainee.watch(observerOne);
	trainee.watch(observerTwo);
	trainee.watch(observerThree);
	
	instructor.setCommand(new StandUpCommand(trainee));
	instructor.setCommand(new LieDownCommand(trainee));
	
	}
}
