import com.jin.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.jin.*")
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acp =new AnnotationConfigApplicationContext();
		UserService bean = acp.getBean(UserService.class);
		bean.eat("food");
	}

}

