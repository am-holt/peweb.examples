/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.peweb.question.peweb;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import ox.xtext.peweb.question.QRuntimeModule;
import ox.xtext.peweb.question.QStandaloneSetup;
import ox.xtext.peweb.question.ide.QIdeModule;
import ox.xtext.peweb.question.peweb.QPeWebModule;

/**
 * Initialization support for running Xtext languages in pe web applications.
 */
@SuppressWarnings("all")
public class QPeWebSetup extends QStandaloneSetup {
  @Override
  public Injector createInjector() {
    QRuntimeModule _qRuntimeModule = new QRuntimeModule();
    QIdeModule _qIdeModule = new QIdeModule();
    QPeWebModule _qPeWebModule = new QPeWebModule();
    return Guice.createInjector(Modules2.mixin(_qRuntimeModule, _qIdeModule, _qPeWebModule));
  }
}
