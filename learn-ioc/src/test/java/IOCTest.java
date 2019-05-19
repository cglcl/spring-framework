import com.cgl.bean.Fox;
import com.cgl.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * ioc测试
 *
 * @author cgl
 * @date 2019/5/17 16:17
 */
public class IOCTest {

	@Test
	public void test() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		//绝对路径，默认已经加上了项目所在路径了
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/Spring.xml");
//		context.getBean("fox");
		System.out.println(context.getBean("myFactoryBean"));//user,主要看getObject里面返回的是啥，如果getType的class跟getObject返回的对象不一致，那么将会报错
		System.out.println(context.getBean("&myFactoryBean"));//MyFactoryBean
		((FileSystemXmlApplicationContext) context).close();
	}
}
