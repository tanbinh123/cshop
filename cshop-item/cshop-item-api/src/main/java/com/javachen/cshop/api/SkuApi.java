package com.javachen.cshop.api;

import com.javachen.cshop.entity.Sku;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface SkuApi {
    @GetMapping("sku/{id}")
    public Sku findById(@PathVariable("id") Long id);

    @GetMapping("sku")
    public List<Sku> findAllBySpuId(@RequestParam("spuId") Long spuId) ;
}