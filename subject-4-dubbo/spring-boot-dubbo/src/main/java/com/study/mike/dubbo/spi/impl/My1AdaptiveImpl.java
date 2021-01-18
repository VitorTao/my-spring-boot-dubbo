package com.study.mike.dubbo.spi.impl;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.study.mike.dubbo.spi.api.AdaptiveTestInterface;
public class My1AdaptiveImpl implements AdaptiveTestInterface {

  private AdaptiveTestInterface adaptiveTestInterface;
  public void setDDD(AdaptiveTestInterface adaptiveTestInterface){
    this.adaptiveTestInterface = adaptiveTestInterface;
  }

  @Override
  public void testadaptive(URL url) {
    System.out.println("test1 adaptive");
    adaptiveTestInterface.testadaptive(url);
  }

  @Override
  public void test() {

  }
}
