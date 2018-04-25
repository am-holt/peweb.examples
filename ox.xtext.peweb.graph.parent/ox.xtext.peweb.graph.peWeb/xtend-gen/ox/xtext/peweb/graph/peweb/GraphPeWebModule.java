/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.peweb.graph.peweb;

import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider;
import org.eclipse.xtext.web.server.persistence.IServerResourceHandler;
import ox.xtext.peweb.graph.peweb.AbstractGraphPeWebModule;
import ox.xtext.peweb.graph.peweb.GraphPeFileResourceHandler;
import ox.xtext.peweb.graph.peweb.GraphPeResourceBaseProvider;

/**
 * Use this class to register additional components to be used within the pe web application.
 */
@SuppressWarnings("all")
public class GraphPeWebModule extends AbstractGraphPeWebModule {
  public Class<? extends IServerResourceHandler> bindIServerResourceHandler() {
    return GraphPeFileResourceHandler.class;
  }
  
  public Class<? extends IResourceBaseProvider> bindIResourceBaseProvider() {
    return GraphPeResourceBaseProvider.class;
  }
}
