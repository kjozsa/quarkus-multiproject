package example;

import common.SampleBean;
import io.quarkus.runtime.Startup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Startup
public class Main {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Inject
    SampleBean sampleBean;

    @PostConstruct
    public void init() {
        logger.warn("###### calling sampleBean.foo(): {}", sampleBean.foo());
    }
}
