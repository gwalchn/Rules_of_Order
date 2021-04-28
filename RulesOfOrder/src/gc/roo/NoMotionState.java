package gc.roo;

public class NoMotionState implements MotionState {
	private Motion motion;

	public NoMotionState(Motion motion)  {
		this.motion = motion;
	}
	
	@Override
	public void makeMotion() {
		System.out.println("A new motion was maked.");
		motion.setState(motion.changeToMotionMakedState());
	}

	@Override
	public void secondMotion() {
		// TODO Auto-generated method stub

	}

	@Override
	public void StateQuestionOnMotion() {
		// TODO Auto-generated method stub

	}

	@Override
	public void debate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void putTheQuestion() {
		// TODO Auto-generated method stub

	}

	@Override
	public void announceTheResult() {
		// TODO Auto-generated method stub

	}

}
