package br.com.flavio.openweather;

import br.com.flavio.openweather.main.MainClass;
import com.sun.tools.javac.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenweatherApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OpenweatherApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MainClass main = new MainClass();
		main.showMenu();
	}
}
