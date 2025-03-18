package factorys.convert;

import products.converters.Converter;
import products.documents.Document;

public abstract class FactoryConverter {
    public abstract Converter createConverter();
}
