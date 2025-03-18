package factorys.builder;

import builders.Builder;
import builders.DOCXBuilder;

public class FactoryDOCXBuilder extends FactoryBuilder {
    @Override
    public Builder createBuilder() {
        return new DOCXBuilder();
    }
}
