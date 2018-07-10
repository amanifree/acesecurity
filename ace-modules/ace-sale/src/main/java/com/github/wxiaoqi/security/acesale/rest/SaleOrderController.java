package com.github.wxiaoqi.security.acesale.rest;

import com.github.wxiaoqi.security.acesale.biz.SaleOrderBiz;
import com.github.wxiaoqi.security.acesale.entity.SaleOrder;
import com.github.wxiaoqi.security.common.msg.TableResultResponse;
import com.github.wxiaoqi.security.common.rest.BaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author Amani
 * create 2018-07-09
 */
@Controller
@RequestMapping("saleorder")
public class SaleOrderController extends BaseController<SaleOrderBiz,SaleOrder> {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public TableResultResponse<SaleOrder> page(@RequestParam(defaultValue = "10") int limit,
                                             @RequestParam(defaultValue = "1") int offset, String name, @RequestParam(defaultValue = "0") int menuId) {
        Example example = new Example(SaleOrder.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("menuId", menuId);
        if(StringUtils.isNotBlank(name)){
            criteria.andLike("name", "%" + name + "%");
        }
        List<SaleOrder> elements = baseBiz.selectByExample(example);
        return new TableResultResponse<SaleOrder>(elements.size(), elements);
    }
}
