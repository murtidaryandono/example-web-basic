package id.daryandono.web.core;

import com.blade.Blade;
import com.blade.ioc.annotation.Bean;
import com.blade.loader.BladeLoader;
import com.blade.mvc.view.template.JetbrickTemplateEngine;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class to bootstrapping application settings.
 * Settings applied for the application are :
 * - Template : Jetbrick
 * @author Murti Daryandono
 */
@Bean
public class Bootstrap implements BladeLoader{
    /**
     * Function to load system with Jetbrick template
     * Connection parameters read from :
     * - development : application.properties
     * - staging : application-stg.properties
     * - production : application-prd.properties
     * @param blade framework object
     * @author Murti Daryandono
     */
    @Override
    public void load(Blade blade) {
        // JetBrick template setup
        JetbrickTemplateEngine engine = new JetbrickTemplateEngine();
        blade.templateEngine(engine);
        // Write log
        Logger.getLogger(Bootstrap.class.getName())
                .log(Level.INFO, "Setup Jetbrick as Application template");
    }
}
