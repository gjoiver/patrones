package factorys.builder;

import builders.Builder;
import builders.XLSXBuilder;

public class FactoryXLSXBuilder extends FactoryBuilder {
    @Override
    public Builder createBuilder() {
        return new XLSXBuilder();
    }
}
