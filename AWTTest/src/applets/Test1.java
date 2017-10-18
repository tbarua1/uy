package applets;

import java.applet.Applet;
import java.awt.Graphics;

public class Test1 extends Applet{
	public void paint(Graphics g){  
		g.drawString("welcome to applet",150,150);  
		}  
}
/* 
<applet code="First.class" width="300" height="300"> 
</applet> 

c:\>javac First.java
c:\>appletviewer First.java
*/  