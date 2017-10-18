package eventlistener;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelwithAction extends Frame implements ActionListener {
	TextField tf;
	Label l;
	Button b;

	public LabelwithAction() {
		tf = new TextField();
		tf.setBounds(50, 50, 150, 20);
		l = new Label();
		l.setBounds(50, 100, 250, 20);
		b = new Button("Find IP");
		b.setBounds(50, 150, 60, 30);
		b.addActionListener(this);
		add(b);
		add(tf);
		add(l);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			l.setText("IP of " + host + " is: " + ip);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void main(String[] args) {
		new LabelwithAction();
	}

}
