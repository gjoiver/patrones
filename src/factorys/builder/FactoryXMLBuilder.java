package factorys.builder;

import builders.Builder;
import builders.XMLBuilder;

public class FactoryXMLBuilder extends FactoryBuilder {
    @Override
    public Builder createBuilder() {
        return new XMLBuilder();
    }
}
