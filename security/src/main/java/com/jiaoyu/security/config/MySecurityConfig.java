package com.jiaoyu.security.config;



import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //定制请求的授权规则
        http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/level1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2").antMatchers("/level3/**").hasRole("VIP3");
        http.formLogin().usernameParameter("username").passwordParameter("password").loginPage("/userlogin");//开启自动登录功能
        http.logout().logoutSuccessUrl("/");//开启自动配制的注销功能//注销成功后来到首页
        http.rememberMe().rememberMeParameter("remember");//开启记住我功能
    }
    //定义认证规则
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //设置角色，用户名密码
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("xuyisheng").password(new BCryptPasswordEncoder().encode("123456"))
                .roles("VIP1","VIP2").and().passwordEncoder(new BCryptPasswordEncoder()).withUser("lishi").password(new BCryptPasswordEncoder().encode("123456"))
                .roles("VIP2","VIP3").and().passwordEncoder(new BCryptPasswordEncoder()).withUser("wanwu").password(new BCryptPasswordEncoder().encode("123456"))
                .roles("VIP1","VIP3"); }
}
