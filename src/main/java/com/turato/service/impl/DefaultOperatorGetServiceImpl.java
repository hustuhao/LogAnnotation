package com.turato.service.impl;


import com.turato.beans.Operator;
import com.turato.service.IOperatorGetService;

/**
 * @author muzhantong
 * create on 2020/4/29 5:45 下午
 */
public class DefaultOperatorGetServiceImpl implements IOperatorGetService {

    @Override
    public Operator getUser() {
        // return Optional.ofNullable(UserUtils.getUser())
        //                .map(a -> new Operator(a.getName(), a.getLogin()))
        //                .orElseThrow(()->new IllegalArgumentException("user is null"));
        Operator operator = new Operator();
        operator.setOperatorId("111");
        return operator;
    }
}
