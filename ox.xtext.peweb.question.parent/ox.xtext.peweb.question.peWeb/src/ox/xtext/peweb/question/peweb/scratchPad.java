package ox.xtext.peweb.question.peweb;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.peweb.exceptions.ResourceLoadingException;
import org.eclipse.xtext.util.DisposableRegistry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

public class scratchPad {

	public static void main(String[] args) throws ResourceLoadingException {
		
		String projName = "test"; String fileName = "test.q";
		
		
		Injector injector = new QPeWebSetup().createInjectorAndDoEMFRegistration();
		DisposableRegistry disposableRegistry = injector.getInstance(DisposableRegistry.class);
		String fileLocation = "user-files" + File.separator + projName + File.separator + fileName;
		URI uri = URI.createFileURI(fileLocation);
		if (uri == null){	
			//TODO Create new Exception type for this;
			throw new ResourceLoadingException("The requested resource does not exist.");
		}		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(uri, true);
		
		
		EObject eobj = resource.getContents().get(0).eContents().get(0).eContents().get(0);
		EClass t = eobj.eClass();//.getESuperTypes().get(0).eClass();
		EClassifier te = eobj.eClass().getEPackage().getEClassifier("Section");
		EClassifier[]  classes = (EClassifier[])(eobj.eClass().getEPackage().getEClassifiers().toArray());//.forEach(a -> {if(a.eClass().isSuperTypeOf(t)){ System.out.println(a);}});
		
		for(int i = 0; i< classes.length;i ++) {
			if(classes[i] instanceof EClass) {
				EClass c = (EClass)classes[i];
				System.out.println(c.getName() + " Super types: ");
				c.getEAllSuperTypes().forEach(a -> System.out.println(a.getName()));
				System.out.println("");
			}
			
			
		}
		
		System.out.println(eobj.toString());
		
	}

}
