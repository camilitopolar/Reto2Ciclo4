package Reto2_Web;
import Reto2_Web.interfaces.InterfaceUser;
import Reto2_Web.interfaces.InterfaceChocolate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto2WebApplication implements CommandLineRunner {
   @Autowired
    private InterfaceChocolate interfaceChocolate;
    @Autowired
    private InterfaceUser interfaceUser;
	public static void main(String[] args) {
		SpringApplication.run(Reto2WebApplication.class, args);
	}
          @Override
    public void run(String... args) throws Exception {
        interfaceChocolate.deleteAll();
        interfaceUser.deleteAll();
    }
        

}
