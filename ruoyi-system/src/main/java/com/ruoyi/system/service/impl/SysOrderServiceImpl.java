package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.SysOrder;
import com.ruoyi.system.mapper.SysOrderMapper;
import com.ruoyi.system.service.ISysOrderService;

/**
 * 订单 服务层实现
 * 
 * @author ruoyi
 */
@Service
public class SysOrderServiceImpl implements ISysOrderService
{
    @Autowired
    private SysOrderMapper orderMapper;

    /**
     * 查询订单信息
     * 
     * @param orderId 订单ID
     * @return 订单信息
     */
    @Override
    public SysOrder selectOrderById(Long orderId)
    {
        return orderMapper.selectOrderById(orderId);
    }

    /**
     * 查询订单列表
     * 
     * @param order 订单信息
     * @return 订单集合
     */
    @Override
    public List<SysOrder> selectOrderList(SysOrder order)
    {
        return orderMapper.selectOrderList(order);
    }

    /**
     * 新增订单
     * 
     * @param order 订单信息
     * @return 结果
     */
    @Override
    public int insertOrder(SysOrder order)
    {
        return orderMapper.insertOrder(order);
    }

    /**
     * 修改订单
     * 
     * @param order 订单信息
     * @return 结果
     */
    @Override
    public int updateOrder(SysOrder order)
    {
        return orderMapper.updateOrder(order);
    }

    /**
     * 删除订单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOrderByIds(String ids)
    {
        return orderMapper.deleteOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 根据订单编号查询订单
     * 
     * @param orderNo 订单编号
     * @return 订单信息
     */
    @Override
    public SysOrder selectOrderByOrderNo(String orderNo)
    {
        return orderMapper.selectOrderByOrderNo(orderNo);
    }
}
