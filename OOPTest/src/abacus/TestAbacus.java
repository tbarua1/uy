package abacus;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class TestAbacus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wire once = new Wire();
		once.setX1(1);
		once.setX5(5);
		System.out.println(once);
		System.out.println(once.getSum());
		Wire tens = new Wire();
		tens.setX1(1);
		tens.setX4(1);
		Wire hundreds = new Wire();
		hundreds.setX1(1);
		hundreds.setX2(1);
		hundreds.setX5(5);
		
		Wire tenth = new Wire();
		tenth.setX1(1);
		tenth.setX5(5);
		Wire hundredth = new Wire();
		hundredth.setX1(1);
		hundredth.setX5(5);
		ObjectMapper mapper=new ObjectMapper();
		try {
			System.out.println("JSON Testing");
			String s=mapper.writeValueAsString(hundreds);
			System.out.println(s);
			//String data="{"x1":1,"x2":1,"x3":0,"x4":0,"x5":5,"sum":7.0}";
		Wire testWire=mapper.readValue(s, Wire.class);
			System.out.println(testWire.getSum());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double result=once.getSum()*1+
				tens.getSum()*10+
				hundreds.getSum()*100+
				tenth.getSum()/10+
				hundredth.getSum()/100;
		//System.out.println(tenth.getSum()/10);
System.out.println(result);
	}

}
