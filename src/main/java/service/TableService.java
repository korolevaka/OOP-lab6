package service;

import model.TableModel;

public class TableService {
    public String createTable(TableModel table) {
        StringBuilder html = new StringBuilder();
        html.append("<html><head><meta charset='UTF-8'><title>Сгенерированная таблица</title></head><body>");
        html.append("<h1>").append(table.getName()).append("</h1>");
        html.append("<table border='1' style='border-collapse: collapse; background-color: ")
                .append(table.getColor()).append(";'>");

        for (int i = 0; i < table.getRows(); i++) {
            html.append("<tr>");
            for (int j = 0; j < table.getColumns(); j++) {
                html.append("<td style='width: 50px; height: 30px; text-align: center;'></td>");
            }
            html.append("</tr>");
        }

        html.append("</table>");
        html.append("<br><a href='index.html'>Назад</a>");
        html.append("</body></html>");
        return html.toString();
    }
}
