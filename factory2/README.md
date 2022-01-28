# 开发

# 简介

工厂(factory)处理创建对象的细节.

定义简单工厂:简单工厂其实不是一个设计模式,反而比较像是一种编程习惯.但由于经常被使用,所以我们它一个"Head First Pattern荣誉奖". 有些开发人员的确是把这个编程习惯误认为是"工厂模式"(Factory Pattern).

不要因为简单工厂不是一个"真正的"模式,就忽略了它的用法.让我们看看新的比萨店类图:
src/main/java/pizzas
![Alt text](https://github.com/bfylu/factory/raw/master/image/pizzaFactory.png)
![比萨店简单工厂类图.png](https://github.com/bfylu/factory/raw/master/image/pizzaFactory.png)

PizzaStore是工厂的"客户".PizzaStoze现在通过SimplePizzaFactozy取得比萨的实例.

SimplePizzaFactory是创建比萨的"工厂",它应该是我们的应用唯一用到具体比萨类的地方.....createPizza()通常声明为静态.

PIzza是工厂的"产品":比萨! 把Pizza定义为抽象类,具有一些有用的实现,这些实现可以被覆盖.

(CheesePIzza,VeggiePizza,ClamPizza,PepperoniPizza)是我们的"具体产品",每个产品都必须实现Pizza接口
(在本例中是指"扩展抽象的Pizza类")并设计成一个具体 类.这样一来,就可以被工厂创建,并返回给客户.

谢谢简单工厂来为我们暖身.接下来登场的是两个重量级的模式,它们都是工厂.

**再提醒一次:在设计模式中,所谓的"实现一个接口"并"不一定表示"写一个类,并利用implement关键词来实现某个Java接口"."实现一个接口"泛指"
实现某个超类(可以是类或接口)的某个方法.

![Alt text](https://github.com/bfylu/factory/raw/master/image/pizzaFactoryM.png)
![比萨店真正工厂类图.png](https://github.com/bfylu/factory/raw/master/image/pizzaFactoryM.png)

创建者(Creator)类 PizzaStore是抽象创建者.它定义了一个抽象的工厂方法,让子类实现此方法制造产品.

