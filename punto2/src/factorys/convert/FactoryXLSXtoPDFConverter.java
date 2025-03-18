package factorys.convert;

import products.converters.Converter;
import products.converters.XLSXtoPDFConverter;

public class FactoryXLSXtoPDFConverter extends FactoryConverter {
    @Override
    public Converter createConverter() {
        return new XLSXtoPDFConverter();
    }
}
