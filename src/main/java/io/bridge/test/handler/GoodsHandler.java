package io.bridge.test.handler;


import com.sx.common.web.vo.wrapper.BaseResult;
import io.bridge.test.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xuyong
 * @since 2022-11-18
 */
//@Component
public class GoodsHandler {

  @Autowired
  private IGoodsService goodsService;

  public Mono<ServerResponse> goodsDecrease(ServerRequest request) {
    String id = request.queryParam("id").get();
    BaseResult result = BaseResult.success(goodsService.decrease(Integer.valueOf(id)));
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
            .body(BodyInserters.fromValue(result));
  }
}
