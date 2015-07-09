angular.module('hello', [])
    .controller('home', function($scope, $http) {
        $scope.day = "...";
        $http.get('/resource/').success(function(data) {
            $scope.greeting = data;
        });

        $scope.giveMeDay = function(){
            $http.get('/today').success(function(data) {
                $scope.day = data.dzien;
            })
        }
    });