import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/Papeleria.vue'

Vue.use(VueRouter)

const routes = [{
        path: '/',
        name: 'home',
        component: HomeView
    },
    {
        path: '/Administrador',
        name: 'Administrador',
        // route level code-splitting
        // this generates a separate chunk (about.[hash].js) for this route
        // which is lazy-loaded when the route is visited.
        component: () =>
            import ( /* webpackChunkName: "about" */ '../views/Administrador-View.vue')
    },

    {
        path: '/Vendedor',
        name: 'Vendedor',
        // route level code-splitting
        // this generates a separate chunk (about.[hash].js) for this route
        // which is lazy-loaded when the route is visited.
        component: () =>
            import ( /* webpackChunkName: "about" */ '../views/Vendedor.vue')
    },

    {
        path: '/Cliente',
        name: 'Cliente',
        // route level code-splitting
        // this generates a separate chunk (about.[hash].js) for this route
        // which is lazy-loaded when the route is visited.
        component: () =>
            import ( /* webpackChunkName: "about" */ '../views/Cliente.vue')
    },

]

const router = new VueRouter({
    routes
})

export default router