package io.bridge.test.config;

import io.bridge.test.handler.GoodsHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

//@Configuration
public class RouteConfig {
  @Bean
  public RouterFunction<ServerResponse> routSayHi(GoodsHandler handler) {
    return RouterFunctions
            .route(RequestPredicates.PUT("/goods/decrease")
                    .and(RequestPredicates.accept(MediaType.ALL)), handler::goodsDecrease);
  }
}
