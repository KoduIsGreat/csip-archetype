
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package $package;

import csip.Config;
import csip.ContextConfig;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

/**
 *
 * @author User
 */
@javax.ws.rs.ApplicationPath("")
public class ApplicationConfig extends Application {

    @Context
    private ServletContext context;

    /**
     * Comment this if you are going to have core in the class path of your netbeans project.
     * If commented netbeans will regenerate  the getClasses() method
     *
     * @param foo
     * @return
     */
    public Set<Class<?>> getClasses(String foo) { }

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        resources.add(MultiPartFeature.class);
        resources.add(csip.ArchiveService.class);
        resources.add(csip.CatalogService.class);
        resources.add(csip.ControlService.class);
        resources.add(csip.QueryService.class);
        resources.add(csip.ReportService.class);
        resources.add(csip.UIService.class);
        addRestResourceClasses(resources);
        Config.registry().register(resources);
        return resources;
    }


    /**
     * Do not modify addRestResourceClasses() method. It is automatically
     * re-generated by NetBeans REST support to populate given list with all
     * resources defined in the project.
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add($package.services.V1.class);
    }
}