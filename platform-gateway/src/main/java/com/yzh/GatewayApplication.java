package com.yzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author by zengyao
 * @date 2021/3/5 9:31
 * @desc
 */
@SpringBootApplication
public class GatewayApplication {

  public static void main(String[] args) {
    for (String arg : args) {
      System.out.println(arg);
    }
    SpringApplication.run(GatewayApplication.class, args);
    //
  }
}
