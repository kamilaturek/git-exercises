package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class HelloController {

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @RequestMapping("/resource")
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Krótka zabawa z branchami");
        return model;
    }

    @RequestMapping("/today")
    public Map<String,Object> today() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("today", LocalDate.now().getDayOfWeek().name());

        return model;
    }

    @RequestMapping("/proActaName")
    public Map<String,Object> proActaName() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("name", "Pro Acta");

        return model;
    }
}
