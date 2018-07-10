package com.github.wxiaoqi.security.acesale.biz;

import com.github.wxiaoqi.security.acesale.entity.SaleOrder;
import com.github.wxiaoqi.security.acesale.mapper.SaleOrderMapper;
import com.github.wxiaoqi.security.common.biz.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Amani
 * @create 2018-07-09
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class SaleOrderBiz extends BaseBiz<SaleOrderMapper,SaleOrder> {


}
