package org.five.ticket.entity;

import java.math.BigDecimal;
import org.five.ticket.entity.user.User;


public class OrderEntity {
    private String uuid;
    private BigDecimal price; //订单价格
    private BigDecimal reallyPay;//实际付款
    private byte isPay;
    private User user;

}
