// function itsMe(){
// 
// //     console.log("Hi")
// }
var myobj = {}

myobj.itsMe =function(){
    console.log("Hi")
}

myobj.author = "Karthu"

var ourObj ={
    designer :'using js object',
    showDesigner:function(){
        console.log(this.designer)
    }
}
var Employee = function(employeeId,employeeName){
    this.employeeId = employeeId;
    this.employeeName= employeeName
}
var ram = new Employee(101,'ram')
function setContent(){
    var element = document.getElementById("author");
element.innerHTML=myobj.author;
var title = document.getElementById("heading");
title.innerHTML=ourObj.designer;


}