package exception;

import java.net.MalformedURLException;
import java.net.URL;

public class MultipleCatchBlocks {
	public static void main(String a[]){
		MultipleCatchBlocks mmcb = new MultipleCatchBlocks();
        mmcb.execute(1);
        mmcb.execute(2);
    }
     
    public void execute(int i){
        try{
            if(i == 1){
                getIntValue("7u");
            } else {
                getUrlObj("www.google.com");
            }
        } catch (NumberFormatException nfe){
            System.out.println("Inside NumberFormatException... "+nfe.getMessage());
        } catch (MalformedURLException mue){
            System.out.println("Inside MalformedURLException... "+mue.getMessage());
        } catch (Exception ex){
            System.out.println("Inside Exception... "+ex.getMessage());
        }
    }
    public int getIntValue(String num){
        return Integer.parseInt(num);
    }
     
    public URL getUrlObj(String urlStr) throws MalformedURLException{
        return new URL(urlStr);
    }}
