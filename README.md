querydsl-groovy-maven
=====================

Sample using QueryDSL APT processing in a Groovy and Maven project.

`Foo` is an `@Entity`. `QFoo` is a QueryDSL query object for `Foo` generated with APT (JSR-269).
The annotation processor used is declared in `com.querydsl:querydsl-apt` in `META-INF/services/javax.annotation.processing.Processor`.
`QFoo` is also referenced by `FooRepository` to prove that it's generated and compiled on the fly
and can be safely used in other classes, even within the same project and source directory.
Also as an example `generatedSourcesDirectory` is changed in `groovy-eclipse-compiler` configuration
to prove that plugin configuration is applied to the annotation processor as well.

Tested with:

```
$ mvn -version
Apache Maven 3.3.3 (7994120775791599e205a5524ec3e0dfe41d4a06; 2015-04-22T13:57:37+02:00)
Java version: 1.8.0_60, vendor: Oracle Corporation
```
