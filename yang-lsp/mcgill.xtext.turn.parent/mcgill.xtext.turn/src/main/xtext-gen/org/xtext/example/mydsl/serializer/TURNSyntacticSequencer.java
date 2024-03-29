/*
 * generated by Xtext 2.15.0-SNAPSHOT
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.TURNGrammarAccess;

@SuppressWarnings("all")
public class TURNSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TURNGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AndFork_EndPoint_FailurePoint_StartPoint_WaitingPlace_FailKeyword_0_or_StartKeyword_0_0_or_WaitKeyword_1_or___AndKeyword_0_LeftCurlyBracketKeyword_2_RightCurlyBracketKeyword_4___or___EndKeyword_0_FullStopKeyword_3__;
	protected AbstractElementAlias match_AndFork_FailurePoint_StartPoint_WaitingPlace___FailKeyword_0_or_StartKeyword_0_0_or_WaitKeyword_1_or___AndKeyword_0_LeftCurlyBracketKeyword_2_RightCurlyBracketKeyword_4____q;
	protected AbstractElementAlias match_AndJoin_SyncKeyword_0_1_or_SynchKeyword_0_0_or_VerticalLineKeyword_0_2;
	protected AbstractElementAlias match_ComponentRef_ProtectedKeyword_0_q;
	protected AbstractElementAlias match_Condition___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	protected AbstractElementAlias match_FailurePoint_WaitingPlace_FailKeyword_0_or_WaitKeyword_1;
	protected AbstractElementAlias match_PathWithReferencedEnd_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_StartPoint_WaitingPlace_StartKeyword_0_0_or_WaitKeyword_1;
	protected AbstractElementAlias match_Stub___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q;
	protected AbstractElementAlias match_Timer_TimeoutKeyword_4_1_q;
	protected AbstractElementAlias match_Timer___LeftCurlyBracketKeyword_4_0_TimeoutKeyword_4_1_q_RightCurlyBracketKeyword_4_4__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TURNGrammarAccess) access;
		match_AndFork_EndPoint_FailurePoint_StartPoint_WaitingPlace_FailKeyword_0_or_StartKeyword_0_0_or_WaitKeyword_1_or___AndKeyword_0_LeftCurlyBracketKeyword_2_RightCurlyBracketKeyword_4___or___EndKeyword_0_FullStopKeyword_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getAndForkAccess().getAndKeyword_0()), new TokenAlias(false, false, grammarAccess.getAndForkAccess().getLeftCurlyBracketKeyword_2()), new TokenAlias(false, false, grammarAccess.getAndForkAccess().getRightCurlyBracketKeyword_4())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEndPointAccess().getEndKeyword_0()), new TokenAlias(false, false, grammarAccess.getEndPointAccess().getFullStopKeyword_3())), new TokenAlias(false, false, grammarAccess.getFailurePointAccess().getFailKeyword_0()), new TokenAlias(false, false, grammarAccess.getStartPointAccess().getStartKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getWaitingPlaceAccess().getWaitKeyword_1()));
		match_AndFork_FailurePoint_StartPoint_WaitingPlace___FailKeyword_0_or_StartKeyword_0_0_or_WaitKeyword_1_or___AndKeyword_0_LeftCurlyBracketKeyword_2_RightCurlyBracketKeyword_4____q = new AlternativeAlias(false, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getAndForkAccess().getAndKeyword_0()), new TokenAlias(false, false, grammarAccess.getAndForkAccess().getLeftCurlyBracketKeyword_2()), new TokenAlias(false, false, grammarAccess.getAndForkAccess().getRightCurlyBracketKeyword_4())), new TokenAlias(false, false, grammarAccess.getFailurePointAccess().getFailKeyword_0()), new TokenAlias(false, false, grammarAccess.getStartPointAccess().getStartKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getWaitingPlaceAccess().getWaitKeyword_1()));
		match_AndJoin_SyncKeyword_0_1_or_SynchKeyword_0_0_or_VerticalLineKeyword_0_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAndJoinAccess().getSyncKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getAndJoinAccess().getSynchKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getAndJoinAccess().getVerticalLineKeyword_0_2()));
		match_ComponentRef_ProtectedKeyword_0_q = new TokenAlias(false, true, grammarAccess.getComponentRefAccess().getProtectedKeyword_0());
		match_Condition___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_3_2()));
		match_FailurePoint_WaitingPlace_FailKeyword_0_or_WaitKeyword_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFailurePointAccess().getFailKeyword_0()), new TokenAlias(false, false, grammarAccess.getWaitingPlaceAccess().getWaitKeyword_1()));
		match_PathWithReferencedEnd_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getPathWithReferencedEndAccess().getSemicolonKeyword_1_1());
		match_StartPoint_WaitingPlace_StartKeyword_0_0_or_WaitKeyword_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getStartPointAccess().getStartKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getWaitingPlaceAccess().getWaitKeyword_1()));
		match_Stub___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStubAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getStubAccess().getRightCurlyBracketKeyword_4_2()));
		match_Timer_TimeoutKeyword_4_1_q = new TokenAlias(false, true, grammarAccess.getTimerAccess().getTimeoutKeyword_4_1());
		match_Timer___LeftCurlyBracketKeyword_4_0_TimeoutKeyword_4_1_q_RightCurlyBracketKeyword_4_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTimerAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, true, grammarAccess.getTimerAccess().getTimeoutKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getTimerAccess().getRightCurlyBracketKeyword_4_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getArrowRule())
			return getArrowToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Arrow:
	 * 	'->';
	 */
	protected String getArrowToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "->";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AndFork_EndPoint_FailurePoint_StartPoint_WaitingPlace_FailKeyword_0_or_StartKeyword_0_0_or_WaitKeyword_1_or___AndKeyword_0_LeftCurlyBracketKeyword_2_RightCurlyBracketKeyword_4___or___EndKeyword_0_FullStopKeyword_3__.equals(syntax))
				emit_AndFork_EndPoint_FailurePoint_StartPoint_WaitingPlace_FailKeyword_0_or_StartKeyword_0_0_or_WaitKeyword_1_or___AndKeyword_0_LeftCurlyBracketKeyword_2_RightCurlyBracketKeyword_4___or___EndKeyword_0_FullStopKeyword_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AndFork_FailurePoint_StartPoint_WaitingPlace___FailKeyword_0_or_StartKeyword_0_0_or_WaitKeyword_1_or___AndKeyword_0_LeftCurlyBracketKeyword_2_RightCurlyBracketKeyword_4____q.equals(syntax))
				emit_AndFork_FailurePoint_StartPoint_WaitingPlace___FailKeyword_0_or_StartKeyword_0_0_or_WaitKeyword_1_or___AndKeyword_0_LeftCurlyBracketKeyword_2_RightCurlyBracketKeyword_4____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AndJoin_SyncKeyword_0_1_or_SynchKeyword_0_0_or_VerticalLineKeyword_0_2.equals(syntax))
				emit_AndJoin_SyncKeyword_0_1_or_SynchKeyword_0_0_or_VerticalLineKeyword_0_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ComponentRef_ProtectedKeyword_0_q.equals(syntax))
				emit_ComponentRef_ProtectedKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Condition___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_Condition___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_FailurePoint_WaitingPlace_FailKeyword_0_or_WaitKeyword_1.equals(syntax))
				emit_FailurePoint_WaitingPlace_FailKeyword_0_or_WaitKeyword_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PathWithReferencedEnd_SemicolonKeyword_1_1_q.equals(syntax))
				emit_PathWithReferencedEnd_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_StartPoint_WaitingPlace_StartKeyword_0_0_or_WaitKeyword_1.equals(syntax))
				emit_StartPoint_WaitingPlace_StartKeyword_0_0_or_WaitKeyword_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Stub___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q.equals(syntax))
				emit_Stub___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timer_TimeoutKeyword_4_1_q.equals(syntax))
				emit_Timer_TimeoutKeyword_4_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Timer___LeftCurlyBracketKeyword_4_0_TimeoutKeyword_4_1_q_RightCurlyBracketKeyword_4_4__q.equals(syntax))
				emit_Timer___LeftCurlyBracketKeyword_4_0_TimeoutKeyword_4_1_q_RightCurlyBracketKeyword_4_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'start' | 'wait' | 'fail' | ('end' '.') | ('and' '{' '}')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_AndFork_EndPoint_FailurePoint_StartPoint_WaitingPlace_FailKeyword_0_or_StartKeyword_0_0_or_WaitKeyword_1_or___AndKeyword_0_LeftCurlyBracketKeyword_2_RightCurlyBracketKeyword_4___or___EndKeyword_0_FullStopKeyword_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('start' | 'wait' | 'fail' | ('and' '{' '}'))?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_AndFork_FailurePoint_StartPoint_WaitingPlace___FailKeyword_0_or_StartKeyword_0_0_or_WaitKeyword_1_or___AndKeyword_0_LeftCurlyBracketKeyword_2_RightCurlyBracketKeyword_4____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'synch' | 'sync' | '|'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=QualifiedName
	 */
	protected void emit_AndJoin_SyncKeyword_0_1_or_SynchKeyword_0_0_or_VerticalLineKeyword_0_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'protected'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) kind=COMPONENTKIND
	 *     (rule start) (ambiguity) name=QualifiedName
	 */
	protected void emit_ComponentRef_ProtectedKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     expression=Text ']' (ambiguity) (rule end)
	 */
	protected void emit_Condition___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'wait' | 'fail'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_FailurePoint_WaitingPlace_FailKeyword_0_or_WaitKeyword_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) Arrow (ambiguity) (rule start)
	 *     (rule start) Arrow (ambiguity) pathEnd=RegularEnd
	 *     index=PositiveInteger ';' (ambiguity) (rule end)
	 *     index=PositiveInteger ';' (ambiguity) pathEnd=RegularEnd
	 *     pathNodes+=PathBodyNode '->' (ambiguity) (rule end)
	 *     pathNodes+=PathBodyNode '->' (ambiguity) pathEnd=RegularEnd
	 */
	protected void emit_PathWithReferencedEnd_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'start' | 'wait'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_StartPoint_WaitingPlace_StartKeyword_0_0_or_WaitKeyword_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     params=StubParameters (ambiguity) (rule end)
	 *     params=StubParameters (ambiguity) connectingStubBody=PathBody
	 *     stubRef=[StubDeclaration|QualifiedName] (ambiguity) (rule end)
	 *     stubRef=[StubDeclaration|QualifiedName] (ambiguity) connectingStubBody=PathBody
	 */
	protected void emit_Stub___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'timeout'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'timer' '{' (ambiguity) timeoutCondition=Condition
	 *     (rule start) 'timer' '{' (ambiguity) timeoutPath=PathBody
	 *     kind=WAITKIND 'timer' '{' (ambiguity) timeoutCondition=Condition
	 *     kind=WAITKIND 'timer' '{' (ambiguity) timeoutPath=PathBody
	 *     longName=LongName '{' (ambiguity) timeoutCondition=Condition
	 *     longName=LongName '{' (ambiguity) timeoutPath=PathBody
	 */
	protected void emit_Timer_TimeoutKeyword_4_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' 'timeout'? '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'timer' (ambiguity) (rule start)
	 *     (rule start) 'timer' (ambiguity) condition=Condition
	 *     kind=WAITKIND 'timer' (ambiguity) (rule end)
	 *     kind=WAITKIND 'timer' (ambiguity) condition=Condition
	 *     longName=LongName (ambiguity) (rule end)
	 *     longName=LongName (ambiguity) condition=Condition
	 */
	protected void emit_Timer___LeftCurlyBracketKeyword_4_0_TimeoutKeyword_4_1_q_RightCurlyBracketKeyword_4_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
