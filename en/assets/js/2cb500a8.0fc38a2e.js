"use strict";(self.webpackChunkhertzbeat=self.webpackChunkhertzbeat||[]).push([[2127],{4137:(e,t,a)=>{a.d(t,{Zo:()=>c,kt:()=>d});var n=a(7294);function r(e,t,a){return t in e?Object.defineProperty(e,t,{value:a,enumerable:!0,configurable:!0,writable:!0}):e[t]=a,e}function o(e,t){var a=Object.keys(e);if(Object.getOwnPropertySymbols){var n=Object.getOwnPropertySymbols(e);t&&(n=n.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),a.push.apply(a,n)}return a}function i(e){for(var t=1;t<arguments.length;t++){var a=null!=arguments[t]?arguments[t]:{};t%2?o(Object(a),!0).forEach((function(t){r(e,t,a[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(a)):o(Object(a)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(a,t))}))}return e}function l(e,t){if(null==e)return{};var a,n,r=function(e,t){if(null==e)return{};var a,n,r={},o=Object.keys(e);for(n=0;n<o.length;n++)a=o[n],t.indexOf(a)>=0||(r[a]=e[a]);return r}(e,t);if(Object.getOwnPropertySymbols){var o=Object.getOwnPropertySymbols(e);for(n=0;n<o.length;n++)a=o[n],t.indexOf(a)>=0||Object.prototype.propertyIsEnumerable.call(e,a)&&(r[a]=e[a])}return r}var s=n.createContext({}),p=function(e){var t=n.useContext(s),a=t;return e&&(a="function"==typeof e?e(t):i(i({},t),e)),a},c=function(e){var t=p(e.components);return n.createElement(s.Provider,{value:t},e.children)},u={inlineCode:"code",wrapper:function(e){var t=e.children;return n.createElement(n.Fragment,{},t)}},m=n.forwardRef((function(e,t){var a=e.components,r=e.mdxType,o=e.originalType,s=e.parentName,c=l(e,["components","mdxType","originalType","parentName"]),m=p(a),d=r,h=m["".concat(s,".").concat(d)]||m[d]||u[d]||o;return a?n.createElement(h,i(i({ref:t},c),{},{components:a})):n.createElement(h,i({ref:t},c))}));function d(e,t){var a=arguments,r=t&&t.mdxType;if("string"==typeof e||r){var o=a.length,i=new Array(o);i[0]=m;var l={};for(var s in t)hasOwnProperty.call(t,s)&&(l[s]=t[s]);l.originalType=e,l.mdxType="string"==typeof e?e:r,i[1]=l;for(var p=2;p<o;p++)i[p]=a[p];return n.createElement.apply(null,i)}return n.createElement.apply(null,a)}m.displayName="MDXCreateElement"},2966:(e,t,a)=>{a.r(t),a.d(t,{assets:()=>s,contentTitle:()=>i,default:()=>u,frontMatter:()=>o,metadata:()=>l,toc:()=>p});var n=a(7462),r=(a(7294),a(4137));const o={id:"package-deploy",title:"Install HertzBeat via Package",sidebar_label:"Install via Package"},i=void 0,l={unversionedId:"start/package-deploy",id:"start/package-deploy",title:"Install HertzBeat via Package",description:"You can install and run HertzBeat on Linux Windows Mac system, and CPU supports X86/ARM64. Due to the installation package itself does not include the JAVA runtime environment, you need to prepare JAVA runtime environment in advance.",source:"@site/i18n/en/docusaurus-plugin-content-docs/current/start/package-deploy.md",sourceDirName:"start",slug:"/start/package-deploy",permalink:"/en/docs/start/package-deploy",draft:!1,editUrl:"https://github.com/dromara/hertzbeat/edit/master/home/i18n/en/docusaurus-plugin-content-docs/current/start/package-deploy.md",tags:[],version:"current",frontMatter:{id:"package-deploy",title:"Install HertzBeat via Package",sidebar_label:"Install via Package"},sidebar:"docs",previous:{title:"Install via Docker",permalink:"/en/docs/start/docker-deploy"},next:{title:"H2 Database Switch to MYSQL",permalink:"/en/docs/start/mysql-init"}},s={},p=[{value:"Package Deployment common issues",id:"package-deployment-common-issues",level:3}],c={toc:p};function u(e){let{components:t,...a}=e;return(0,r.kt)("wrapper",(0,n.Z)({},c,a,{components:t,mdxType:"MDXLayout"}),(0,r.kt)("blockquote",null,(0,r.kt)("p",{parentName:"blockquote"},"You can install and run HertzBeat on Linux Windows Mac system, and CPU supports X86/ARM64. Due to the installation package itself does not include the JAVA runtime environment, you need to prepare JAVA runtime environment in advance.")),(0,r.kt)("p",null,"video tutorial of installation and deployment: ",(0,r.kt)("a",{parentName:"p",href:"https://www.bilibili.com/video/BV1GY41177YL"},"HertzBeat installation and deployment-BiliBili"),"   "),(0,r.kt)("ol",null,(0,r.kt)("li",{parentName:"ol"},(0,r.kt)("p",{parentName:"li"},"Install JAVA runtime environment-refer to",(0,r.kt)("a",{parentName:"p",href:"http://www.oracle.com/technetwork/java/javase/downloads/index.html"},"official website"),(0,r.kt)("br",{parentName:"p"}),"\n","requirement\uff1aJDK11 ENV",(0,r.kt)("br",{parentName:"p"}),"\n","download JAVA installation package: ",(0,r.kt)("a",{parentName:"p",href:"https://repo.huaweicloud.com/java/jdk/"},"mirror website"),(0,r.kt)("br",{parentName:"p"}),"\n","After installation use command line to check whether you install it successfully.   "),(0,r.kt)("pre",{parentName:"li"},(0,r.kt)("code",{parentName:"pre"},'$ java -version\nopenjdk version "1.8.0_312"\nOpenJDK Runtime Environment (Zulu 8.58.0.13-CA-macos-aarch64) (build 1.8.0_312-b07)\nOpenJDK 64-Bit Server VM (Zulu 8.58.0.13-CA-macos-aarch64) (build 25.312-b07, mixed mode)\n'))),(0,r.kt)("li",{parentName:"ol"},(0,r.kt)("p",{parentName:"li"},"Download HertzBeat installation package\nDownload installation package corresponding to your system environment"),(0,r.kt)("ul",{parentName:"li"},(0,r.kt)("li",{parentName:"ul"},"download from ",(0,r.kt)("a",{parentName:"li",href:"https://gitee.com/dromara/hertzbeat/releases"},"GITEE Release")," repository "),(0,r.kt)("li",{parentName:"ul"},"download from ",(0,r.kt)("a",{parentName:"li",href:"https://github.com/dromara/hertzbeat/releases"},"GITHUB Release")," repository"))),(0,r.kt)("li",{parentName:"ol"},(0,r.kt)("p",{parentName:"li"},"Configure HertzBeat's configuration file(optional)",(0,r.kt)("br",{parentName:"p"}),"\n","Unzip the installation package to the host eg: /opt/hertzbeat  "),(0,r.kt)("pre",{parentName:"li"},(0,r.kt)("code",{parentName:"pre"},"$ tar zxvf hertzbeat-[version number].tar.gz   \n")),(0,r.kt)("p",{parentName:"li"},"Modify the configuration file ",(0,r.kt)("inlineCode",{parentName:"p"},"hertzbeat/config/application.yml"),"\nReplace ",(0,r.kt)("inlineCode",{parentName:"p"},"td-engine")," service parameter, IP port account and password\nNote\u26a0\ufe0f\uff08If use email to alert, please replace the mail server parameter. If use MYSQL data source, replace the datasource parameters inside  refer to",(0,r.kt)("a",{parentName:"p",href:"mysql-init"},"H2 database switch to MYSQL"),"\uff09\nSpecific replacement parameters is as follows:   "))),(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre"},"   warehouse.store.td-engine.enabled\n   warehouse.store.td-engine.url\n   warehouse.store.td-engine.username\n   warehouse.store.td-engine.password\n   \n   spring.mail.host\n   spring.mail.port\n   spring.mail.username\n   spring.mail.password\n")),(0,r.kt)("ol",{start:4},(0,r.kt)("li",{parentName:"ol"},"Configure the user configuration file(optional, user-defined user password)",(0,r.kt)("br",{parentName:"li"}),"HertzBeat default built-in three user accounts, respectively admin/hertzbeat tom/hertzbeat guest/hertzbeat",(0,r.kt)("br",{parentName:"li"}),"If you need add, delete or modify account or password, configure ",(0,r.kt)("inlineCode",{parentName:"li"},"sureness.yml"),". Ignore this step without this demand.\nModify the following ",(0,r.kt)("strong",{parentName:"li"},"part parameters")," in sureness.yml\uff1a",(0,r.kt)("strong",{parentName:"li"},"[Note\u26a0\ufe0fOther default sureness configuration parameters should be retained]"))),(0,r.kt)("pre",null,(0,r.kt)("code",{parentName:"pre",className:"language-yaml"},"\n# user account information\n# Here is admin tom lili three accounts\n# eg: admin includes[admin,user]roles, password is hertzbeat \n# eg: tom includes[user], password is hertzbeat\n# eg: lili includes[guest], text password is lili, salt password is 1A676730B0C7F54654B0E09184448289\naccount:\n   - appId: admin\n     credential: hertzbeat\n     role: [admin,user]\n   - appId: tom\n     credential: hertzbeat\n     role: [user]\n   - appId: guest\n     credential: hertzbeat\n     role: [guest]\n \n")),(0,r.kt)("ol",{start:5},(0,r.kt)("li",{parentName:"ol"},"Deploy/Start\nExecute the startup script startup.sh in the installation directory hertzbeat/bin/",(0,r.kt)("pre",{parentName:"li"},(0,r.kt)("code",{parentName:"pre"},"$ ./startup.sh \n"))),(0,r.kt)("li",{parentName:"ol"},"Begin to explore HertzBeat",(0,r.kt)("br",{parentName:"li"}),"visit http://ip:1157/ on the browser. You can use HertzBeat monitoring alarm, default account and password are admin/hertzbeat. ")),(0,r.kt)("p",null,(0,r.kt)("strong",{parentName:"p"},"HAVE FUN")),(0,r.kt)("h3",{id:"package-deployment-common-issues"},"Package Deployment common issues"),(0,r.kt)("ol",null,(0,r.kt)("li",{parentName:"ol"},(0,r.kt)("p",{parentName:"li"},(0,r.kt)("strong",{parentName:"p"},"According to the process deploy\uff0cvisit http://ip:1157/ no interface"),(0,r.kt)("br",{parentName:"p"}),"\n","Please refer to the following points to troubleshoot issues:"),(0,r.kt)("blockquote",{parentName:"li"},(0,r.kt)("p",{parentName:"blockquote"},"one\uff1aIf you switch to dependency service MYSQL database\uff0ccheck whether the database is created and started successfully.\ntwo\uff1aCheck whether dependent services, IP account and password configuration is correct in HertzBeat's configuration file ",(0,r.kt)("inlineCode",{parentName:"p"},"hertzbeat/config/application.yml"),".",(0,r.kt)("br",{parentName:"p"}),"\n","three\uff1a Check whether the running log has errors in ",(0,r.kt)("inlineCode",{parentName:"p"},"hertzbeat/logs/")," directory. If you haven't solved the issue, report it to the communication group or community."))),(0,r.kt)("li",{parentName:"ol"},(0,r.kt)("p",{parentName:"li"},(0,r.kt)("strong",{parentName:"p"},"Log an error TDengine connection or insert SQL failed")),(0,r.kt)("blockquote",{parentName:"li"},(0,r.kt)("p",{parentName:"blockquote"},"one\uff1aCheck whether database account and password configured is correct, the database is created.",(0,r.kt)("br",{parentName:"p"}),"\n","two\uff1aIf you install TDengine2.3+ version, you must execute ",(0,r.kt)("inlineCode",{parentName:"p"},"systemctl start taosadapter")," to start adapter in addition to start the server.    "))),(0,r.kt)("li",{parentName:"ol"},(0,r.kt)("p",{parentName:"li"},(0,r.kt)("strong",{parentName:"p"},"Historical monitoring charts have been missing data for a long time")),(0,r.kt)("blockquote",{parentName:"li"},(0,r.kt)("p",{parentName:"blockquote"},"one\uff1aCheck whether you configure Tdengine. No configuration means no historical chart data.",(0,r.kt)("br",{parentName:"p"}),"\n","two\uff1aCheck whether Tdengine database ",(0,r.kt)("inlineCode",{parentName:"p"},"hertzbeat")," is created.\nthree: Check whether IP account and password configuration is correct in HertzBeat's configuration file ",(0,r.kt)("inlineCode",{parentName:"p"},"application.yml"),".")))))}u.isMDXComponent=!0}}]);