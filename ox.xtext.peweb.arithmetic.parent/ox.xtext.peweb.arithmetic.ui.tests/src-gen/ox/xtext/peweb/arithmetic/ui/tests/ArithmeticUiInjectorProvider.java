/*
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.peweb.arithmetic.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import ox.xtext.peweb.arithmetic.ui.internal.ArithmeticActivator;

public class ArithmeticUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return ArithmeticActivator.getInstance().getInjector("ox.xtext.peweb.arithmetic.Arithmetic");
	}

}
