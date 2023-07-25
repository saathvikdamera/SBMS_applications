package com.damera.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.damera.entity.Book;
import com.damera.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(value = MsgRestController.class)
public class MsgRestControllerTest {
	
	@MockBean
	private UserService service;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGetWelcomeMsg() throws Exception {
		
		when(service.getMsg()).thenReturn("Welcome boys....");
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
		
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int status = response.getStatus();
		
		assertEquals(200, status);
	}
	
	@Test
	public void testCreateBook() throws Exception {
		
		when(service.saveBook(ArgumentMatchers.any())).thenReturn(true);
		
		Book book = new Book(01, "Microservice", 2000.0);
		ObjectMapper mapper = new ObjectMapper();
		String bookJson = mapper.writeValueAsString(book);
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/books")
		                                                                     .contentType(MediaType.APPLICATION_JSON)
		                                                                     .content(bookJson);
		
		ResultActions perform = mockMvc.perform(requestBuilder);
		
		MvcResult mvcResult = perform.andReturn();
		
		MockHttpServletResponse response = mvcResult.getResponse();
		
		int status = response.getStatus();
		
		assertEquals(201, status);
	}

}
