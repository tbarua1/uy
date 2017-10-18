package many_2_many;

import java.io.Serializable;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.GenerationType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
@Entity
@Table(name = "USERS")
public class User implements Serializable {
	 private long id;
	    private String username;
	    private String password;
	    private String email;
	 
	    private Set<Group> groups = new HashSet<Group>();
	 
	    public User(String username, String password, String email) {
	        this.username = username;
	        this.password = password;
	        this.email = email;
	    }
	 
	    public void addGroup(Group group) {
	        this.groups.add(group);
	    }
	 
	    @Id
	    @GeneratedValue
	    @Column(name = "USER_ID")
	    public long getId() {
	        return id;
	    }
	 
	    @ManyToMany(mappedBy = "users")
	    public Set<Group> getGroups() {
	        return groups;
	    }
}
