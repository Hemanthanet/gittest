package com.example.demo.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Controller;
import static com.example.demo.Security.ApplicationUserRole.*;

@Controller
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }




    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers( "index","/css/*","/js/*")
                .permitAll()
                .antMatchers("api/**").hasRole(STUDENT.name())
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
     UserDetails userHemantha=User.builder()
                .username("Hemantha")
                .password(passwordEncoder.encode( "test123"))//password shuld be encoded
                //.roles("STUDENT") //ROLE_STUDENT
             .roles(STUDENT.name())
                .build();

     UserDetails adminHemantha =User.builder()
             .username("adminHemantha")
             .password(passwordEncoder.encode("admin123"))
             .roles(ADMIN.name())
             .build();

     return  new InMemoryUserDetailsManager(
             userHemantha,
             adminHemantha
     );
    }
}
