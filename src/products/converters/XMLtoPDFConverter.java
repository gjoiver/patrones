package products.converters;

import products.documents.Document;
import products.documents.DocumentPDF;
import products.documents.DocumentXML;

public class XMLtoPDFConverter implements Converter {
    private DocumentXML documentXML;
    @Override
    public Document convertDocument(Document document) {
        this.documentXML = (DocumentXML) document;
        System.out.println("Convirtiendo XML a PDF...");
        System.out.println("¡Conversión exitosa!");
        return new DocumentPDF(
                this.documentXML.getColumns(),
                this.documentXML.getRows(),
                this.documentXML.getTables(),
                this.documentXML.getContent(),
                this.documentXML.getStyles(),
                this.documentXML.getTitle()
        );
    }
}
