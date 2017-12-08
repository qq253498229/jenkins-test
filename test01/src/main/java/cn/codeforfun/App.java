package cn.codeforfun;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package cn.codeforfun
 * Project jenkins-test
 * Email 253498229@qq.com
 *
 * @author WangBin
 * @version 1.0.0
 * @date Created on 2017/12/5 下午4:46
 */
@SpringBootApplication
@RestController
public class App {

  public static void main(String[] args) {
    new SpringApplicationBuilder(App.class).web(true).run(args);
  }

  @GetMapping("/")
  public String index() {
    return "index 666888";
  }
}
