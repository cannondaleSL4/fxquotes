FROM nginx

LABEL maintainer="NGINX Docker Maintainers <docker-maint@nginx.com>"

ENV NGINX_VERSION 1.13.8-1~stretch
ENV NJS_VERSION   1.13.8.0.1.15-1~stretch

COPY nginx.conf /etc/nginx/nginx.conf
COPY dist/ /usr/share/nginx/html


EXPOSE 90


STOPSIGNAL SIGTERM

CMD ["nginx", "-g", "daemon off;"]
