package main;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.PostConstruct;

@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping("/get")
    public HttpEntity<String> get() {
        String str = "{" +
                "\"key1\":\"value2\"," +
                "\"key2\":\"value2\"," +
                "\"obje1\":{ \"key1\":\"value1\"}" +
                "}";
        return new HttpEntity<String>(str);

    }

    @GetMapping("/get2")
    public HttpEntity<String> get2() {
        String str = "{" +
                "\"key1\":\"value1\"," +
                "\"key3\":\"value2\"," +
                "\"obje1\":{ \"key1\":\"value1\"}" +
                "}";
        return new HttpEntity<String>(str);

    }

    @PostMapping("/post")
    public HttpEntity<String> post(@RequestBody String body) {
        return new HttpEntity<String>(body);

    }

}
