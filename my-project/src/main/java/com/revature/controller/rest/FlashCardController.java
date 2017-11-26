package com.revature.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.FlashCard;
import com.revature.service.FlashCardService;

/**
 * A Rest Controller for receiving all requests dealing with flashcards
 * 
 * @author Blake
 *
 */
@RestController
@RequestMapping("flashcards")
@CrossOrigin(origins = "http://localhost:4200")
public class FlashCardController {

	@Autowired
	private FlashCardService flashService;

	/**
	 * 
	 * @return A list containing every {@link FlashCard}
	 */
	@GetMapping
	public List<FlashCard> findAll() {
		return flashService.getAll();
	}

	@GetMapping("test")
	public String test() {
		return "this is a test";
	}

}
