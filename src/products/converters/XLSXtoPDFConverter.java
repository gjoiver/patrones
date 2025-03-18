package products.converters;

import products.documents.Document;
import products.documents.DocumentPDF;
import products.documents.DocumentXLSX;

public class XLSXtoPDFConverter implements Converter {
    private DocumentXLSX documentXLSX;
    @Override
    public Document convertDocument(Document document) {
        this.documentXLSX = (DocumentXLSX) document;
        System.out.println("Convirtiendo XLSX a PDF...");
        System.out.println("¡Conversión exitosa!");
        return new DocumentPDF(
                this.documentXLSX.getColumns(),
                this.documentXLSX.getRows(),
                this.documentXLSX.getTables(),
                this.documentXLSX.getContent(),
                this.documentXLSX.getStyles(),
                this.documentXLSX.getTitle()
        );
    }
}
