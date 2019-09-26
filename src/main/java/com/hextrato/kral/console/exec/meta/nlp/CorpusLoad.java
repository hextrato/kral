package com.hextrato.kral.console.exec.meta.nlp;

import com.hextrato.kral.console.parser.KCMetadata;
import com.hextrato.kral.console.parser.KCParser;
import com.hextrato.kral.core.util.exception.KException;

public class CorpusLoad implements KCParser {

	public void setContext (KCMetadata clmd) { clmd.setContext("dir"); } 

	public boolean exec(KCMetadata clmd) throws KException {
		return Corpus.doLoad(clmd);
	}
}

