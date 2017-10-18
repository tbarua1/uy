import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestThrdIntrpt1
{
public static void main(String[] args)
{
JFrame jf=new JFrame("IUBAT");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setSize(new Dimension(500, 500));
jf.add(createAnimationContainer());
jf.setLocationRelativeTo(jf);
jf.setVisible(true);
}
private static Component createAnimationContainer(){
JPanel jp=new JPanel(new BorderLayout());
Animationexample ax=new Animationexample();
jp.add(ax);
JButton jb=new JButton("reverse");
jp.add(jb,BorderLayout.SOUTH);
jb.addActionListener(e->{
ax.getThread().interrupt(); 
});
return jp;
}
private static class Animationexample extends JComponent
{
	private int angle=0;
	boolean clockwise=true;
	private Thread thread;
public Animationexample(){
drawsomething();
}
private void drawsomething(){
thread=new Thread(()->{
while(true){
	angle++;
	if(angle>=360)
	{
	angle=0; 
	}
	if(thread.isInterrupted())
	{
	clockwise=!clockwise;
	}
	repaint();
	try {
	TimeUnit.MILLISECONDS.sleep(10);
	} catch (InterruptedException e){
	clockwise=!clockwise;
	}}
}); 
thread.start();
}
public void paint(Graphics g){
g.setColor(Color.BLUE);
g.fillArc(10, 10, 300, 300, clockwise?-angle:angle, 30);
}
public Thread getThread(){
return thread;
}}}

