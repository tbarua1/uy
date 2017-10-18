package intercepter;

import java.io.Serializable;
import java.util.Iterator;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import annotation_environment.Employee;

public class MyInterceptor extends EmptyInterceptor{

	private static final long serialVersionUID = 1L;
	 private int updates;
	   private int creates;
	   private int loads;
	   @Override
	public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		// TODO Auto-generated method stub
		super.onDelete(entity, id, state, propertyNames, types);
	}
	   @Override
	public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState,
			String[] propertyNames, Type[] types) {
		   if ( entity instanceof Employee ) {
		          System.out.println("Update Operation");
		          return true; 
		       }
		       return false;	}
	   @Override
	public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		// TODO Auto-generated method stub
		return true;
	}
	   @Override
	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		// TODO Auto-generated method stub
		   if ( entity instanceof Employee ) {
		          System.out.println("Create Operation");
		          return true; 
		       }
		       return false;
	}
	@Override
	public void preFlush(Iterator entities) {
		// TODO Auto-generated method stub
		 System.out.println("preFlush");
	}
	@Override
	public void postFlush(Iterator entities) {
		// TODO Auto-generated method stub
		 System.out.println("postFlush");
	}
}
