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
@Table(name = "GROUPS")
public class Group implements Serializable{
	 private long id;
	    private String name;
	 
	    private Set<User> users = new HashSet<User>();
	 
	    public Group(String name) {
	        this.name = name;
	    }
	 
	    public void addUser(User user) {
	        this.users.add(user);
	    }
	 
	    @Id
	    @GeneratedValue
	    @Column(name = "GROUP_ID")
	    public long getId() {
	        return id;
	    }
	 
	    @ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable(
	            name = "USERS_GROUPS",
	            joinColumns = @JoinColumn(name = "GROUP_ID"),
	            inverseJoinColumns = @JoinColumn(name = "USER_ID")
	    )
	    public Set<User> getUsers() {
	        return users;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setId(long id) {
			this.id = id;
		}

		public void setUsers(Set<User> users) {
			this.users = users;
		}
	    
}
