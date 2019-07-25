package com.hextrato.kral.console.exec.meta.schema.tabular;

import com.hextrato.kral.console.parser.KCMetadata;
import com.hextrato.kral.console.parser.KCParser;

public class TabularSave implements KCParser {

	public void setContext (KCMetadata clmd) { clmd.setContext("property"); }

	public String[] getValidTokenSet () { return new String[] {"var"}; }

}

