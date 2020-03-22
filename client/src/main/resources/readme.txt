1.集成客户端启动报错Invocation of destroy method failed on bean with name 'scopedTarget.eurekaClient':
少依赖spring-boot-starter-web

二 负载均衡
    1.客户端负载均衡
    2.客户端、服务端负载均衡对比
      客户端负载均衡 :客户端调用服务端实现
      服务端：ngnix分配调用服务端来实现负载均衡
    ribbon 负载均衡:
       注入RestTemplete上家注解 @Locad