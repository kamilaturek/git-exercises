angular.module('hello', [])
    .controller('home', function($scope, $http) {
        $http.get('/resource/').success(function(data) {
            $scope.greeting = data;
        })
        $scope.giveDay = function(){
            $http.get('/today').success(function(data){
                $scope.day = data;
            })
        }
    });