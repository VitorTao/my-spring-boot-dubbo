package com.study.mike.dubbo.spi.impl;

import com.study.mike.dubbo.spi.api.CarInterface;

public class RedCarImpl implements CarInterface {
  @Override
  public void getColor() {
    System.out.println("redcar=======");
  }
}
