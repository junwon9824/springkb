package multicampus.kb03.boot_mybatis_0504;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import multicampus.kb03.boot_mybatis_0504.entity.Bbs;
import multicampus.kb03.boot_mybatis_0504.mapper.BbsMapper;

@SpringBootApplication
public class BootMybatis0504Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootMybatis0504Application.class, args);
		run.getBean(BootMybatis0504Application.class).execute();
	}

	private void execute() {

		insert();
		selectAll();
	}

	private void selectAll() {
		List<Bbs> all = bbsMapper.findAll();

		for (Bbs bbs : all) {
			System.out.println(bbs.toString());
		}

	}

	private void insert() {
		Bbs bbs = new Bbs();
		bbs.setTitle("boot mybatis");
		bbs.setWriter_id("user01");
		bbs.setContent("boot mybatis testing");
		bbsMapper.save(bbs);

	}

	@Autowired
	private BbsMapper bbsMapper;

}
