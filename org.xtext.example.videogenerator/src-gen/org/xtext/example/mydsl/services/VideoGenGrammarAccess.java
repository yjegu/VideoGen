/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class VideoGenGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class VideoGeneratorModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.VideoGen.VideoGeneratorModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVideoGeneratorModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cInformationAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInformationVideoGenInformationParserRuleCall_1_0 = (RuleCall)cInformationAssignment_1.eContents().get(0);
		private final Keyword cVideoGenKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cLEFT_BRACKETTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cVideoseqsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cVideoseqsVideoSeqParserRuleCall_4_0 = (RuleCall)cVideoseqsAssignment_4.eContents().get(0);
		private final RuleCall cRIGHT_BRACKETTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//VideoGeneratorModel:
		//	{VideoGeneratorModel} information=VideoGenInformation?
		//	'VideoGen' LEFT_BRACKET
		//	videoseqs+=VideoSeq+
		//	RIGHT_BRACKET;
		@Override public ParserRule getRule() { return rule; }

		//{VideoGeneratorModel} information=VideoGenInformation? 'VideoGen' LEFT_BRACKET videoseqs+=VideoSeq+ RIGHT_BRACKET
		public Group getGroup() { return cGroup; }

		//{VideoGeneratorModel}
		public Action getVideoGeneratorModelAction_0() { return cVideoGeneratorModelAction_0; }

		//information=VideoGenInformation?
		public Assignment getInformationAssignment_1() { return cInformationAssignment_1; }

		//VideoGenInformation
		public RuleCall getInformationVideoGenInformationParserRuleCall_1_0() { return cInformationVideoGenInformationParserRuleCall_1_0; }

		//'VideoGen'
		public Keyword getVideoGenKeyword_2() { return cVideoGenKeyword_2; }

		//LEFT_BRACKET
		public RuleCall getLEFT_BRACKETTerminalRuleCall_3() { return cLEFT_BRACKETTerminalRuleCall_3; }

		//videoseqs+=VideoSeq+
		public Assignment getVideoseqsAssignment_4() { return cVideoseqsAssignment_4; }

		//VideoSeq
		public RuleCall getVideoseqsVideoSeqParserRuleCall_4_0() { return cVideoseqsVideoSeqParserRuleCall_4_0; }

		//RIGHT_BRACKET
		public RuleCall getRIGHT_BRACKETTerminalRuleCall_5() { return cRIGHT_BRACKETTerminalRuleCall_5; }
	}

	public class VideoGenInformationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.VideoGen.VideoGenInformation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVideoGenInformationAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cAuthorKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAuthorNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAuthorNameSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cAuthorNameAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cVersionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVersionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVersionSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cVersionAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCreationKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cCreationDateAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cCreationDateSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cCreationDateAssignment_3_1.eContents().get(0);
		
		//VideoGenInformation:
		//	{VideoGenInformation} ('@author' authorName=STRING) ('@version' version=STRING)? ('@creation' creationDate=STRING)?;
		@Override public ParserRule getRule() { return rule; }

		//{VideoGenInformation} ('@author' authorName=STRING) ('@version' version=STRING)? ('@creation' creationDate=STRING)?
		public Group getGroup() { return cGroup; }

		//{VideoGenInformation}
		public Action getVideoGenInformationAction_0() { return cVideoGenInformationAction_0; }

		//('@author' authorName=STRING)
		public Group getGroup_1() { return cGroup_1; }

		//'@author'
		public Keyword getAuthorKeyword_1_0() { return cAuthorKeyword_1_0; }

		//authorName=STRING
		public Assignment getAuthorNameAssignment_1_1() { return cAuthorNameAssignment_1_1; }

		//STRING
		public RuleCall getAuthorNameSTRINGTerminalRuleCall_1_1_0() { return cAuthorNameSTRINGTerminalRuleCall_1_1_0; }

		//('@version' version=STRING)?
		public Group getGroup_2() { return cGroup_2; }

		//'@version'
		public Keyword getVersionKeyword_2_0() { return cVersionKeyword_2_0; }

		//version=STRING
		public Assignment getVersionAssignment_2_1() { return cVersionAssignment_2_1; }

		//STRING
		public RuleCall getVersionSTRINGTerminalRuleCall_2_1_0() { return cVersionSTRINGTerminalRuleCall_2_1_0; }

		//('@creation' creationDate=STRING)?
		public Group getGroup_3() { return cGroup_3; }

		//'@creation'
		public Keyword getCreationKeyword_3_0() { return cCreationKeyword_3_0; }

		//creationDate=STRING
		public Assignment getCreationDateAssignment_3_1() { return cCreationDateAssignment_3_1; }

		//STRING
		public RuleCall getCreationDateSTRINGTerminalRuleCall_3_1_0() { return cCreationDateSTRINGTerminalRuleCall_3_1_0; }
	}

	public class VideoSeqElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.VideoGen.VideoSeq");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMandatoryVideoSeqParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOptionalVideoSeqParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAlternativeVideoSeqParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//VideoSeq:
		//	MandatoryVideoSeq | OptionalVideoSeq | AlternativeVideoSeq;
		@Override public ParserRule getRule() { return rule; }

		//MandatoryVideoSeq | OptionalVideoSeq | AlternativeVideoSeq
		public Alternatives getAlternatives() { return cAlternatives; }

		//MandatoryVideoSeq
		public RuleCall getMandatoryVideoSeqParserRuleCall_0() { return cMandatoryVideoSeqParserRuleCall_0; }

		//OptionalVideoSeq
		public RuleCall getOptionalVideoSeqParserRuleCall_1() { return cOptionalVideoSeqParserRuleCall_1; }

		//AlternativeVideoSeq
		public RuleCall getAlternativeVideoSeqParserRuleCall_2() { return cAlternativeVideoSeqParserRuleCall_2; }
	}

	public class MandatoryVideoSeqElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.VideoGen.MandatoryVideoSeq");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMandatoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescriptionVideoDescriptionParserRuleCall_1_0 = (RuleCall)cDescriptionAssignment_1.eContents().get(0);
		
		//MandatoryVideoSeq:
		//	'mandatory' description=VideoDescription;
		@Override public ParserRule getRule() { return rule; }

		//'mandatory' description=VideoDescription
		public Group getGroup() { return cGroup; }

		//'mandatory'
		public Keyword getMandatoryKeyword_0() { return cMandatoryKeyword_0; }

		//description=VideoDescription
		public Assignment getDescriptionAssignment_1() { return cDescriptionAssignment_1; }

		//VideoDescription
		public RuleCall getDescriptionVideoDescriptionParserRuleCall_1_0() { return cDescriptionVideoDescriptionParserRuleCall_1_0; }
	}

	public class OptionalVideoSeqElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.VideoGen.OptionalVideoSeq");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOptionalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescriptionVideoDescriptionParserRuleCall_1_0 = (RuleCall)cDescriptionAssignment_1.eContents().get(0);
		
		//OptionalVideoSeq:
		//	'optional' description=VideoDescription;
		@Override public ParserRule getRule() { return rule; }

		//'optional' description=VideoDescription
		public Group getGroup() { return cGroup; }

		//'optional'
		public Keyword getOptionalKeyword_0() { return cOptionalKeyword_0; }

		//description=VideoDescription
		public Assignment getDescriptionAssignment_1() { return cDescriptionAssignment_1; }

		//VideoDescription
		public RuleCall getDescriptionVideoDescriptionParserRuleCall_1_0() { return cDescriptionVideoDescriptionParserRuleCall_1_0; }
	}

	public class AlternativeVideoSeqElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.VideoGen.AlternativeVideoSeq");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAlternativesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVideoidAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVideoidIDTerminalRuleCall_1_0 = (RuleCall)cVideoidAssignment_1.eContents().get(0);
		private final RuleCall cLEFT_BRACKETTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cVideodescsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVideodescsVideoDescriptionParserRuleCall_3_0 = (RuleCall)cVideodescsAssignment_3.eContents().get(0);
		private final RuleCall cRIGHT_BRACKETTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//AlternativeVideoSeq:
		//	'alternatives' videoid=ID? LEFT_BRACKET videodescs+=VideoDescription+ RIGHT_BRACKET;
		@Override public ParserRule getRule() { return rule; }

		//'alternatives' videoid=ID? LEFT_BRACKET videodescs+=VideoDescription+ RIGHT_BRACKET
		public Group getGroup() { return cGroup; }

		//'alternatives'
		public Keyword getAlternativesKeyword_0() { return cAlternativesKeyword_0; }

		//videoid=ID?
		public Assignment getVideoidAssignment_1() { return cVideoidAssignment_1; }

		//ID
		public RuleCall getVideoidIDTerminalRuleCall_1_0() { return cVideoidIDTerminalRuleCall_1_0; }

		//LEFT_BRACKET
		public RuleCall getLEFT_BRACKETTerminalRuleCall_2() { return cLEFT_BRACKETTerminalRuleCall_2; }

		//videodescs+=VideoDescription+
		public Assignment getVideodescsAssignment_3() { return cVideodescsAssignment_3; }

		//VideoDescription
		public RuleCall getVideodescsVideoDescriptionParserRuleCall_3_0() { return cVideodescsVideoDescriptionParserRuleCall_3_0; }

		//RIGHT_BRACKET
		public RuleCall getRIGHT_BRACKETTerminalRuleCall_4() { return cRIGHT_BRACKETTerminalRuleCall_4; }
	}

	public class VideoDescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.VideoGen.VideoDescription");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVideoseqKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVideoidAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVideoidIDTerminalRuleCall_1_0 = (RuleCall)cVideoidAssignment_1.eContents().get(0);
		private final Assignment cLocationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLocationSTRINGTerminalRuleCall_2_0 = (RuleCall)cLocationAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final RuleCall cLEFT_BRACKETTerminalRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cDurationKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cDurationAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cDurationINTTerminalRuleCall_3_1_1_0 = (RuleCall)cDurationAssignment_3_1_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cProbabilityKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cProbabilityAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cProbabilityINTTerminalRuleCall_3_2_1_0 = (RuleCall)cProbabilityAssignment_3_2_1.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cSizeKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cSizeAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cSizeINTTerminalRuleCall_3_3_1_0 = (RuleCall)cSizeAssignment_3_3_1.eContents().get(0);
		private final Group cGroup_3_4 = (Group)cGroup_3.eContents().get(4);
		private final Keyword cDescriptionKeyword_3_4_0 = (Keyword)cGroup_3_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_4_1 = (Assignment)cGroup_3_4.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_4_1_0 = (RuleCall)cDescriptionAssignment_3_4_1.eContents().get(0);
		private final Group cGroup_3_5 = (Group)cGroup_3.eContents().get(5);
		private final Keyword cFiltersKeyword_3_5_0 = (Keyword)cGroup_3_5.eContents().get(0);
		private final Assignment cFiltersAssignment_3_5_1 = (Assignment)cGroup_3_5.eContents().get(1);
		private final RuleCall cFiltersFilterParserRuleCall_3_5_1_0 = (RuleCall)cFiltersAssignment_3_5_1.eContents().get(0);
		private final RuleCall cRIGHT_BRACKETTerminalRuleCall_3_6 = (RuleCall)cGroup_3.eContents().get(6);
		
		//VideoDescription:
		//	'videoseq' videoid=ID? location=STRING (LEFT_BRACKET ('duration' duration=INT)? ('probability' probability=INT)?
		//	('size' size=INT)? ('description' description=STRING)? ('filters' filters+=Filter+)?
		//	RIGHT_BRACKET)?;
		@Override public ParserRule getRule() { return rule; }

		//'videoseq' videoid=ID? location=STRING (LEFT_BRACKET ('duration' duration=INT)? ('probability' probability=INT)? ('size'
		//size=INT)? ('description' description=STRING)? ('filters' filters+=Filter+)? RIGHT_BRACKET)?
		public Group getGroup() { return cGroup; }

		//'videoseq'
		public Keyword getVideoseqKeyword_0() { return cVideoseqKeyword_0; }

		//videoid=ID?
		public Assignment getVideoidAssignment_1() { return cVideoidAssignment_1; }

		//ID
		public RuleCall getVideoidIDTerminalRuleCall_1_0() { return cVideoidIDTerminalRuleCall_1_0; }

		//location=STRING
		public Assignment getLocationAssignment_2() { return cLocationAssignment_2; }

		//STRING
		public RuleCall getLocationSTRINGTerminalRuleCall_2_0() { return cLocationSTRINGTerminalRuleCall_2_0; }

		//(LEFT_BRACKET ('duration' duration=INT)? ('probability' probability=INT)? ('size' size=INT)? ('description'
		//description=STRING)? ('filters' filters+=Filter+)? RIGHT_BRACKET)?
		public Group getGroup_3() { return cGroup_3; }

		//LEFT_BRACKET
		public RuleCall getLEFT_BRACKETTerminalRuleCall_3_0() { return cLEFT_BRACKETTerminalRuleCall_3_0; }

		//('duration' duration=INT)?
		public Group getGroup_3_1() { return cGroup_3_1; }

		//'duration'
		public Keyword getDurationKeyword_3_1_0() { return cDurationKeyword_3_1_0; }

		//duration=INT
		public Assignment getDurationAssignment_3_1_1() { return cDurationAssignment_3_1_1; }

		//INT
		public RuleCall getDurationINTTerminalRuleCall_3_1_1_0() { return cDurationINTTerminalRuleCall_3_1_1_0; }

		//('probability' probability=INT)?
		public Group getGroup_3_2() { return cGroup_3_2; }

		//'probability'
		public Keyword getProbabilityKeyword_3_2_0() { return cProbabilityKeyword_3_2_0; }

		//probability=INT
		public Assignment getProbabilityAssignment_3_2_1() { return cProbabilityAssignment_3_2_1; }

		//INT
		public RuleCall getProbabilityINTTerminalRuleCall_3_2_1_0() { return cProbabilityINTTerminalRuleCall_3_2_1_0; }

		//('size' size=INT)?
		public Group getGroup_3_3() { return cGroup_3_3; }

		//'size'
		public Keyword getSizeKeyword_3_3_0() { return cSizeKeyword_3_3_0; }

		//size=INT
		public Assignment getSizeAssignment_3_3_1() { return cSizeAssignment_3_3_1; }

		//INT
		public RuleCall getSizeINTTerminalRuleCall_3_3_1_0() { return cSizeINTTerminalRuleCall_3_3_1_0; }

		//('description' description=STRING)?
		public Group getGroup_3_4() { return cGroup_3_4; }

		//'description'
		public Keyword getDescriptionKeyword_3_4_0() { return cDescriptionKeyword_3_4_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_3_4_1() { return cDescriptionAssignment_3_4_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_4_1_0() { return cDescriptionSTRINGTerminalRuleCall_3_4_1_0; }

		//('filters' filters+=Filter+)?
		public Group getGroup_3_5() { return cGroup_3_5; }

		//'filters'
		public Keyword getFiltersKeyword_3_5_0() { return cFiltersKeyword_3_5_0; }

		//filters+=Filter+
		public Assignment getFiltersAssignment_3_5_1() { return cFiltersAssignment_3_5_1; }

		//Filter
		public RuleCall getFiltersFilterParserRuleCall_3_5_1_0() { return cFiltersFilterParserRuleCall_3_5_1_0; }

		//RIGHT_BRACKET
		public RuleCall getRIGHT_BRACKETTerminalRuleCall_3_6() { return cRIGHT_BRACKETTerminalRuleCall_3_6; }
	}

	public class FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.VideoGen.Filter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLEFT_BRACKETTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cFilterAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFilterSTRINGTerminalRuleCall_1_0 = (RuleCall)cFilterAssignment_1.eContents().get(0);
		private final RuleCall cRIGHT_BRACKETTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Filter:
		//	LEFT_BRACKET
		//	filter=STRING
		//	RIGHT_BRACKET;
		@Override public ParserRule getRule() { return rule; }

		//LEFT_BRACKET filter=STRING RIGHT_BRACKET
		public Group getGroup() { return cGroup; }

		//LEFT_BRACKET
		public RuleCall getLEFT_BRACKETTerminalRuleCall_0() { return cLEFT_BRACKETTerminalRuleCall_0; }

		//filter=STRING
		public Assignment getFilterAssignment_1() { return cFilterAssignment_1; }

		//STRING
		public RuleCall getFilterSTRINGTerminalRuleCall_1_0() { return cFilterSTRINGTerminalRuleCall_1_0; }

		//RIGHT_BRACKET
		public RuleCall getRIGHT_BRACKETTerminalRuleCall_2() { return cRIGHT_BRACKETTerminalRuleCall_2; }
	}
	
	
	private final VideoGeneratorModelElements pVideoGeneratorModel;
	private final VideoGenInformationElements pVideoGenInformation;
	private final VideoSeqElements pVideoSeq;
	private final MandatoryVideoSeqElements pMandatoryVideoSeq;
	private final OptionalVideoSeqElements pOptionalVideoSeq;
	private final AlternativeVideoSeqElements pAlternativeVideoSeq;
	private final VideoDescriptionElements pVideoDescription;
	private final FilterElements pFilter;
	private final TerminalRule tLEFT_BRACKET;
	private final TerminalRule tRIGHT_BRACKET;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public VideoGenGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pVideoGeneratorModel = new VideoGeneratorModelElements();
		this.pVideoGenInformation = new VideoGenInformationElements();
		this.pVideoSeq = new VideoSeqElements();
		this.pMandatoryVideoSeq = new MandatoryVideoSeqElements();
		this.pOptionalVideoSeq = new OptionalVideoSeqElements();
		this.pAlternativeVideoSeq = new AlternativeVideoSeqElements();
		this.pVideoDescription = new VideoDescriptionElements();
		this.pFilter = new FilterElements();
		this.tLEFT_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.VideoGen.LEFT_BRACKET");
		this.tRIGHT_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.VideoGen.RIGHT_BRACKET");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.VideoGen".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//VideoGeneratorModel:
	//	{VideoGeneratorModel} information=VideoGenInformation?
	//	'VideoGen' LEFT_BRACKET
	//	videoseqs+=VideoSeq+
	//	RIGHT_BRACKET;
	public VideoGeneratorModelElements getVideoGeneratorModelAccess() {
		return pVideoGeneratorModel;
	}
	
	public ParserRule getVideoGeneratorModelRule() {
		return getVideoGeneratorModelAccess().getRule();
	}

	//VideoGenInformation:
	//	{VideoGenInformation} ('@author' authorName=STRING) ('@version' version=STRING)? ('@creation' creationDate=STRING)?;
	public VideoGenInformationElements getVideoGenInformationAccess() {
		return pVideoGenInformation;
	}
	
	public ParserRule getVideoGenInformationRule() {
		return getVideoGenInformationAccess().getRule();
	}

	//VideoSeq:
	//	MandatoryVideoSeq | OptionalVideoSeq | AlternativeVideoSeq;
	public VideoSeqElements getVideoSeqAccess() {
		return pVideoSeq;
	}
	
	public ParserRule getVideoSeqRule() {
		return getVideoSeqAccess().getRule();
	}

	//MandatoryVideoSeq:
	//	'mandatory' description=VideoDescription;
	public MandatoryVideoSeqElements getMandatoryVideoSeqAccess() {
		return pMandatoryVideoSeq;
	}
	
	public ParserRule getMandatoryVideoSeqRule() {
		return getMandatoryVideoSeqAccess().getRule();
	}

	//OptionalVideoSeq:
	//	'optional' description=VideoDescription;
	public OptionalVideoSeqElements getOptionalVideoSeqAccess() {
		return pOptionalVideoSeq;
	}
	
	public ParserRule getOptionalVideoSeqRule() {
		return getOptionalVideoSeqAccess().getRule();
	}

	//AlternativeVideoSeq:
	//	'alternatives' videoid=ID? LEFT_BRACKET videodescs+=VideoDescription+ RIGHT_BRACKET;
	public AlternativeVideoSeqElements getAlternativeVideoSeqAccess() {
		return pAlternativeVideoSeq;
	}
	
	public ParserRule getAlternativeVideoSeqRule() {
		return getAlternativeVideoSeqAccess().getRule();
	}

	//VideoDescription:
	//	'videoseq' videoid=ID? location=STRING (LEFT_BRACKET ('duration' duration=INT)? ('probability' probability=INT)?
	//	('size' size=INT)? ('description' description=STRING)? ('filters' filters+=Filter+)?
	//	RIGHT_BRACKET)?;
	public VideoDescriptionElements getVideoDescriptionAccess() {
		return pVideoDescription;
	}
	
	public ParserRule getVideoDescriptionRule() {
		return getVideoDescriptionAccess().getRule();
	}

	//Filter:
	//	LEFT_BRACKET
	//	filter=STRING
	//	RIGHT_BRACKET;
	public FilterElements getFilterAccess() {
		return pFilter;
	}
	
	public ParserRule getFilterRule() {
		return getFilterAccess().getRule();
	}

	//terminal LEFT_BRACKET:
	//	'{';
	public TerminalRule getLEFT_BRACKETRule() {
		return tLEFT_BRACKET;
	} 

	//terminal RIGHT_BRACKET:
	//	'}';
	public TerminalRule getRIGHT_BRACKETRule() {
		return tRIGHT_BRACKET;
	} 

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
