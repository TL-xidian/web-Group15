package com.cow.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 *
 * @description 商品退货表
 */
@Data
@Entity
@Table(name = "return_goods")
@NoArgsConstructor
@AllArgsConstructor
public class ReturnGoods {
    @Id
    private Integer returnId;
    private Date applyTime;
    private String userNumber;
    private String userName;
    private Double returnPrice;
    private String returnState;
    private Date dealTime;
    private String orderNo;
    private String operatorNumber;
    private String operatorName;
    private String returnReason;
}
