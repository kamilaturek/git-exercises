angular.module('hello', [])
    .controller('home', function($scope, $http) {
        $http.get('/resource/').success(function(data) {
            $scope.greeting = data;
        });

        $scope.getToday = function(){
            $http.get('/today/').success(function(data) {
                $scope.today = data;
            });
        };
    });