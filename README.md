Se recomienda tener la version de apache IDE 22 y la version 22.0.2
Se agrego una dependencia de dataFaker, en caso de no tenerla ir al archivo proyectFiles y luego a pom.xml, una vez ahi pegar este texto debajo de </properties>
    <dependencies>
        <dependency>
            <groupId>net.datafaker</groupId>
            <artifactId>datafaker</artifactId>
            <version>1.9.0</version>
        </dependency>
    </dependencies>
Luego dar click en la opcion Build with dependencies, si no funciona buscar build and clean.
