package controllers;

import model.MatrixСipher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class IndexController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        MatrixСipher matrixСipher = new MatrixСipher(req.getParameter("key"), req.getParameter("value"));
        req.setAttribute("encryptedData", matrixСipher.getEncryptedData(req.getParameter("pattern")));
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
}
