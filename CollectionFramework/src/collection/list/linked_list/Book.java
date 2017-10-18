package collection.list.linked_list;

public class Book {
	private int id;
	private String title;

	// Constructor
	public Book(int id, String title) {
		this.id = id;
		this.title = title;
	}

	@Override
	public String toString() {
		return id + ": " + title;
	}

	// Two book are equal if they have the same id
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Book)) {
			return false;
		}
		return this.id == ((Book) o).id;
	}

	// Consistent with equals(). Two objects which are equal have the same hash
	// code.
	@Override
	public int hashCode() {
		return id;
	}
}
