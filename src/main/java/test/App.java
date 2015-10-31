package test;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.Set;
import java.util.HashSet;

/**
 * Application initialization.
 *
 * @author Marc Karassev
 */
public class App extends Application {

    /**
     * Initializes the system.
     */
    public App() {
        System.out.println("App initialized.");
    }

    // @Override
    // public Set<Class<?>> getClasses() {
    //     Set<Class<?>> s = new HashSet<Class<?>>();
    //     s.add(MyResource.class);
    //     return s;
    // }
}