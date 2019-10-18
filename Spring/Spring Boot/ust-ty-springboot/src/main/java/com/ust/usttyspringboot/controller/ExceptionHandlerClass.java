package com.ust.usttyspringboot.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice			//either write this or add @ResponseBody before string in method  ,,it takes request from browser give to controller if exception ocur then response is given by restControllerAdvice
public class ExceptionHandlerClass{
	@ExceptionHandler(Exception.class)
	public  String catchException(Exception e) {
		e.printStackTrace();
		return "Handle Exception";
	}

}
