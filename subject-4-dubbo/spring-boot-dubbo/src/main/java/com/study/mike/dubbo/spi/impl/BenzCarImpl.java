package com.study.mike.dubbo.spi.impl;

import com.study.mike.dubbo.spi.api.CarInterface;

public class BenzCarImpl implements CarInterface {
  @Override
  public void getColor() {
    System.out.println("Benz=====");
  }
}
