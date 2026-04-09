package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Task;



public interface TaskService {
	
    /*
     *
     * @return タスクのリスト
     */
	List<Task> findAll();

}
