package me.ssu.springquerydslweb;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


class SpringQuerydslWebApplicationTests extends BaseTest {

	@Test
	@DisplayName("회원가입 뷰")
	void signUpForm() throws Exception {
		mockMvc.perform(get("/sign-up"))
				.andExpect(status().isOk())
				.andExpect(view().name("account/sign-up"))
		;
	}
}