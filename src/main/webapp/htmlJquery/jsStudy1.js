//css 선택자 유형
const btn1 = document.querySelector("#btn1")   //document.getElementById("btn1");
const buttons = document.querySelectorAll(".buttons")   //document.getElementsByClassName("buttons")

const d1 = document.querySelector("#di > .button li")
//querySelector = querySelectorAll[0];

let ar = [1,2,3];

console.log('Old')
for(let i=0;i<ar.length;i++){
    console.log(ar[i]);
}

console.log('For of')
for(let a of ar){
    console.log(a);
}
console.log('For in');
for(let j in ar){
    console.log(j);
    console.log(ar[j]);
}

console.log('For each')
ar.forEach(function(v,i,list){
    console.log('v : ',v,'i : ',i,'list : ',list);
})


btn1.addEventListener("click",function (){
    console.log('test');
})
// for(let i=0 ; i < buttons.length;i++) {
//     buttons[i].addEventListener("click",function(){
//         console.log('tests');
//     })
// }

// alert(buttons);
// alert(ar);
console.log(buttons);
console.log(ar);

buttons.forEach(function(v,i){
    v.addEventListener('click',function(){
        console.log('click');
    })
})
console.log(parseInt('1')+1)
console.log('1'+1);

