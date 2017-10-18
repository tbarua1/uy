package one2one;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "ADDRESS")
@Access(value=AccessType.FIELD)
public class Address {

	@Id
	@Column(name = "emp_id", unique = true, nullable = false)
	@GeneratedValue(generator = "gen")
	//@GenericGenerator(name = "gen", strategy = "foreign", parameters = { @Parameter(name = "property", value = "employee") })
	private long id;

	@Column(name = "address_line1")
	private String addressLine1;

	@Column(name = "zipcode")
	private String zipcode;

	@Column(name = "city")
	private String city;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Employee1 employee;

        //Getter setter methods

	@Override
	public String toString() {
		return "AddressLine1= " + addressLine1 + ", City=" + city
				+ ", Zipcode=" + zipcode;
	}

    void setAddressLine1(String test_address1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCity(String test_City) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setZipcode(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setEmployee(Employee1 emp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
