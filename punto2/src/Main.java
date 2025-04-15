import builders.Builder;
import factorys.builder.FactoryBuilder;
import factorys.builder.FactoryDOCXBuilder;
import factorys.builder.FactoryXLSXBuilder;
import factorys.builder.FactoryXMLBuilder;
import director.Director;
import factorys.convert.FactoryConverter;
import factorys.convert.FactoryDOCXtoPDFConverter;
import factorys.convert.FactoryXLSXtoPDFConverter;
import factorys.convert.FactoryXMLtoPDFConverter;
import products.converters.Converter;
import products.documents.Document;

public class Main {
    public static FactoryBuilder factoryBuilder;
    public static Builder builder;
    public static Document document;
    public static FactoryConverter factoryConverter;
    public static Converter converter;

    public static void choseDocumentType(String type) {
        switch (type) {
            case "XLSX":
                factoryBuilder = new FactoryXLSXBuilder();
                factoryConverter = new FactoryXLSXtoPDFConverter();
                return;
            case "DOCX":
                factoryBuilder = new FactoryDOCXBuilder();
                factoryConverter = new FactoryDOCXtoPDFConverter();
                return;
            case "XML":
                factoryBuilder = new FactoryXMLBuilder();
                factoryConverter = new FactoryXMLtoPDFConverter();
                return;
            default:
                System.out.println("Escoge un formato correcto por favor");
        }
    }
    public static void main(String[] args) {
        // El usuario escoge el tipo de formato de origen con el que desea trabajar
        choseDocumentType("DOCX");
        // Instanciamos la clase directora
        Director director = new Director();

        // Validamos si fueron creadas, si no, no deja seguir
        if (factoryBuilder == null && factoryConverter == null) {
            return;
        }
        // Creamos las fabricas
        builder = factoryBuilder.createBuilder();
        converter = factoryConverter.createConverter();
        // Escogemos una plantilla
        director.createWithRows(builder);

        // Obtenemos el documento resultante
        document = builder.getResult();

        // Imprimimos el documento para ver su contenido
        System.out.println(document.toString());

        // Convertimos el documento a PDF
        converter.convertDocument(document);
    }
}