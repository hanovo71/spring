//package com.yadam.control;
//
//import org.aspectj.lang.annotation.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import lombok.Setter;
//import lombok.extern.log4j.Log4j;
//
//@WebAppConfiguration
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
//public class BookControlTest {
//
//	@Setter(onMethod_ = @Autowired)
//	private WebApplicationContext ctx;
//	private MockMvc mockMvc;
//	
//	@Before(value = "")
//	public void setup() {
//		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
//	}
//	
//	@Test
//	public void registerTest() {
//		
//		System.out.println("test1");
//		RequestBuilder rb = MockMvcRequestBuilders.post("/book/register")
//				.param("bookNo","000")
//				.param("bookName","책이름");
//		
//		try {
//			String vn = mockMvc.perform(rb)
//								.andReturn()
//								.getModelAndView()
//								.getViewName();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("test2");
//	}
//}
