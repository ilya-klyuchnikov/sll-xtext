/*
* generated by Xtext
*/
package meta.sll;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SLLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return meta.sll.ui.internal.SLLActivator.getInstance().getInjector("meta.sll.SLL");
	}
	
}
