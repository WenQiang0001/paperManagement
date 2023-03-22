// import Vue from 'vue'
// import App from './App.vue'

// import router from './router/index.js'

// Vue.config.productionTip = false

// new Vue({
//   router,
//   render: h => h(App),
// }).$mount('#app')

import Vue from 'vue'
import App from './App.vue'
//6.引入导出的路由
import router from './router/index.js'

// 加载 element 组件库
import ElementUI from 'element-ui'
 
// 加载 element 组件库的样式
import 'element-ui/lib/theme-chalk/index.css'

// 全局注册 element 组件库
Vue.use(ElementUI)

Vue.config.productionTip = false

new Vue({
  //7.注册路由
  router,
  render: h => h(App),
}).$mount('#app')


