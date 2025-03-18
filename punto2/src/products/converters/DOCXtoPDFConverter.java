package products.converters;

import products.documents.Document;
import products.documents.DocumentDOCX;
import products.documents.DocumentPDF;

public class DOCXtoPDFConverter implements Converter {
    private DocumentDOCX documentDOCX;
    @Override
    public Document convertDocument(Document document) {
        this.documentDOCX = (DocumentDOCX) document;
        System.out.println("Convirtiendo DOCX a PDF...");
        System.out.println("¡Conversión exitosa!");
        return new DocumentPDF(
                this.documentDOCX.getColumns(),
                this.documentDOCX.getRows(),
                this.documentDOCX.getTables(),
                this.documentDOCX.getContent(),
                this.documentDOCX.getStyles(),
                this.documentDOCX.getTitle()
        );
    }
}
