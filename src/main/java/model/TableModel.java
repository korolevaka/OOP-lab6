package model;

public class TableModel {
    private String name;
    private int rows;
    private int columns;
    private String color;

    public TableModel(String name, int rows, int columns, String color) {
        this.name = name;
        this.rows = rows;
        this.columns = columns;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public String getColor() {
        return color;
    }
}
