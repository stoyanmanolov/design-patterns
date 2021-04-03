package project;

public class ExerciseObserver implements Observer {
	private String name;
	private Observable exercise;
	
	public ExerciseObserver(String name) {
		this.setName(name);
	}
	
	@Override
	public void update() {
		
		if(exercise == null) {
			System.out.println(this.getName() + " isn't observing an exercise.");
			return;
		}
		
		String newExercise = exercise.getUpdate();
		System.out.println(this.getName() + " is now observing: " + newExercise);
		
	}
	
	@Override
	public void setExercise(Observable exercise) {
		this.exercise = exercise;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
