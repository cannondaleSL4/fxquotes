## Stage 0, based on Node.js, to build and compile Angular
#FROM node:8.6 as node
#WORKDIR /app
#COPY package.json /app/
#RUN npm install
#COPY ./ /app/
#ARG env=prod
#RUN npm run build -- --prod --environment $env
#
## Stage 1, based on Nginx, to have only the compiled app, ready for production with Nginx
#FROM nginx:1.13
#COPY --from=node /app/dist/ /usr/share/nginx/html
#COPY ./nginx.conf /etc/nginx/conf.d/default.conf



#FROM nginx
#
#ENV LANG en_US.UTF-8
#
## Copy configuration files
#COPY ./nginx.conf /etc/nginx/nginx.conf
##COPY ./default.conf /etc/nginx/conf.d/default.conf
#
## Add Gulp output folder to server root
#ADD ./dist /usr/share/nginx/html
#
## Port configuration
#EXPOSE 8080

FROM debian:jessie

MAINTAINER NGINX Docker Maintainers "docker-maint@nginx.com"

ENV NGINX_VERSION 1.11.9-1~jessie


RUN apt-key adv --keyserver hkp://pgp.mit.edu:80 --recv-keys 573BFD6B3D8FBC641079A6ABABF5BD827BD9BF62 \
    && echo "deb http://nginx.org/packages/mainline/debian/ jessie nginx" >> /etc/apt/sources.list \
    && apt-get update \
    && apt-get install --no-install-recommends --no-install-suggests -y \
                        ca-certificates \
                        nginx=${NGINX_VERSION} \
    && rm -rf /var/lib/apt/lists/*

# forward request and error logs to docker log collector
RUN ln -sf /dev/stdout /var/log/nginx/access.log \
    && ln -sf /dev/stderr /var/log/nginx/error.log

# this is needed when calling another server. Just google it for more details.
# RUN echo "upstream php-upstream { server node:9000; }" > /etc/nginx/conf.d/upstream.conf

EXPOSE 80 443

CMD ["nginx", "-g", "daemon off;"]
