package hello;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Map<String, Object> today(){
        Map<String,Object> mapka = new HashMap<String, Object>();
        String name = LocalDateTime.now().getDayOfWeek().name();
        mapka.put("dzien", name);
        return mapka;
    }

    @RequestMapping("/today2")
    public Map<String,String> today2() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("dzien", "Dzisiaj jest czwartek :)");
        return map;
    }

    @RequestMapping("/getMojaFirmaProacta")
    public Map<String,String> getMojaFirmaProacta() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("firma", "ProActa");
        return map;
    }

    
}
