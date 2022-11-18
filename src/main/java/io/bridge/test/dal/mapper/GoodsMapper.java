package io.bridge.test.dal.mapper;

import io.bridge.test.dal.entity.Goods;
import org.springframework.data.r2dbc.repository.Modifying;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xuyong
 * @since 2022-11-18
 */
public interface GoodsMapper extends ReactiveCrudRepository<Goods, Long> {


  @Transactional
  @Modifying
  @Query("update goods set stock=stock-1 where id=:#{#id} and stock>0")
  Mono<Integer> decrease(@Param("id") Integer id);
}
