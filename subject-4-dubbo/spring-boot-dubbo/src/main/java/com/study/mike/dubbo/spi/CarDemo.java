package com.study.mike.dubbo.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.config.spring.ServiceBean;
import com.study.mike.dubbo.spi.api.AdaptiveTestInterface;
import com.study.mike.dubbo.spi.api.CarInterface;

import java.io.IOException;

public class CarDemo {

  public static void main(String[] args) {

//    ExtensionLoader<CarInterface> extensionLoader = ExtensionLoader.getExtensionLoader(CarInterface.class);
//    CarInterface red = extensionLoader.getExtension("red");
//    red.getColor();
//    AdaptiveTestInterface adaptiveExtension = extensionLoader.getAdaptiveExtension();
    ExtensionLoader<AdaptiveTestInterface> extensionLoader = ExtensionLoader.getExtensionLoader(AdaptiveTestInterface.class);
    AdaptiveTestInterface adaptiveExtension =  extensionLoader.getExtension("test1");
    adaptiveExtension.testadaptive(URL.valueOf("test://localhost/test?t=test2"));
    ServiceBean s = new ServiceBean();
    try {
      System.in.read();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}
