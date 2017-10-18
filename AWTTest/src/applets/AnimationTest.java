package applets;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class AnimationTest extends Applet{
	Image picture;  
	  
	  public void init() {  
	    picture =getImage(getDocumentBase(),"test.gif");  
	  }  
	    
	  public void paint(Graphics g) {  
	    for(int i=0;i<500;i++){  
	      g.drawImage(picture, i,30, this);  
	  
	      try{Thread.sleep(100);}catch(Exception e){}  
	    }  
	  }  
}
