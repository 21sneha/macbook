package web.web.explore;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class projectcontrol {


    @RequestMapping(value = "/family")
    public project getdata() {


        project s1=new project();
        s1.fathername= " venkatesh ";
        s1.mothername= " brindha ";
        return s1;
    }
}
