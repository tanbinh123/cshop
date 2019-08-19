package com.javachen.cshop.item.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_sku_spec_value")
@Entity
public class SkuSpecValueXef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long skuId;
    private Long specValueId;
}
