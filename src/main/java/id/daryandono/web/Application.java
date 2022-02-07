package id.daryandono.web;

import com.blade.Blade;

/**
 * Main class for the application.
 * @author Murti Daryandono
 */

public class Application {
    public static void main(String [] args){
        Blade.of()
                .gzip(true)
                .start(Application.class, args);
    }
}
