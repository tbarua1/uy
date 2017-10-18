package many2one;

public class Address {
            private int id;
	   private String street;     
	   private String city;     
	   private String state;    
	   private String zipcode; 

	   public Address() {}
	   public Address(String street, String city, 
	                  String state, String zipcode) {
	      this.street = street; 
	      this.city = city; 
	      this.state = state; 
	      this.zipcode = zipcode; 
	   }
	   public int getId() {
	      return id;
	   }
	   public void setId( int id ) {
	      this.id = id;
	   }
	   public String getStreet() {
	      return street;
	   }
	   public void setStreet( String street ) {
	      this.street = street;
	   }
	   public String getCity() {
	      return city;
	   }
	   public void setCity( String city ) {
	      this.city = city;
	   }
	   public String getState() {
	      return state;
	   }
	   public void setState( String state ) {
	      this.state = state;
	   }
	   public String getZipcode() {
	      return zipcode;
	   }
	   public void setZipcode( String zipcode ) {
	      this.zipcode = zipcode;
	   }
}
