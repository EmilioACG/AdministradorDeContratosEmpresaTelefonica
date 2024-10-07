Se recomienda tener la version de apache IDE 22 y la version java 22.0.2
Se agregaron las dependencias de dataFaker y de openCsv
En caso de no tenerlas ir al archivo proyectFiles, luego a pom.xml y una vez ahi pegar el texto de abajo en el apartado de <dependencies>

    <dependencies>
        <dependency>
            <groupId>net.datafaker</groupId>
            <artifactId>datafaker</artifactId>
            <version>1.9.0</version>
        </dependency>
        <dependency>
            <groupId>com.opencsv</groupId>
            <artifactId>opencsv</artifactId>
            <version>5.9</version>
        </dependency>
    </dependencies>
    
Luego dar click en la opcion Build with dependencies, si no funciona buscar build and clean.
