FROM registry.cn-beijing.aliyuncs.com/wangdali/jenkins-docker:latest
# 下载安装Docker CLI
USER root
RUN curl -SLO https://github.com/docker/compose/releases/download/1.17.0/docker-compose-`uname -s`-`uname -m` -o /usr/local/bin/docker-compose \
RUN chmod +x /usr/local/bin/docker-compose
# 将 `jenkins` 用户的组 ID 改为宿主 `docker` 组的组ID，从而具有执行 `docker` 命令的权限。
ARG DOCKER_GID=999
USER jenkins:${DOCKER_GID}