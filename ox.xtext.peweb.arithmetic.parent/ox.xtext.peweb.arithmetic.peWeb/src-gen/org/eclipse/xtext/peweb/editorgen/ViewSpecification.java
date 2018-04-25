package org.eclipse.xtext.peweb.editorgen;
import java.util.Map;
import java.util.HashMap;
import org.eclipse.xtext.peweb.customview.*;
import org.eclipse.xtext.peweb.customview.generatoritems.*;

public class ViewSpecification {
	
	public static  Map<ProjectionIdentifier,HtmlProjectionSpecification> getNodeMap(){
		Map<ProjectionIdentifier,HtmlProjectionSpecification> result 
			= new HashMap<ProjectionIdentifier,HtmlProjectionSpecification>();
			
		result.put((new ProjectionIdentifier("Definition","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral("<h1>Function </h1> ")
			)
			.addItemToView(new ComponentRef("textBox","name")
			)
			.addItemToView(new CodeLiteral(" <h2>Arguments</h2>  ")
			)
			.addItemToView(new ChildRef("args","main")
			)
			.addItemToView(new CodeLiteral(" <h2>Expression:</h2> ")
			)
			.addItemToView(new ChildRef("expr","main")
			)
			.addItemToView(new CodeLiteral(" ")
			)
			);
		result.put((new ProjectionIdentifier("Definition","name")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" ")
			)
			.addItemToView(new ComponentRef("string","name")
			)
			.addItemToView(new CodeLiteral(" ")
			)
			);
		result.put((new ProjectionIdentifier("DeclaredParameter","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" ")
			)
			.addItemToView(new ComponentRef("textBox","name")
			)
			.addItemToView(new CodeLiteral(" ")
			)
			);
		result.put((new ProjectionIdentifier("DeclaredParameter","short")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" ")
			)
			.addItemToView(new ComponentRef("shortTextBox","name")
			)
			.addItemToView(new CodeLiteral(" ")
			)
			);
		result.put((new ProjectionIdentifier("DeclaredParameter","name")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" ")
			)
			.addItemToView(new ComponentRef("string","name")
			)
			.addItemToView(new CodeLiteral(" ")
			)
			);
		result.put((new ProjectionIdentifier("Evaluation","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" ")
			)
			.addItemToView(new ChildRef("expression","main")
			)
			.addItemToView(new CodeLiteral(" ; ")
			)
			);
		result.put((new ProjectionIdentifier("Plus","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" ")
			)
			.addItemToView(new ComponentRef("boldSpan","")
			)
			.addItemToView(new CodeLiteral(" (")
			)
			.addItemToView(new ChildRef("left","main")
			)
			.addItemToView(new CodeLiteral(" + ")
			)
			.addItemToView(new ChildRef("right","main")
			)
			.addItemToView(new CodeLiteral(") </span>")
			)
			);
		result.put((new ProjectionIdentifier("Minus","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" ")
			)
			.addItemToView(new ComponentRef("boldSpan","")
			)
			.addItemToView(new CodeLiteral(" (")
			)
			.addItemToView(new ChildRef("left","main")
			)
			.addItemToView(new CodeLiteral(" - ")
			)
			.addItemToView(new ChildRef("right","main")
			)
			.addItemToView(new CodeLiteral(") </span>")
			)
			);
		result.put((new ProjectionIdentifier("Multi","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" ")
			)
			.addItemToView(new ComponentRef("boldSpan","")
			)
			.addItemToView(new CodeLiteral(" (")
			)
			.addItemToView(new ChildRef("left","main")
			)
			.addItemToView(new CodeLiteral(" * ")
			)
			.addItemToView(new ChildRef("right","main")
			)
			.addItemToView(new CodeLiteral(") </span>")
			)
			);
		result.put((new ProjectionIdentifier("Div","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" ")
			)
			.addItemToView(new ComponentRef("boldSpan","")
			)
			.addItemToView(new CodeLiteral(" <table style=\"display:inline;vertical-align: +0.66em;align-items: center;text-align: center;border-bottom:4px solid white;\"><tbody><tr><td> ")
			)
			.addItemToView(new ChildRef("left","main")
			)
			.addItemToView(new CodeLiteral(" </td></tr><tr><td> ")
			)
			.addItemToView(new ChildRef("right","main")
			)
			.addItemToView(new CodeLiteral(" </td></tr> </tbody></table> </span>")
			)
			);
		result.put((new ProjectionIdentifier("SumExpression","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" ")
			)
			.addItemToView(new ComponentRef("boldSpan","")
			)
			.addItemToView(new CodeLiteral(" ( <table style=\"display:inline;vertical-align: +1.15em;align-items: center;text-align: center;\"><tbody><tr><td> ")
			)
			.addItemToView(new ComponentRef("numberBox","upper")
			)
			.addItemToView(new CodeLiteral(" </td></tr><tr><td>&sum;</td></tr><tr><td> ")
			)
			.addItemToView(new ChildRef("indexVariable","short")
			)
			.addItemToView(new CodeLiteral(" = ")
			)
			.addItemToView(new ComponentRef("numberBox","lower")
			)
			.addItemToView(new CodeLiteral(" </td></tr> </tbody></table> ")
			)
			.addItemToView(new ChildRef("expr","main")
			)
			.addItemToView(new CodeLiteral(" )</span> ")
			)
			);
		result.put((new ProjectionIdentifier("NumberLiteral","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" ")
			)
			.addItemToView(new ComponentRef("numberBox","value")
			)
			.addItemToView(new CodeLiteral("")
			)
			);
		result.put((new ProjectionIdentifier("FunctionCall","main")),
			new HtmlProjectionSpecification()
			.addItemToView(new CodeLiteral(" ")
			)
			.addItemToView(new ChildRef("func","name")
			)
			.addItemToView(new CodeLiteral(" ")
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
		result.put("shortTextBox",
			new HtmlComponentSpecification()
			.addItemToView(new CodeLiteral("<input type=\"text\" style=\"width: 40px;\" id=")
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
		result.put("numberBox",
			new HtmlComponentSpecification()
			.addItemToView(new CodeLiteral("<input type=\"number\" style=\"width: 40px;\" id=")
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
		result.put("boldSpan",
			new HtmlComponentSpecification()
			.addItemToView(new CodeLiteral("<span style=\"font-size: xx-large;font-weight: bolder;\">")
			)
			);
			
		return result;	
	}
	 
}
