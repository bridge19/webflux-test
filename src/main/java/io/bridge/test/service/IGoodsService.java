package io.bridge.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.bridge.test.dal.entity.Goods;
import reactor.core.publisher.Mono;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xuyong
 * @since 2022-11-18
 */
public interface IGoodsService {

  Mono<Integer> decrease(Integer id);
}
