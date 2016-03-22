var appServices = angular.module('appServices', []);

appServices.factory("CompanyService", function($http){
    var factoryObj = {};

    factoryObj.listAll = function(){
        return $http.get('companies/list');
    }

    factoryObj.get = function(companyId){
        return $http.get('companies/get/' + companyId);
    }

    factoryObj.create = function(companyObj){
        return $http.post("companies/add", companyObj);
    }

    factoryObj.update = function(companyId, companyObj){
        return $http.put("companies/update/" + companyId, companyObj);
    }

    factoryObj.delete = function(companyId){
        return $http.delete('companies/delete/' + companyId);
    }

    return factoryObj;
});
