package multicampus.kb03.boot0503;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import multicampus.kb03.boot0503.entity.Bbs;
import multicampus.kb03.boot0503.entity.BbsCrudRepository;

@SpringBootApplication
public class BootJpa0503Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootJpa0503Application.class, args);
		run.getBean(BootJpa0503Application.class).execute();
	}

	@Autowired
	private BbsCrudRepository repository;

	private void execute() {
		// TODO Auto-generated method stub
		Bbs bbs = new Bbs();
		bbs.setTitle("jpa test");
		bbs.setWriter_id("user01");
		bbs.setContent("test content");
		bbs.setRegdate(new Date());
		repository.save(bbs);
	}

}
