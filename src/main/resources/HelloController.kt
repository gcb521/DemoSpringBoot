import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by ${chengbin.gu} on 2019/6/24.
 */
@Controller
class HelloController {
    @RequestMapping("/index.html")
    fun index(): String {
        return "index"
    }
}