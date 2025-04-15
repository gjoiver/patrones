package builders;

import products.documents.Document;

public interface Builder {
    public Builder setColumns(Integer columns);
    public Builder setRows(Integer rows);
    public Builder setTables(String tables);
    public Builder setContent(String content);
    public Builder setStyles(String styles);
    public Builder setTitle(String title);

    public Document getResult();
}
