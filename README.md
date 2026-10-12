# 课后作业4sm：Spring 整合 MyBatis + AOP

在 Spring 整合 MyBatis 的基础上，用 AOP 为业务层 Admin 登录方法添加前置、后置通知。

## 内容
- 整合三件套：`DriverManagerDataSource` + `SqlSessionFactoryBean` + `MapperScannerConfigurer`
- 业务：`Admin` 实体（lombok）+ `AdminMapper`（selectByEmail）+ `AdminServiceImpl.login`
- AOP：`MyBeforeAdvice` / `MyAfterAdvice`（aopalliance 接口），XML `aop:config` 配置切点绑定
- 环绕/异常通知演示见课堂项目：环绕通知可通过 `proceed()` 修改目标方法返回值

## 测试
`TestAdminMapper`（Mapper 层）、`TestAdminService`（业务层+通知链），全部通过。
