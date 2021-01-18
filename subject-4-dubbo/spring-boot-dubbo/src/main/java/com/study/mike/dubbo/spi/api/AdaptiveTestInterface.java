package com.study.mike.dubbo.spi.api;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface AdaptiveTestInterface {
  @Adaptive("t")
  void testadaptive(URL url);

  void test();
}
