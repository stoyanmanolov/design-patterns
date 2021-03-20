package observer;

public class ExerciseSubscriber implements Observer {

	private String name;
	private Observable exercise;
	
	public ExerciseSubscriber(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if(this.exercise == null) {
			System.out.println(this.getName() + " has no exercise set");
			return;
		}
		String updatedExercise = this.exercise.getUpdate();
		System.out.println(this.getName() + " received an update from topic: " + updatedExercise);
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