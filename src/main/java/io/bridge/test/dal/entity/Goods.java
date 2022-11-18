package io.bridge.test.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * <p>
 * 
 * </p>
 *
 * @author xuyong
 * @since 2022-11-18
 */
@Data
@Table("goods")
public class Goods {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    private String name;

    private String goodsCode;

    private Integer stock;


}
