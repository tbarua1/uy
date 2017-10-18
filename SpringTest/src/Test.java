import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
Drawing drawing=(Drawing) beanFactory.getBean("drawing");
drawing.draw();
	}

}
