spring-example00
================

Application context wiring shows XML configuration.

Becomes verbose but there are Spring references in the 'beans'.

The test class uses autowired for just the test cases.

The Provider<LocalDate> is proxied to the ApplicationContext and creates new instance of the bean each time Provider.get is called.

