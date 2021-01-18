package com.study.mike.dubbo.spi.impl;

import com.alibaba.dubbo.common.URL;
import com.study.mike.dubbo.spi.api.AdaptiveTestInterface;

public class My3AdaptiveImpl implements AdaptiveTestInterface {
  @Override
  public void testadaptive(URL url) {
    System.out.println("test3 adaptive");
  }

  @Override
  public void test() {

  }
}
