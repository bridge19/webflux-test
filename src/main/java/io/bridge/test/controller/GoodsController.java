package io.bridge.test.controller;


import com.sx.common.web.vo.wrapper.BaseResult;
import io.bridge.test.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xuyong
 * @since 2022-11-18
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

  @Autowired
  private IGoodsService goodsService;

  @PutMapping(value = "/decrease",produces = {"application/json; charset=utf-8"})
  @ResponseBody
  public Mono<BaseResult> goodsDecrease(@RequestParam(value = "id", required = false) Integer id) {
    return goodsService.decrease(id).map(i -> BaseResult.success(i));
  }
}
