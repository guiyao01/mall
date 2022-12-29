package com.imooc.mall;

import com.imooc.mall.util.OrderCodeFactory;

import java.util.Random;

public class testDemo {
    public static void main(String[] args) {

        System.out.println(OrderCodeFactory.getRandom(1111l));

        Random random = new Random();
        System.out.println((int) (random.nextDouble() * 90000) + 10000);
    }
}
