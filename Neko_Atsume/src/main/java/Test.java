import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.appliweb.Neko_Atsume.entities.Astuce;
import com.appliweb.Neko_Atsume.metier.iAdminMetier;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
iAdminMetier metier= (iAdminMetier) context.getBean("metier");
metier.addAstuce(new Astuce(null, null, "lollll", 50), 2);
	}

}
