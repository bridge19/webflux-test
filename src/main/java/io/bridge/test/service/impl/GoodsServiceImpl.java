package io.bridge.test.service.impl;

import io.bridge.test.dal.mapper.GoodsMapper;
import io.bridge.test.service.IGoodsService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xuyong
 * @since 2022-11-18
 */
@Service
public class GoodsServiceImpl implements IGoodsService {

//  @Resource
//  private R2dbcEntityTemplate template ;
  @Resource
  private GoodsMapper goodsMapper;
  @Resource
  private StringRedisTemplate stringRedisTemplate;
  @Override
  @Transactional
  public Mono<Integer> decrease(Integer id) {
//    Long value = stringRedisTemplate.opsForValue().decrement("goods"+id);
//    return value>0;
//    CriteriaDefinition criteria = Criteria.where("id").is(id) ;
//    Query query = Query.query(criteria) ;
//    Mono<Goods> selectRs = template.select(query,Goods.class).single();
//
//    return  selectRs.map(goods -> Update.update("stock", goods.getStock().intValue()-1))
//            .flatMap(update ->template.update(query, update, Goods.class));
    return goodsMapper.decrease(id);
  }
}
