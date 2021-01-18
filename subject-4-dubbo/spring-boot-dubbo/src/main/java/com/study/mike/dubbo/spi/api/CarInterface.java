package com.study.mike.dubbo.spi.api;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface CarInterface {
  void getColor();
}
