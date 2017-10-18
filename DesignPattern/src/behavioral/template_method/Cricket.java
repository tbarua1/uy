package behavioral.template_method;

public class Cricket extends Game {
	@Override
	void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}

	// @Override
	// void initialize() {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// @Override
	// void startPlay() {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// @Override
	// void endPlay() {
	// // TODO Auto-generated method stub
	//
	// }

}
