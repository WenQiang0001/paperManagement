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
import daoshi from "../page/conservator/daoshi.vue";
import conservator from "../page/conservator/conservator.vue";
import student from "../page/conservator/student.vue";
import task from "../page/conservator/task.vue";
import Announcement from "../page/conservator/Announcement.vue";
import modification from "../page/conservator/modification.vue";



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
          component: conservator,
          children:[
            {
              path: "/daoshi",
              name:'daoshi',
              component: daoshi
            },
            {
              path: "/student",
              name:'student',
              component: student
            },
            {
              path: "/task",
              name:'task',
              component: task
            },
            {
              path: "/Announcement",
              name:'Announcement',
              component: Announcement
            },
            {
              path: "/modification",
              name:'modification',
              component: modification
            },
            
          ]
        }
      ]
})
//5.导入路由实例
export default router

