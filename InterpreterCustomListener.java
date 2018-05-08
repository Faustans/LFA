import java.io.File;
import java.io.IOException;
import java.lang.Math.*;
import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

public class InterpreterCustomListener extends InterpreterBaseListener {
  private ParseTreeProperty<Map<String, ArrayList<String>>> parseTree = new ParseTreeProperty<Map<String, ArrayList<String>> >();
  private ParseTreeProperty<String> parseTreeElement = new ParseTreeProperty<String>();
  private Map<String, Map<String, ArrayList<String>>> varMap = new LinkedHashMap<>();
	@Override public void exitProgram(InterpreterParser.ProgramContext ctx) {}
	@Override public void exitStatAssign(InterpreterParser.StatAssignContext ctx) {

  }
	@Override public void exitStatExpr(InterpreterParser.StatExprContext ctx) {

  }
	@Override public void exitStatLoad(InterpreterParser.StatLoadContext ctx) {

  }
	@Override public void exitStatSave(InterpreterParser.StatSaveContext ctx) {

  }
	@Override public void exitPrintConsole(InterpreterParser.PrintConsoleContext ctx) {

  }
	@Override public void exitPrintFile(InterpreterParser.PrintFileContext ctx) {

  }
	@Override public void exitAssignExpr(InterpreterParser.AssignExprContext ctx) {

  }
	@Override public void exitAssignCSV(InterpreterParser.AssignCSVContext ctx) {

  }
	@Override public void exitExprSelect(InterpreterParser.ExprSelectContext ctx) {

  }
	@Override public void exitExprUnite(InterpreterParser.ExprUniteContext ctx) {

  }
	@Override public void exitExprArith(InterpreterParser.ExprArithContext ctx) {

  }
	@Override public void exitExprText(InterpreterParser.ExprTextContext ctx) {

  }
	@Override public void exitExprTable(InterpreterParser.ExprTableContext ctx) {

  }
	@Override public void exitLoad(InterpreterParser.LoadContext ctx) {

  }
	@Override public void exitSave(InterpreterParser.SaveContext ctx) {

  }
	@Override public void exitMultAr(InterpreterParser.MultArContext ctx) {

  }
	@Override public void exitDivAr(InterpreterParser.DivArContext ctx) {

  }
	@Override public void exitRemAr(InterpreterParser.RemArContext ctx) {

  }
	@Override public void exitPowerAr(InterpreterParser.PowerArContext ctx) {

  }
	@Override public void exitPlusAr(InterpreterParser.PlusArContext ctx) {

  }
	@Override public void exitMinusAr(InterpreterParser.MinusArContext ctx) {

  }
	@Override public void exitConcatExpr(InterpreterParser.ConcatExprContext ctx) {

  }
	@Override public void exitDeleteExpr(InterpreterParser.DeleteExprContext ctx) {

  }
	@Override public void exitInvertExpr(InterpreterParser.InvertExprContext ctx) {

  }
	@Override public void exitSelectC(InterpreterParser.SelectCContext ctx) {

  }
	@Override public void exitUnite(InterpreterParser.UniteContext ctx) {

  }
	@Override public void exitAccess(InterpreterParser.AccessContext ctx) {

  }
	@Override public void exitTableID(InterpreterParser.TableIDContext ctx) {
    parseTreeElement.put(ctx,ctx.ID().getText());
    if(varMap.containsKey(ctx.ID().getText())){
      parseTree.put(ctx, varMap.get(ctx.ID().getText()));
    }
    else{
      System.err.println("Could not find variable \"" + ctx.ID().getText()+  "\"");
    }
  }
	@Override public void exitTableCSV(InterpreterParser.TableCSVContext ctx) {
    try{
      File f = new File(ctx.CSV().getText());
      if(f.exists()){
        parseTreeElement.put(ctx,ctx.CSV().getText());
        readCSV csv = new readCSV();
        parseTree.put(ctx,csv.read(ctx.CSV().getText()));
      }
      else{
        System.err.println("File \"" + ctx.CSV().getText()+  "\" does not exist");
      }
    }catch(IOException error){
      System.err.println(error);
    }
  }
	@Override public void visitErrorNode(ErrorNode node) {}
}
