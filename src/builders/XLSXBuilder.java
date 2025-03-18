package builders;

import products.documents.DocumentXLSX;

public class XLSXBuilder implements Builder {
    Integer columns;
    Integer rows;
    String tables;
    String content;
    String styles;
    String title;


    @Override
    public Builder setColumns(Integer columns) {
        this.columns = columns;
        return this;
    }

    @Override
    public Builder setRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    @Override
    public Builder setTables(String tables) {
        this.tables = tables;
        return this;
    }

    @Override
    public Builder setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public Builder setStyles(String styles) {
        this.styles = styles;
        return this;
    }

    @Override
    public Builder setTitle(String title) {
        this.title = title;
        return this;
    }

    public DocumentXLSX getResult() {
        return new DocumentXLSX(columns, rows, tables, content, styles, title);
    }
}
