// //1.导入VueRouter
// import Vue from "vue";
// import VueRouter from 'vue-router'
// import login from "../page/login/login.vue";
// //2.使用路由
// Vue.use(VueRouter);
// //3.创建VueRouter的实例
// const router = new VueRouter({
//     //tips:不想要 #（锚点）就添加下面代码
//      mode:'history', 
//     //4.配置路由的path和组件
//     routes :[
//         {
//           path: "/",
//           name:'login',
//           component: login,
//         }
//       ]
// })
// //5.导入路由实例
// export default router

//1.导入VueRouter
import Vue from "vue";
import VueRouter from 'vue-router'
import login from "../page/login/login.vue";
import conservator from "../page/conservator/conservator.vue";
import conservator from "../page/conservator/conservator.vue";

//2.使用路由
Vue.use(VueRouter);
//3.创建VueRouter的实例
const router = new VueRouter({
    //tips:不想要 #（锚点）就添加下面代码
     mode:'history', 
    //4.配置路由的path和组件
    routes :[
        {
          path: "/",
          name:'login',
          component: login
        },
        {
          path: "/conservator",
          name:'conservator',
          component: conservator
        }
      ]
})
//5.导入路由实例
export default router

