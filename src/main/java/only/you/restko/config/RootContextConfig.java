package only.you.restko.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"only.you.restko.service", "only.you.restko.repositary"})
public class RootContextConfig {

}
