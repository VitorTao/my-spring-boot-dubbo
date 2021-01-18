package com.study.mike.dubbo.spi.impl;

import com.study.mike.dubbo.spi.api.CarInterface;

public class CarWrapper implements CarInterface {

  private CarInterface carInterface;
  public CarWrapper(CarInterface carInterface){
    this.carInterface = carInterface;
  }
  @Override
  public void getColor() {
    System.out.println("wrapper1 before");
    carInterface.getColor();
    System.out.println("wrapper1 after");
  }
}
