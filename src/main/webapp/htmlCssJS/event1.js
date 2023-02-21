const d1 = document. getElementById("d1");
const input1 = document.getElementById("input1");
const input2 = document.getElementById("input2");
const input3 = document.getElementById("input3");
const btn = document.getElementById("btn");

d1.addEventListener("click",function() {
    console.log("Click Event")
})

d1.addEventListener("mouseenter",function() {
    console.log("MouseEnter Event")
})

d1.addEventListener("keyup",function() {
    console.log("Keyup Event")
})

input1.addEventListener("keyup",function() {
    console.log("Keyup Event")
})

input2.addEventListener("focus",function() {
    console.log("focus Event")  //커서 깜박일때
})

input2.addEventListener("blur",function() {
    console.log("blur Event")  //포커스를 잃어버렸을때
})
input2.addEventListener("change",function() {
    console.log("change Event")  //값이 변경 되었을떄
})

input3.addEventListener("change",function() {
    console.log(input3.value)  
})

btn.onclick = function() {  
    input2.focus();
}
