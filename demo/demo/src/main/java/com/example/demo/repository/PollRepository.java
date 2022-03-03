package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dominio.Poll;

public interface PollRepository extends CrudRepository<Poll, Integer>{

}
