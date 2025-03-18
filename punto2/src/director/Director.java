package director;

import builders.Builder;

public class Director {

    public Builder createWithTables(Builder builder) {
        builder.setTitle("Documento con tablas").setContent("Contenido con tablas").setTables("Tabla 1, Tabla 2");

        return builder;
    }

    public Builder createWithRows(Builder builder) {
        builder.setTitle("Documento con rows").setContent("Contenido con rows").setRows(10);

        return builder;
    }

    public Builder createWithStyle(Builder builder) {
        builder.setTitle("Documento con estilos").setContent("Contenido con estilos").setStyles("Estilo 1");

        return builder;
    }
}
