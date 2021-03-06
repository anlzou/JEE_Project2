package anlzou.com.controller;

import anlzou.com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("json")
public class JsonControlle {

    @RequestMapping("/sendjson")
    public String sendjson(){
        return "sendjson";
    }

    //请求为json,返回json
    @RequestMapping("/requestJson")
    //@RequestBody将请求信息的json串转成user对象
    //@ResponseBody将user对象转成json输出
    @ResponseBody
    public User requestJson(@RequestBody User user) throws Exception{
        System.out.println(user);
        return user;//由于@ResponseBody注解，将user转成json格式返回
    }
}
