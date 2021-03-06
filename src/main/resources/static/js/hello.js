angular.module('hello', [])
    .controller('home', function($scope, $http) {
        $scope.day = "...";
        $http.get('/resource/').success(function(data) {
            $scope.greeting = data;
        });

        $scope.giveMeDay = function(){
            $http.get('/todayBartek').success(function(data) {
                $scope.day = data.dzien;
            })
        };

        $scope.getToday = function(){
            $http.get('/today/').success(function(data) {
                $scope.today = data.dzien;
            });
        };
    });