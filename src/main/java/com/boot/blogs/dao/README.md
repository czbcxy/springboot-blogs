**持久化部分JPA**
    UserDaoImpl持久化接口实现EntityManager中的映射方法； 
    EntityManager会自动跟踪实体类(实体类中一定要加Entity注解标识)，
    并进行类似herbernate映射到Repository实现类中，进行持久化映射；
    Repositoty实体类中
        CRUDRepository增删改查接口 （继承Repositoty）
            PagingAndSortingRepository分页和排序接口（继承CRUDRepository）
    (自定义接口)
        继承或者实现其自类
        
        
        
        
        
