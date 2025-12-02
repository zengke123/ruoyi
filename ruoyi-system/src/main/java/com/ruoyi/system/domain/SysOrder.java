package com.ruoyi.system.domain;

import java.math.BigDecimal;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单对象 sys_order
 * 
 * @author ruoyi
 */
public class SysOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单ID */
    private Long orderId;

    /** 订单编号 */
    private String orderNo;

    /** 客户姓名 */
    private String customerName;

    /** 客户电话 */
    private String customerPhone;

    /** 商品名称 */
    private String productName;

    /** 数量 */
    private Integer quantity;

    /** 单价 */
    private BigDecimal unitPrice;

    /** 总金额 */
    private BigDecimal totalAmount;

    /** 订单状态（0待处理 1已确认 2配送中 3已完成 4已取消） */
    private String orderStatus;

    /** 支付状态（0未支付 1已支付 2已退款） */
    private String paymentStatus;

    /** 收货地址 */
    private String shippingAddress;

    public Long getOrderId()
    {
        return orderId;
    }

    public void setOrderId(Long orderId)
    {
        this.orderId = orderId;
    }

    @NotBlank(message = "订单编号不能为空")
    @Size(min = 0, max = 50, message = "订单编号不能超过50个字符")
    public String getOrderNo()
    {
        return orderNo;
    }

    public void setOrderNo(String orderNo)
    {
        this.orderNo = orderNo;
    }

    @NotBlank(message = "客户姓名不能为空")
    @Size(min = 0, max = 50, message = "客户姓名不能超过50个字符")
    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    @NotBlank(message = "客户电话不能为空")
    @Size(min = 0, max = 20, message = "客户电话不能超过20个字符")
    public String getCustomerPhone()
    {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone)
    {
        this.customerPhone = customerPhone;
    }

    @NotBlank(message = "商品名称不能为空")
    @Size(min = 0, max = 100, message = "商品名称不能超过100个字符")
    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    @NotNull(message = "数量不能为空")
    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }

    @NotNull(message = "单价不能为空")
    public BigDecimal getUnitPrice()
    {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalAmount()
    {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount)
    {
        this.totalAmount = totalAmount;
    }

    public String getOrderStatus()
    {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus)
    {
        this.orderStatus = orderStatus;
    }

    public String getPaymentStatus()
    {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus)
    {
        this.paymentStatus = paymentStatus;
    }

    @Size(min = 0, max = 200, message = "收货地址不能超过200个字符")
    public String getShippingAddress()
    {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress)
    {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("orderNo", getOrderNo())
            .append("customerName", getCustomerName())
            .append("customerPhone", getCustomerPhone())
            .append("productName", getProductName())
            .append("quantity", getQuantity())
            .append("unitPrice", getUnitPrice())
            .append("totalAmount", getTotalAmount())
            .append("orderStatus", getOrderStatus())
            .append("paymentStatus", getPaymentStatus())
            .append("shippingAddress", getShippingAddress())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
