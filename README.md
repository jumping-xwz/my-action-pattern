# my-action-pattern

此处列出我关于 Git 的学习实践。


# 设计模式列表

## 创建型模式
- [工厂模式(Factory pattern)](/simple-design-pattern/工厂模式.md)
- [抽象工厂模式(Abstract factory Pattern)](/simple-design-pattern/抽象工厂模式.md)
- [单例模式(Singleton Pattern)](/simple-design-pattern/单例模式.md)
- [建造者模式(Builder Pattern)](/simple-design-pattern/建造者模式.md)
- [原型模式(Prototype pattern)](/simple-design-pattern/原型模式.md)

## 结构型模式
- [适配器模式(Adapter Pattern)](/simple-design-pattern/适配器模式.md)
- [桥接模式(Bridge Pattern)](/simple-design-pattern/桥接模式.md)
- [过滤器模式(Filter、Criteria Pattern)](/simple-design-pattern/过滤器模式.md)
- [组合模式(Composite Pattern)](/simple-design-pattern/组合模式.md)
- [装饰器模式(Decorator Pattern)](/simple-design-pattern/装饰器模式.md)
- [外观模式(Facade pattern)](/simple-design-pattern/外观模式.md)
- [享元模式(Flyweight Pattern)](/simple-design-pattern/享元模式.md)
- [代理模式(Proxy pattern)](/simple-design-pattern/代理模式.md)

## 行为型模式
- [责任链模式(Chain-of-responsibility pattern)](/simple-design-pattern/责任链模式.md)
- [命令模式(Command Pattern)](/simple-design-pattern/命令模式.md)
- [解释器模式(Interpreter Pattern)](/simple-design-pattern/解释器模式.md)
- [迭代器模式(Iterator Pattern)](/simple-design-pattern/迭代器模式.md)
- [中介者模式(Mediator Pattern)](/simple-design-pattern/中介者模式.md)
- [备忘录模式(Memento Pattern)](/simple-design-pattern/备忘录模式.md)
- [观察者模式(Observer Pattern)](/simple-design-pattern/观察者模式.md)
- [状态模式(State Pattern)](/simple-design-pattern/状态模式.md)
- [空对象模式(Null Object Pattern)](/simple-design-pattern/空对象模式.md)
- [策略模式(Strategy pattern)](/simple-design-pattern/策略模式.md)
- [模版方法模式(Template method pattern)](/simple-design-pattern/模版方法模式.md)
- [访问者模式(Visitor Pattern)](/simple-design-pattern/访问者模式.md)

## J2EE模式
- MVC 模式(MVC Pattern)
- 业务代表模式(Business Delegate Pattern)
- 组合实体模式(Composite Entity Pattern)
- 数据访问对象模式(Data Access Object Pattern)
- 前端控制器模式(Front Controller Pattern)
- 拦截过滤器模式(Intercepting Filter Pattern)
- 服务定位器模式(Service Locator Pattern)
- 传输对象模式(Transfer Object Pattern)


# 面向对象六大原则

## 单一职责原则
- 定义：不要存在多于一个导致类变更的原因，即一个类只负责一项职责
- 问题描述：一个类负责的功能超过1个
- 解决方案：遵循单一职责原则。分别建立两个类T1、T2，使T1完成职责P1功能，T2完成职责P2功能。这样，当修改类T1时，不会使职责P2发生故障风险；同理，当修改T2时，也不会使职责P1发生故障风险。
- 核心思想：一个类只做一件事，更细粒度，一个类方法只做一件事。

## 里氏替换原则
- 定义1：如果对每一个类型为 T1的对象 o1，都有类型为 T2 的对象o2，使得以 T1定义的所有程序 P 在所有的对象 o1 都代换成 o2 时，程序 P 的行为没有发生变化，那么类型 T2 是类型 T1 的子类型。
- 定义2：所有引用基类的地方必须能透明地使用其子类的对象。
- 问题描述：有一功能P1，由类A完成。现需要将功能P1进行扩展，扩展后的功能为P，其中P由原有功能P1与新功能P2组成。新功能P由类A的子类B来完成，则子类B在完成新功能P2的同时，有可能会导致原有功能P1发生故障。
- 解决方案：当使用继承时，遵循里氏替换原则。类B继承类A时，除添加新的方法完成新增功能P2外，尽量不要重写父类A的方法，也尽量不要重载父类A的方法。
- 核心思想：功能扩展不要对已有功能造成影响。


## 依赖倒置原则
- 定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象。
- 问题描述：类A直接依赖类B，假如要将类A改为依赖类C，则必须通过修改类A的代码来达成。这种场景下，类A一般是高层模块，负责复杂的业务逻辑；类B和类C是低层模块，负责基本的原子操作；假如修改类A，会给程序带来不必要的风险。
- 解决方案：将类A修改为依赖接口I，类B和类C各自实现接口I，类A通过接口I间接与类B或者类C发生联系，则会大大降低修改类A的几率。
- 核心思想：面向接口编程，而非面向实现编程。

## 接口隔离原则
- 定义：客户端不应该依赖它不需要的接口；一个类对另一个类的依赖应该建立在最小的接口上。 
- 问题描述：类A通过接口I依赖类B，类C通过接口I依赖类D，如果接口I对于类A和类B来说不是最小接口，则类B和类D必须去实现他们不需要的方法。
- 解决方案：将臃肿的接口I拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。
- 核心思想：接口实现不要产生冗余依赖和实现。

## 迪米特法则
- 定义：一个对象应该对其他对象保持最少的了解。
- 问题描述：类与类之间的关系越密切，耦合度越大，当一个类发生改变时，对另一个类的影响也越大。
- 解决方案：尽量降低类与类之间的耦合。
- 核心思想：低耦合，高内聚。

## 开闭原则
- 定义：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。
- 问题描述：在软件的生命周期内，因为变化、升级和维护等原因需要对软件原有代码进行修改时，可能会给旧代码中引入错误，也可能会使我们不得不对整个功能进行重构，并且需要原有代码经过重新测试。
- 解决方案：当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
- 核心思想：不允许对原有代码进行修改，只允许进行扩展

**六大原则使用说明：对这六个原则的遵守并不是是和否的问题，而是多和少的问题，也就是说，我们一般不会说有没有遵守，而是说遵守程度的多少。任何事都是过犹不及，设计模式的六个设计原则也是一样，制定这六个原则的目的并不是要我们刻板的遵守他们，而需要根据实际情况灵活运用。对他们的遵守程度只要在一个合理的范围内，就是一个良好的设计。**
