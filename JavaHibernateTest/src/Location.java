public class Location{

   private Long id;
   
   private String name;
   private String address;
   
	public void setId(Long id) {
		this.id = id;
	}
		
	public Long getId() {
		return id;
	}
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;    
    }
    public void setAddress(String n){
        address = n;
    }
    public String getAddress(){
        return address;    
    }


}