package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysOrder;

/**
 * 订单 数据层
 * 
 * @author ruoyi
 */
public interface SysOrderMapper
{
    /**
     * 查询订单信息
     * 
     * @param orderId 订单ID
     * @return 订单信息
     */
    public SysOrder selectOrderById(Long orderId);

    /**
     * 查询订单列表
     * 
     * @param order 订单信息
     * @return 订单集合
     */
    public List<SysOrder> selectOrderList(SysOrder order);

    /**
     * 新增订单
     * 
     * @param order 订单信息
     * @return 结果
     */
    public int insertOrder(SysOrder order);

    /**
     * 修改订单
     * 
     * @param order 订单信息
     * @return 结果
     */
    public int updateOrder(SysOrder order);

    /**
     * 批量删除订单
     * 
     * @param orderIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrderByIds(String[] orderIds);

    /**
     * 根据订单编号查询订单
     * 
     * @param orderNo 订单编号
     * @return 订单信息
     */
    public SysOrder selectOrderByOrderNo(String orderNo);
}
