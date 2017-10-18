package databse_connect;

public class Furniture {
int id;
String type;

public Furniture(String type) {
	super();
	this.type = type;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Furniture [id=" + id + ", type=" + type + "]";
}

}
