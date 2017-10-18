package structural.adapter.one;

public class Mp4Player implements AdvancedMediaPlayer {
	@Override
	   public void playVlc(String fileName) {
	      //do nothing
	   }

	   @Override
	   public void playMp4(String fileName) {
	      System.out.println("Playing mp4 file. Name: "+ fileName);		
	   }

//	@Override
//	public void playVlc(String fileName) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void playMp4(String fileName) {
//		// TODO Auto-generated method stub
//
//	}

}
