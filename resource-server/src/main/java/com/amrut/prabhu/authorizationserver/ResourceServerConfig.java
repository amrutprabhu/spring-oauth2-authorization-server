package com.amrut.prabhu.authorizationserver;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class ResourceServerConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .mvcMatcher("/messages/**")
                    .authorizeRequests()
                        .mvcMatchers("/messages/**").access("hasAuthority('SCOPE_read')")
                        .and()
                .oauth2ResourceServer()
                .jwt();
    }
}
