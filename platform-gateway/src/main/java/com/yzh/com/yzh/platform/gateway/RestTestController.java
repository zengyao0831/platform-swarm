package com.yzh.com.yzh.platform.gateway;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.EntryType;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by zengyao
 * @date 2021/3/5 14:28
 * @desc
 */
@RestController
public class RestTestController {
  Logger log = LoggerFactory.getLogger(RestTestController.class);

  @GetMapping("/test")
  public String testMethod() {
    Entry entry = null;
    try {
      entry = SphU.entry("testMethod", EntryType.IN);
    } catch (BlockException e) {
      return "";
    } finally {
      if (entry != null) entry.exit();
    }
    log.info("======== 啦啦啦 ============");
    return "test------->";
  }
}
