package by.it.migunko.calc_v2_with_exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parcer {
    Var calc(String expression) throws CalcException{
        String[] operand = expression.split(Patterns.OPERATION);
        Var one = Var.createVar(operand[0]);
        Var two = Var.createVar(operand[1]);
        if (expression.contains("=")){
            return Var.saveVar(operand[0],two);
        }
        if (one == null || two == null){
            throw new CalcException("Один из операндов равен нулю");
        }
        Pattern p = Pattern.compile(Patterns.OPERATION);
        Matcher m = p.matcher(expression);
        if (m.find()){
            String operation = m.group();
            switch (operation){
                case "+": return one.add(two);
                case "-": return one.sub(two);
                case "*": return one.mul(two);
                case "/": return one.div(two);
            }
        }
        return null;
    }
}
