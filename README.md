# jimureport

#### 介绍
springboot整合积木报表

#### 软件架构
本项目只用以个人学习，参考的是官方文档：http://report.jeecg.com/2391081


#### 安装教程

1.  下载代码后执行根目录下SQL下的sql。
2.  运行项目后访问 http://localhost:8091/jimureport。

#### 使用说明

1.  项目目前已经集成的mybatis-plus, Redis, minio, jwt, dynamic(多数据源处理)。
2.  JwtAuthTokenFilter和JimuReportTokenService可以做权限认证拦截，项目中已经注解，需要的可以自己配置。

