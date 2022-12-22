package springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration{
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		//http.httpBasic().disable();
		http.authorizeRequests()
		.antMatchers("/account/login").permitAll()
		.antMatchers("/notice/register").hasRole("S")
		.anyRequest().authenticated()
		.and().logout().permitAll()
		.and().formLogin()
		.loginPage("/account/login").permitAll() //새로운 로그인 페이지 호출을 설정
		.loginProcessingUrl("/account/login") //실제 로그인을 징행 함
		.usernameParameter("USER_ID")
		.passwordParameter("USER_PASS")
		.defaultSuccessUrl("/notice/list") //로그인 성공시 보여줄 페이지
		.failureForwardUrl("/account/loginfail") //설정값 먹나 테스트 09:58분
		.and().csrf().disable();
		return http.build();
	}



}
