package com.study.mike.dubbo.spi.impl;

import com.alibaba.dubbo.common.URL;
import com.study.mike.dubbo.spi.api.AdaptiveTestInterface;

public class My2AdaptiveImpl implements AdaptiveTestInterface {
  @Override
  public void testadaptive(URL url) {
    System.out.println("test2 adaptive");
  }

  @Override
  public void test() {

  }
}
