   package structural.proxy;



public class ProxyImage implements Image {
	 private RealImage realImage;
	   private String fileName;

	   public ProxyImage(String fileName){
	      this.fileName = fileName;
	   }

//	   @Override
//	   public void display() {
//	      if(realImage == null){
//	         realImage = new RealImage(fileName);
//	      }
//	      realImage.display();
//	   }
	/*private URL url;

	public ProxyImage(URL url){
		 this.url = url; 
	}

	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		System.out.println("i am from Proxy Image");
		 RealImage real = new RealImage(url); 
		 real.displayImage();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
*/

	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		 if(realImage == null){
			 System.out.println("realImage null");
	         realImage = new RealImage(fileName);
	      }
		 System.out.println("Going to Display ProxyImage");
	      realImage.displayImage();
	}
}
