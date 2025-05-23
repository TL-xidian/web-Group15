package com.cow.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @description 物流表
 */
@Data
@Entity
@Table(name = "logistics")
@NoArgsConstructor
@AllArgsConstructor
public class Logistics {
    @Id
    private Integer logisticId;
    private String orderNo;
    private String sender;
    private String senderTel;
    private String senderAdd;
    private String receiver;
    private String receiverTel;
    private String receiverAdd;
    private String parcelName;
}
