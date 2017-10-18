

public class EventAttendee{

   private Long id;
   
   private String firstName;
   private String lastName;
   
	public void setId(Long id) {
		this.id = id;
	}
		
	public Long getId() {
		return id;
	}
    public void setFirstName(String n){
        firstName = n;
    }
    public String getFirstName(){
        return firstName;    
    }
    public void setLastName(String n){
        firstName = n;
    }
    public String getLastName(){
        return firstName;    
    }
}