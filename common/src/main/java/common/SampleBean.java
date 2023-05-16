package common;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SampleBean {

    public String foo() {
        return "foo";
//        return "bar";
    }
}
