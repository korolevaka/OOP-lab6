package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.TableModel;
import service.TableService;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/table")
public class TableServlet extends HttpServlet {
    private final TableService tableService = new TableService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("index.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String rowsStr = req.getParameter("rows");
        String columnsStr = req.getParameter("columns");
        String color = req.getParameter("color");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        try {
            int rows = Integer.parseInt(rowsStr);
            int columns = Integer.parseInt(columnsStr);

            TableModel table = new TableModel(title, rows, columns, color);

            out.println(tableService.createTable(table));

        } catch (NumberFormatException e) {
            out.println("<p>Ошибка: Введите корректные числа для строк и столбцов.</p>");
        }
    }
}
