package com.javachen.api;

import com.javachen.common.response.CommonResponse;
import com.javachen.entity.Sku;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface SkuApi {
    /**
     * 根据sku的id查询sku
     *
     * @param skuId
     * @return
     */
    @GetMapping("sku/{skuId}")
    public CommonResponse<Sku> findSkuById(@PathVariable("skuId") Long skuId);
    /**
     * 根据Spu的id查询其下所有的sku
     *
     * @param spuId
     * @return
     */
    @GetMapping("sku/spu/{spuId}")
    public CommonResponse<List<Sku>> findAllSkuBySpuId(@PathVariable("spuId") Long spuId);
}