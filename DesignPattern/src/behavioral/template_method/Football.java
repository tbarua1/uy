package behavioral.template_method;

public class Football extends Game {
	@Override
	   void endPlay() {
	      System.out.println("Football Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Football Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Football Game Started. Enjoy the game!");
	   }

//	@Override
//	void initialize() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	void startPlay() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	void endPlay() {
//		// TODO Auto-generated method stub
//
//	}

}
