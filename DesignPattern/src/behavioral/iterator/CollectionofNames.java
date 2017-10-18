package behavioral.iterator;

public class CollectionofNames implements Container {
	public String name[]={"Tarkeshwar Barua", "Tarun Rathi","Manju","Prabhat Jonathan","Hemanto"};   
    
	@Override  
	    public Iterator getIterator() {  
	        return new CollectionofNamesIterate() ;  
	    }  
	    private class CollectionofNamesIterate implements Iterator{  
	        int i;  
	        @Override  
	        public boolean hasNext() {  
	            if (i<name.length){  
	                return true;  
	            }  
	            return false;  
	        }  
	        @Override  
	        public String next() {  
	            if(this.hasNext()){  
	                return name[i++];  
	            }  
	            return null;      
	        }  
	    }  
	}  

//	@Override
//	public Iterator getIterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}


