import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GroovyTest {

    @RequestMapping("/")
    String index(){
        return "hi."
    }
}