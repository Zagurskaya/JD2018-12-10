package by.it.a_khmelev.project06.java.controller;

import by.it.a_khmelev.project06.java.beans.User;
import by.it.a_khmelev.project06.java.dao.Dao;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

public class CmdLogin implements Cmd {
    @Override
    public Action execute(HttpServletRequest req) throws Exception {
        if (Form.isPost(req)) {
            String login = Form.getString(req, "login", "[a-zA-Z0-9_-]{5,}");
            String password = Form.getString(req, "password");
            Dao dao = Dao.getDao();
            String where = String.format(
                    " WHERE `login`='%s' AND `password`='%s'",
                    login, password);
            List<User> users = dao.user.getAll(where);
            if (users.size() > 0) {
                User user = users.get(0);
                HttpSession session = req.getSession();
                session.setAttribute("user",user);

                return Action.PROFILE;
            }
        }

        return Action.LOGIN;

    }
}
