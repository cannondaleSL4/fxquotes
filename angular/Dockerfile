#FROM node:8.9-alpine as angular-built
#WORKDIR /usr/src/app
#RUN npm i -g @angular/cli
#COPY package.json package.json
#RUN npm install --silent
#COPY . .
#RUN ng build --prod
#
#FROM nginx:alpine
#LABEL author="John Papa"
#COPY --from=angular-built /home/dima/java/fxquotes/angular/dist /usr/share/nginx/html
#EXPOSE 80 443
#CMD [ "nginx", "-g", "daemon off;" ]

FROM nginx
COPY nginx.conf /etc/nginx/nginx.conf
COPY dist/prod /usr/share/nginx/html
