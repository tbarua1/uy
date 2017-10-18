package comparator;

public class AddressBookEntry implements Comparable<AddressBookEntry> {
	 String name, address, phone;

	public AddressBookEntry(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(AddressBookEntry arg0) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(arg0.name);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return name;	}
	@Override
   public boolean equals(Object o) {
      if (!(o instanceof AddressBookEntry)) {
         return false;
      }
      return this.name.equalsIgnoreCase(((AddressBookEntry)o).name);
   }
 
   @Override
   public int hashCode() {
      return name.length();
   }

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((address == null) ? 0 : address.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		AddressBookEntry other = (AddressBookEntry) obj;
//		if (address == null) {
//			if (other.address != null)
//				return false;
//		} else if (!address.equals(other.address))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (phone == null) {
//			if (other.phone != null)
//				return false;
//		} else if (!phone.equals(other.phone))
//			return false;
//		return true;
//	}

}
