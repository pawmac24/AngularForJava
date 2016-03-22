//For ngRoute use ngRoute instead ui.router
var myApp = angular.module('myApp',
    [
        'ui.router', 'ngMessages', 'appCompany', 'appServices'
    ]);

myApp.config(function($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/');

    $stateProvider

        // route for home page
        .state('home', {
            url: '/',
            templateUrl: 'static/app/pages/home.html',
            controller: 'mainController'
        })

        // route for about page
        .state('about', {
            url: '/about',
            templateUrl: 'static/app/pages/about.html',
            controller: 'aboutController'
        })

        // route for contact page
        .state('contact', {
            url: '/contact',
            templateUrl: 'static/app/pages/contact.html',
            controller: 'contactController'
        })

        // route for company page
        .state('company', {
            url: '/company',
            templateUrl: 'static/app/pages/company/company.html',
            controller: 'companyController'
        })

        // route for company list page
        .state('company.list', {
            url: '/list',
            templateUrl: 'static/app/pages/company/company_list.html',
            controller: 'companyListController'
        })

        // route for company create page
        .state('company.create', {
            url: '/create',
            templateUrl: 'static/app/pages/company/company_create.html',
            controller: 'companyCreateController'
        })

        // route for company edit page
        .state('company.edit', {
            url: '/edit/:companyId',
            templateUrl: 'static/app/pages/company/company_edit.html',
            controller: 'companyEditController'
        })
});

// create the controller and inject Angular's $scope
myApp.controller('mainController', function ($scope) {
    // create a message to display in our view
    $scope.message = 'Everyone come and see how good I look!';
});

myApp.controller('aboutController', function ($scope) {
    $scope.message = 'Look! I am an about page.';
});

myApp.controller('contactController', function ($scope) {
    $scope.message = 'Contact us! JK. This is just a demo.';
});