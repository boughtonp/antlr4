package org.antlr.v4.codegen.model;

import org.antlr.v4.codegen.OutputModelFactory;
import org.antlr.v4.tool.Rule;

import java.util.List;

public class VisitorDispatchMethod extends OutputModelObject {
	public String listenerName = "Rule";
	public boolean isEnter;

	public VisitorDispatchMethod(OutputModelFactory factory, Rule r, boolean isEnter) {
		super(factory);
		this.isEnter = isEnter;
		List<String> label = r.getAltLabels();
		if ( label!=null ) listenerName = label.get(0);
	}
}
