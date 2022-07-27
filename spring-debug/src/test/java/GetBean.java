import com.spring.mytest.A;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetBean {
	@Test
	public void test() {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("application.xml");
		A a = (A) context.getBean("a");
		System.out.println(a.getAge());
	}
}
