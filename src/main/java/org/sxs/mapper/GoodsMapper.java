package org.sxs.mapper;

import org.sxs.pojo.Goods;

import java.util.List;

/**
 * @ClassName: GoodsMapper
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/12/9 18:05
 * @Version: V1.0
 */
public interface GoodsMapper {
    public List<Goods> all();

    public int add(Goods goods);

    public int udate(Goods goods);

    public int lete(String id);
}

