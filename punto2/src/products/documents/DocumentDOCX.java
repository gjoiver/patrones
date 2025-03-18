package products.documents;

public class DocumentDOCX implements Document {
    private Integer columns;
    private Integer rows;
    private String tables;
    private String content;
    private String styles;
    private String title;

    public DocumentDOCX(Integer columns, Integer rows, String tables, String content, String styles, String title) {
        this.columns = columns;
        this.rows = rows;
        this.tables = tables;
        this.content = content;
        this.styles = styles;
        this.title = title;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getTables() {
        return tables;
    }

    public void setTables(String tables) {
        this.tables = tables;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStyles() {
        return styles;
    }

    public void setStyles(String styles) {
        this.styles = styles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DocumentDOCX{" +
                "columns=" + columns +
                ", rows=" + rows +
                ", tables='" + tables + '\'' +
                ", content='" + content + '\'' +
                ", styles='" + styles + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public void write(String content) {
        System.out.println("Se guardó: " + content);
    }

    @Override
    public String read() {
        return "Documento DOCX leído";
    }
}
