package me.ssu.springquerydslweb.configs;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// TODO 권한과 인증-1
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests()
				// TODO 전체 열람권한
				.mvcMatchers("/", "/login", "/sign-up").permitAll()
				// TODO Get 요청 허용
				.mvcMatchers(HttpMethod.GET, "/profile/*").permitAll()
				// TODO 다른 요청(anyRequest) & 인증을 필요로 함(authenticated)
				.anyRequest().authenticated();
	}

	// TODO Favicon(Spring-boot에서 제공하는 ignoring 처리)-2
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring()
				// TODO PathRequest 이후 다양한 메소드로 처리할 수도 있음.
				.requestMatchers(PathRequest.toStaticResources().atCommonLocations());
	}
}
