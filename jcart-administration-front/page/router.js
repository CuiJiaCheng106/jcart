const routes = [
    { path: '/administrator/updateprofile', component: AdministratorUpdateProfileRoutePage },
    { path: '/product/search', component: ProductSearchRoutePage },
    { path: '/customer/search', component: CustomerSearchRoutePage },
    { path: '/order/search', component: OrderSearchRoutePage },
    { path: '/return/search', component: ReturnSearchRoutePage },
    { path: '/customer/show/:customerId', component: CustomerShowRoutePage },
    { path: '/administrator/index', component: AdministratorindexRoutePage },
    { path: '/product/update:/productId', component: ProductUpdateRoutePage },
    { path:'/return/edit/:returnId',component:ReturnEditRoutePage},
    {
        path: '/return/edit/:returnId',
        component: ReturnEditRoutePage,
        children: [
            {
                path: 'show',
                component: ReturnShowRoutePage
            },
            {
                path: 'history',
                component: ReturnHistoryIndexRoutePage
            }
        ]
    }  
];

const router = new VueRouter({
    routes: routes
}); 