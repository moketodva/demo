1、@Autowired 是Spring 注解。根据type找Bean，可配合 @Qualifier 注解来根据name找Bean；注解参数可指定required是否必须从容器中找到该Bean

2、@Resource 是Java 注解，JSR-250 规范的实现。默认先根据name找Bean，找不到再根据type找Bean；注解参数可指定name或者type

3、@Inject 是Java 注解，JSR-330 规范的实现。根据type找Bean，可配合 @Named 注解来根据name找Bean