//css 선택자 유형
const btn1 = document.querySelector("#btn1")   //document.getElementById("btn1");
const buttons =  document.querySelectorAll(".buttons")   //document.getElementsByClassName("buttons")

btn1.addEventListener("click",function (){
    console.log('test');
})
for(let i=0 ; i < buttons.length;i++) {
    buttons[i].addEventListener("click",function(){
        console.log('tests');
    })
}
