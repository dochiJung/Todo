package com.example.demo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import com.example.demo.model.TodoEntity;

import java.util.List;
//import java.util.Optional;

//@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String>{

	//Optional<TodoEntity> findById(long id);
	
	List<TodoEntity> findByUserId(String userId);
	
}