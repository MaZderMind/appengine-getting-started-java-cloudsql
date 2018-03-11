package de.mazdermind.experiments.appengine.springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.mazdermind.experiments.appengine.springboot.model.Quark;
import de.mazdermind.experiments.appengine.springboot.model.QuarkBuilder;
import de.mazdermind.experiments.appengine.springboot.repository.QuarkRepository;

@RestController
@RequestMapping("/quark")
public class QuarkRestController {
	@Autowired
	private QuarkRepository quarkRepository;

	@GetMapping("")
	public List<Quark> getQuarks() {
		return quarkRepository.findAll();
	}

	@GetMapping("/create/{title}")
	public Quark getQuarks(@PathVariable String title) {
		Quark quark = QuarkBuilder.aQuark()
				.withTitle(title)
				.build();

		return quarkRepository.save(quark);
	}
}
