package by.it.titkovskaya.jd03_04.java;

import javax.servlet.http.HttpServletRequest;

public class CmdError implements Cmd{
    @Override
    public Action execute(HttpServletRequest req) throws Exception {
        return Action.ERROR;
    }
}
