package factorys.convert;

import products.converters.Converter;
import products.converters.XMLtoPDFConverter;

public class FactoryXMLtoPDFConverter extends FactoryConverter {

    @Override
    public Converter createConverter() {
        return new XMLtoPDFConverter();
    }
}
