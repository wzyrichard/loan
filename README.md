## 惠农在线网上贷款审核平台

###  1.环境搭建
~~~
    1.1 安装JDK1.8以上版本
    1.2 推荐安装IDEA集成开发环境
    1.3 安装MAVEN
    1.4 安装MySQL数据库软件
~~~

### 2.具体搭建过程
~~~
    2.1 JDK安装
       首先下载JDK，到https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html该网站
       下载JDK1.8版本，如果你是Linux系统，下载对应的Linux系统的JDK，要确认好你的系统是32位的还是64位的
       同样如果你的系统是Window系统，下载对应的32位或者64位JDK，这个取决于你的操作系统位数
    
    2.2 MAVEN安装
       首先下载Maven，到http://maven.apache.org/download.cgi，如果是Window系统，下载对应的       首先下载Maven，到http://maven.apache.org/download.cgi，如果是Window系统，下载对应的apache-maven-3.6.1-bin.zip
       如果是Linux系统，下载apache-maven-3.6.1-bin.zip，具体安装过程从百度搜一下
  
    2.3 推荐下载IDEA
       首先下载IDEA，到http://www.jetbrains.com/idea/?fromMenu 下载IDEA版本，具体的破解教程网上也有
        
~~~

### 3.代码介绍
~~~
    3.1 前台采用layer.js、jquery.js第三方插件，html5, thymeleaf模板引擎，css3样式
    
    3.2 后台采用SpringBoot、MyBatis、MySQL、Maven等等有些技术
    
    3.3 后台代码分层，采用MVC模式，分为Controller、Model、View、Service层
        
        3.3.1 Controller主要功能功能，请求转发，得到响应的数据或者转发到响应的界面
        
        3.3.2 Model主要是抽象现实世界的对象模型，和数据库对应的领域模型
        
        3.3.3 Mapper主要是负责数据持久化，对数据库进行CRUD操作，以及事务机制
        
        3.3.4 Service主要是业务逻辑层，主要是针对业务逻辑处理
        
~~~

### 4.代码树图
~~~
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─hnzx
│  │  │          └─loan
│  │  │              ├─controller               -- 控制器
│  │  │              ├─enums                    -- 枚举类型
│  │  │              ├─exception                -- 全局异常和自定义异常
│  │  │              ├─mapper                   -- MyBatis Mapper映射类
│  │  │              ├─model                    -- 实体对象
│  │  │              ├─service                  -- 服务层接口
│  │  │              │  └─impl                  -- 服务层实现类
│  │  │              ├─tool                     -- 工具类
│  │  │              └─vo                       -- 前端返回视图类
│  │  └─resources
│  │      ├─mappers                             -- 定义对应的Mapper XML存放位置CRUD在这里定义
│  │      ├─static                              -- 静态文件夹，主要存放css、js、images、lib第三方类库
│  │      │  ├─css                              -- 存放css文件
│  │      │  ├─images                           -- 存放图片文件
│  │      │  ├─js                               -- 存放js文件
│  │      │  └─lib                              -- 存放第三类类库
│  │      │      ├─jquery                       -- jquery库
│  │      │      └─layui                        -- layui类库
│  │      │          ├─css
│  │      │          │  └─modules
│  │      │          │      ├─laydate
│  │      │          │      │  └─default
│  │      │          │      └─layer
│  │      │          │          └─default
│  │      │          ├─font
│  │      │          ├─images
│  │      │          │  └─face
│  │      │          └─lay
│  │      │              └─modules
│  │      └─templates                           -- 静态页面html5存放位置
│  │          └─user
│  └─test                                       -- 单元测试类，存放的文件夹
│      └─java
│          └─com
│              └─hnzx
│                  └─loan
└─target                                        -- 编译生成的target文件夹
    ├─classes
    │  ├─com
    │  │  └─hnzx
    │  │      └─loan
    │  │          ├─controller
    │  │          ├─enums
    │  │          ├─exception
    │  │          ├─mapper
    │  │          ├─model
    │  │          ├─service
    │  │          │  └─impl
    │  │          ├─tool
    │  │          └─vo
    │  ├─mappers
    │  ├─META-INF
    │  ├─static
    │  │  ├─css
    │  │  ├─js
    │  │  └─lib
    │  │      ├─jquery
    │  │      └─layui
    │  │          ├─css
    │  │          │  └─modules
    │  │          │      ├─laydate
    │  │          │      │  └─default
    │  │          │      └─layer
    │  │          │          └─default
    │  │          ├─font
    │  │          ├─images
    │  │          │  └─face
    │  │          └─lay
    │  │              └─modules
    │  └─templates
    │      └─user
    ├─generated-sources
    │  └─annotations
    ├─generated-test-sources
    │  └─test-annotations
    ├─maven-status
    │  └─maven-compiler-plugin
    │      ├─compile
    │      │  └─default-compile
    │      └─testCompile
    │          └─default-testCompile
    ├─surefire-reports
    └─test-classes
        └─com
            └─hnzx
                └─loan
~~~