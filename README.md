## 关于余香app说明(下面有动态图展示)       
### 从一开始的布局，到获取数据，建立数据库，最后功能的实现，这款菜谱app终于完成啦。余香菜谱app主要包括会员注册、登陆、浏览菜谱信息、搜索菜谱，收藏、点赞等基本功能，还有部分功能还有待完善哈！！后续如果我有时间做多些功能，也会放上来。     
#### 本app适用于绝大部分安卓机型，基于Android studio平台开发，用的是java语言。先把主要用到的技术说一下把
##### a .json和Gson，Json数据的解析是较为关键的一步，整个app最重要的就是菜谱相关的数据，极光数据提供的数据是多维的数据，需要建立模式等等      
##### b .SQLite，轻量级数据库，它的设计目标是嵌入式的,它占用资源非常的低,且处理速度比他们都快   
##### c .RecycleView，从Android 5.0开始，谷歌公司推出了一个用于大量数据展示的新控件RecylerView，可以用来代替传统的ListView，更加强大和灵活        
##### d .javaBean,JavaBean 通过提供符合一致性设计模式的公共方法将内部域暴露成员属性，set和get方法获取    
##### e .Volley框架，用这个处理数据不大又请求频繁的特别好用  
##### f .Banner框架，轮播图的框架，比较火，非常好用    
##### g .ViewPagerindicator框架,用于各种基于 AndroidSupportLibrary 中 ViewPager 的界面导航。主要特点：使用简单、样式全、易扩展  
##### 这个是主要界面的动态图!    
![Image text](https://raw.githubusercontent.com/lemonleeboss/YuXiang/master/app/src/main/res/mipmap-mdpi/git_b.gif)      
##### 这个是首页的动态图!    
![Image text](https://raw.githubusercontent.com/lemonleeboss/YuXiang/master/app/src/main/res/mipmap-mdpi/git_d.gif)       
##### 这个是发现好菜页的动态图!   
![Image text](https://raw.githubusercontent.com/lemonleeboss/YuXiang/master/app/src/main/res/mipmap-mdpi/git_c.gif)        
##### 这个是注册登陆的动态图!    
![Image text](https://raw.githubusercontent.com/lemonleeboss/YuXiang/master/app/src/main/res/mipmap-mdpi/git_a.gif)    
    
 
