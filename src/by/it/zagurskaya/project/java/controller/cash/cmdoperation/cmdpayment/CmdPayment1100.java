package by.it.zagurskaya.project.java.controller.cash.cmdoperation.cmdpayment;

import by.it.zagurskaya.project.java.controller.Action;
import by.it.zagurskaya.project.java.controller.Cmd;

import javax.servlet.http.HttpServletRequest;

public class CmdPayment1100 implements Cmd {
    @Override
    public Action execute(HttpServletRequest req) throws Exception {
        Action.REPORT.setPATH("/cash/");
        return Action.REPORT;
    }
}
