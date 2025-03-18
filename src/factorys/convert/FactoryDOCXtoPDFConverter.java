package factorys.convert;

import products.converters.Converter;
import products.converters.DOCXtoPDFConverter;

public class FactoryDOCXtoPDFConverter extends FactoryConverter {
    @Override
    public Converter createConverter() {
        return new DOCXtoPDFConverter();
    }
}
