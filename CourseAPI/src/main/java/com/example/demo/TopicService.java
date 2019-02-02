package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("java", "core Java", "corejava description")));
	
	public List<Topic> getAllTopics()
	{
		
		return (List<Topic>) topicRepository.findAll();
	}
	//get by id
	public Topic getTopic(String id) 
	{
		Topic t = topicRepository.findById(id).get();
		  return t;
	}
	
	//post request
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id, Topic topic)
	{
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id)
	{
		topicRepository.deleteById(id);
	}
	
}


