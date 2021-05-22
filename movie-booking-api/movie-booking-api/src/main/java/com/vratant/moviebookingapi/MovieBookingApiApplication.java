package com.vratant.moviebookingapi;

import com.vratant.moviebookingapi.mapclassjson.CustomerDetails;
import com.vratant.moviebookingapi.mapclassjson.MovieDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MovieBookingApiApplication {

	private static final Logger log =  LoggerFactory.getLogger(MovieBookingApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MovieBookingApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {

			CustomerDetails customerDetails = restTemplate.getForObject(
					"http://localhost:8080/customers/1", CustomerDetails.class);
			log.info(customerDetails.toString());

			MovieDetails movieDetails = restTemplate.getForObject(
					"http://localhost:8081/movies/1", MovieDetails.class);
			log.info(movieDetails.toString());


		};
	}

}
