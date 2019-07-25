package com.hextrato.kral.console.exec.meta.schema.tabular;

import com.hextrato.kral.console.parser.KCMetadata;
import com.hextrato.kral.console.parser.KCParser;
import com.hextrato.kral.core.util.exception.KException;

public class AttributeHextract implements KCParser {

	public void setContext (KCMetadata clmd) { clmd.setContext("file"); } 

	public boolean exec(KCMetadata clmd) throws KException {
		return Attribute.doHextract(clmd);
	}
}

