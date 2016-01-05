
// create a new empty object
var newObject = {};

var newObject = new Object();

// if there are no concept of class, use like this
function Car(model, year, miles) {

    this.model = model;
    this.year = year;
    this.miles = miles;

    this.toString = function() {
        return this.model + " has done " + this.miles + " miles";
    };

}

var benz = new Car("Mercedes Benz", 2009, 2000);
console.log(benz.toString());

// on ECMA6
class Car{

    constructor(model, year, miles) {
        this.model = model;
        this.year = year;
        this.miles = miles;
    }

    toString() {
        return this.model + " has done " + this.miles + " miles";
    }
}

// also it is possible to extends
class SubCar extends Car {

}
