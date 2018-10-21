# Config Server
## 配置
Config Server 在从 Git 中获取配置信息后，会存储一份在 Config Server 的文件系统中，实质上 Config Server 是通过 ***git clone*** 命令将配置仓库复制一份在本地存储，然后读取这些内容并返回给微服务应用进行加载。

- spring.cloud.config.server.git.uri：Git 仓库的地址。
- spring.cloud.config.server.git.search-paths：Git 仓库路径下相对搜索位置，可以配置多个。
- spring.cloud.config.server.git.username：访问 Git 仓库的用户名
- spring.cloud.config.server.git.password：访问 Git 仓库的密码
- spring.cloud.config.server.git.basedir：Config Server 克隆的文件会默认以 **config-repo-XXX** 目录放到一个位置，通过 ***spring.cloud.config.server.git.basedir*** 可以指定一个固定的位置。注意，该目录事先是不存在的，不然会报错。

## 仓库配置
访问位置信息的 URL 与配置文件的映射关系如下所示：
- /{application}/{profile}[/{label}]：{label} 是 master 时，可以不用加 master。
- /{application}-{profile}.yml
- /{label}/{application}-{profile}.yml
- /{application}-{profile}.properties
- /{label}/{application}-{profile}.properties

其中 {label} 对应 Git 的 branch，默认是 master。例如，访问 config-1.0 分支，app 应用的 prod 环境，则 url 是：http://${hostname}:${port}/app/prod/config-1.0。在本例中，如，http://localhost:7000/jimmy/dev
