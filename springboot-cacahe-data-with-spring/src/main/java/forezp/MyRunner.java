package forezp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("张景源");
    }
}
