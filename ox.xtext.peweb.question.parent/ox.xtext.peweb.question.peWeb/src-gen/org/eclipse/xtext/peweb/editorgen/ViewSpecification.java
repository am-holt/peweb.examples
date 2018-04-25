package org.eclipse.xtext.peweb.editorgen;
import java.util.Map;
import java.util.HashMap;
import org.eclipse.xtext.peweb.customview.*;
import org.eclipse.xtext.peweb.customview.generatoritems.*;

public class ViewSpecification {
	
	public static  Map<ProjectionIdentifier,HtmlProjectionSpecification> getNodeMap(){
		Map<ProjectionIdentifier,HtmlProjectionSpecification> result 
			= new HashMap<ProjectionIdentifier,HtmlProjectionSpecification>();
			
		result.put((new ProjectionIdentifier("Questionnaire","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral("<h1>Questionnaire Editor </h1> <h4>Sections in this questionnaire: </h4> ")
			)
			.addItemToView(new ChildRef("sections","summary")
			)
			.addItemToView(new CodeLiteral("")
			)
			);
		result.put((new ProjectionIdentifier("Section","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral("<h1> Section Editor </h1> <h4> Name of section: ")
			)
			.addItemToView(new ComponentRef("textBox","name")
			)
			.addItemToView(new CodeLiteral(" </h4> <h4> Section Contents:</h4> ")
			)
			.addItemToView(new ChildRef("sectionContents","main")
			)
			.addItemToView(new CodeLiteral(" <h4> (Optional) After this section: ")
			)
			.addItemToView(new ChildRef("nextSection","main")
			)
			.addItemToView(new CodeLiteral(" </h4>")
			)
			);
		result.put((new ProjectionIdentifier("Section","name")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral("Section ")
			)
			.addItemToView(new ComponentRef("string","name")
			)
			.addItemToView(new CodeLiteral("")
			)
			);
		result.put((new ProjectionIdentifier("Section","summary")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral("Section ")
			)
			.addItemToView(new ComponentRef("string","name")
			)
			.addItemToView(new CodeLiteral(" ")
			)
			);
		result.put((new ProjectionIdentifier("Title","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral("Title: ")
			)
			.addItemToView(new ComponentRef("textBox","title")
			)
			.addItemToView(new CodeLiteral("")
			)
			);
		result.put((new ProjectionIdentifier("Title","summary")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral("Title: ")
			)
			.addItemToView(new ComponentRef("string","title")
			)
			.addItemToView(new CodeLiteral("")
			)
			);
		result.put((new ProjectionIdentifier("Description","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral("Description: ")
			)
			.addItemToView(new ComponentRef("textBox","description")
			)
			.addItemToView(new CodeLiteral("")
			)
			);
		result.put((new ProjectionIdentifier("Description","summary")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral("Description: ")
			)
			.addItemToView(new ComponentRef("string","description")
			)
			.addItemToView(new CodeLiteral("")
			)
			);
		result.put((new ProjectionIdentifier("MultipleChoiceQuestion","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral("MultiChoiceQuestion: ")
			)
			.addItemToView(new ComponentRef("textBox","question")
			)
			.addItemToView(new CodeLiteral(" ")
			)
			.addItemToView(new ChildRef("answers","main")
			)
			.addItemToView(new CodeLiteral(" ")
			)
			);
		result.put((new ProjectionIdentifier("MultipleChoiceQuestion","summary")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral("Question: ")
			)
			.addItemToView(new ComponentRef("string","question")
			)
			.addItemToView(new CodeLiteral("")
			)
			);
		result.put((new ProjectionIdentifier("MultipleChoiceAnswer","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" Option: ")
			)
			.addItemToView(new ComponentRef("textBox","answer")
			)
			.addItemToView(new CodeLiteral("  (optional) If chosen: ")
			)
			.addItemToView(new ChildRef("goto","main")
			)
			.addItemToView(new CodeLiteral("  ")
			)
			);
		result.put((new ProjectionIdentifier("SectionReference","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" Go to ")
			)
			.addItemToView(new ChildRef("section","name")
			)
			.addItemToView(new CodeLiteral(" next")
			)
			);
		result.put((new ProjectionIdentifier("EndOfQuestionnaire","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" End the questionnaire ")
			)
			);
		result.put((new ProjectionIdentifier("TextQuestion","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral("TextualQuestion: ")
			)
			.addItemToView(new ComponentRef("textBox","question")
			)
			.addItemToView(new CodeLiteral(" ")
			)
			);
		result.put((new ProjectionIdentifier("TextQuestion","summary")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral("Question: ")
			)
			.addItemToView(new ComponentRef("string","question")
			)
			.addItemToView(new CodeLiteral("")
			)
			);
		
		return result;	
	}
	
	public static  Map<String,HtmlComponentSpecification> getComponentMap(){
		Map<String,HtmlComponentSpecification> result 
			= new HashMap<String,HtmlComponentSpecification>();
			
		result.put("textBox",
			new HtmlComponentSpecification()
			.addItemToView(new CodeLiteral("<input type=\"text\" id=")
			)
			.addItemToView(new IdentifierTag("input")
			)
			.addItemToView(new CodeLiteral(">")
			)
			.addAttributeController(new AttributeControllerSpecification()
				.addGetterItem(new CodeLiteral("document.getElementById(")
				)
				.addGetterItem(new IdentifierTag("input")
				)
				.addGetterItem(new CodeLiteral(").value")
				)
				.addSetterItem(new CodeLiteral("document.getElementById(")
				)
				.addSetterItem(new IdentifierTag("input")
				)
				.addSetterItem(new CodeLiteral(").value = X")
				)
				.addValidatorItem(new CodeLiteral("")
				)
			)
			);
		result.put("longTextBox",
			new HtmlComponentSpecification()
			.addItemToView(new CodeLiteral("<input type=\"text\" id=")
			)
			.addItemToView(new IdentifierTag("input")
			)
			.addItemToView(new CodeLiteral(">")
			)
			.addAttributeController(new AttributeControllerSpecification()
				.addGetterItem(new CodeLiteral("document.getElementById(")
				)
				.addGetterItem(new IdentifierTag("input")
				)
				.addGetterItem(new CodeLiteral(").value")
				)
				.addSetterItem(new CodeLiteral("document.getElementById(")
				)
				.addSetterItem(new IdentifierTag("input")
				)
				.addSetterItem(new CodeLiteral(").value = X")
				)
				.addValidatorItem(new CodeLiteral("")
				)
			)
			);
		result.put("string",
			new HtmlComponentSpecification()
			.addItemToView(new CodeLiteral("<span id=")
			)
			.addItemToView(new IdentifierTag("input")
			)
			.addItemToView(new CodeLiteral("> </span>")
			)
			.addAttributeController(new AttributeControllerSpecification()
				.addGetterItem(new CodeLiteral("document.getElementById(")
				)
				.addGetterItem(new IdentifierTag("input")
				)
				.addGetterItem(new CodeLiteral(").innerHTML")
				)
				.addSetterItem(new CodeLiteral("document.getElementById(")
				)
				.addSetterItem(new IdentifierTag("input")
				)
				.addSetterItem(new CodeLiteral(").innerHTML = X")
				)
				.addValidatorItem(new CodeLiteral("")
				)
			)
			);
			
		return result;	
	}
	 
}
