//package org.example.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@Configuration
//@EnableWebFluxSecurity
//public class SecurityConfig {
//
//    @Bean
////    @Order(Ordered.HIGHEST_PRECEDENCE)
//    SecurityWebFilterChain springWebFilterChain(ServerHttpSecurity http) {
//        http.authorizeExchange((authorize) -> authorize
//                        .anyExchange().authenticated()
//                )
//                .formLogin(withDefaults());
//        return http.build();
//    }
//
//    @Bean
//    MapReactiveUserDetailsService userDetailsService() {
//        // @formatter:off
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("admin")
//                .roles("USER")
//                .build();
//        // @formatter:on
//        return new MapReactiveUserDetailsService(user);
//    }
//}
