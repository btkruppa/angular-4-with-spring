package com.revature.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.revature.entities.FlashCard;

@Repository
public interface FlashCardRepo {

	List<FlashCard> findAll();

}
