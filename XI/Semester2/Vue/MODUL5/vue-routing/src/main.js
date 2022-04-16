import Vue from 'vue'
import App from './App.vue'

import VueRouter from 'vue-router'

import HomePage from './components/HomePage'
import AboutPage from './components/AboutPage'
import ContactPage from './components/ContactPage'
import NotFound from './components/NotFound'

Vue.config.productionTip = false

Vue.use(VueRouter)

const router = new VueRouter({
  routes: [
    { path : '/', component : HomePage},
    { path : '/about', component : AboutPage},
    { path : '/contact', component : ContactPage},
    { path : '*', component : NotFound}
  ],
  mode: 'history'
})

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')