package us.jackenders.bestapi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ThingController {
    @RequestMapping("/things")
    public List<Thing> getAllThings(){
        List<Thing> things = new ArrayList<>();
        things.add(new Thing("Thing 1","The fellowship of the thing"));
        things.add(new Thing("Thing 2","The Two Things"));
        things.add(new Thing("Thing 3","The return of the thing"));
        return things;
    }
}