package com.revature.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.FlashCard;
import com.revature.repository.FlashCardRepo;
import com.revature.service.FlashCardService;

@Service
public class FlashCardServiceImpl implements FlashCardService {

	@Autowired
	private FlashCardRepo flashRepo;

	@Override
	public List<FlashCard> getAll() {
		return flashRepo.findAll();
	}

}
