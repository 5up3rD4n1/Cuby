/**
 * Created by badsa on 20/05/15.
 */

import org.antlr.v4.runtime.DefaultErrorStrategy
import org.antlr.v4.runtime.FailedPredicateException
import org.antlr.v4.runtime.InputMismatchException
import org.antlr.v4.runtime.NoViableAltException
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.RecognitionException
import org.antlr.v4.runtime.Token
import org.antlr.v4.runtime.misc.IntervalSet

class CubyParserErrorStrategy  extends DefaultErrorStrategy {


    // Overrides the reportNoViableAlternative method, changing the error message to spanish.
    @Override
    public void reportNoViableAlternative(Parser parser,
                                          NoViableAltException e)
            throws RecognitionException
    {
        String msg = "Revise su sintáxis cerca de ${getTokenErrorDisplay(e.getOffendingToken())}"; // nonstandard msg
        parser.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }



    // Overrides the reportInputMismatch method, changing the error message to spanish.
    @Override
    public void reportInputMismatch(Parser recognizer,
                                    InputMismatchException e)
    {
        String msg = "Encontré ${getTokenErrorDisplay(e.getOffendingToken())}, estaba esperando "+
                "algo como: \n  "+e.getExpectedTokens().toString(recognizer.getVocabulary());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    public void reportUnwantedToken(Parser recognizer) {
        if (inErrorRecoveryMode(recognizer)) {
            return;
        }
        beginErrorCondition(recognizer);
        Token t = recognizer.getCurrentToken();
        String tokenName = getTokenErrorDisplay(t);
        IntervalSet expecting = getExpectedTokens(recognizer);
        String msg = "El token "+tokenName+" es una sorpresa para mi, estaba esperando algo como:  \n  "+
                expecting.toString(recognizer.getVocabulary());
        recognizer.notifyErrorListeners(t, msg, null);
    }



    @Override
    public void reportFailedPredicate(Parser recognizer,
                                      FailedPredicateException e)
    {
        String ruleName = recognizer.getRuleNames()[recognizer._ctx.getRuleIndex()];
        String msg = "El predicado "+ruleName+" no se lleva bien con la entrada "+getTokenErrorDisplay(e.getOffendingToken());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }



    @Override
    public void reportMissingToken(Parser recognizer) {
        if (inErrorRecoveryMode(recognizer)) {
            return;
        }
        beginErrorCondition(recognizer);
        Token t = recognizer.getCurrentToken();
        IntervalSet expecting = getExpectedTokens(recognizer);
        String msg = "Falta el token "+expecting.toString(recognizer.getVocabulary())+
                " antes de "+getTokenErrorDisplay(t);
        recognizer.notifyErrorListeners(t, msg, null);
    }



}
