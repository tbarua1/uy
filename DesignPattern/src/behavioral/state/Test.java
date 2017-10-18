package behavioral.state;

public class Test {
	/*
	 * State design pattern is used when an Object change it’s behavior based on
	 * it’s internal state.
	 * 
	 * If we have to change the behavior of an object based on it’s state, we
	 * can have a state variable in the Object and use if-else condition block
	 * to perform different actions based on the state. State pattern is used to
	 * provide a systematic and lose-coupled way to achieve this through Context
	 * and State implementations.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}

}
/*
 * In State pattern a class behavior changes based on its state. This type of
 * design pattern comes under behavior pattern.
 * 
 * In State pattern, we create objects which represent various states and a
 * context object whose behavior varies as its state object changes.
 */
