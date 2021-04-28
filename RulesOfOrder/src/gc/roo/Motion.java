package gc.roo;

public interface Motion { 
	
	
	public void setState(MotionState state);
	
	public NoMotionState changeToNoMotionState();
	public MotionMakedState changeToMotionMakedState();

}
