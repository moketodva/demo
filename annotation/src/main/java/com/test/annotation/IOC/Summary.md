1、@Configuration借助BeanFactoryPostProcessor + AOP实现功能

2、@Configuration相比@Component，调用@Bean所修饰的方法并不会生成一个新的对象，而是会从容器中获取，就是借助Aop增强该方法

3、@Bean修饰的方法中参数默认使用@Autowired从容器中提取注入,可以使用@Qualifier指定Bean的name

4、@Controller、@Service、@Repository本质都是@Component注解，所以不再介绍。@Configuration也是

5、@Import 4.2后可以导入普通类，就是将该普通类置入容器