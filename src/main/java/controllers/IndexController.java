package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.WordsMatrix;

public class IndexController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        WordsMatrix wordsMatrix =
                new WordsMatrix(req.getParameter("key"), req.getParameter("value"));
        req.setAttribute("encryptedData", wordsMatrix
                .getEncryptedData(req.getParameter("pattern")));
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
}
