const id = document.getElementById("id");
const pw = document.getElementById("pw");
const memberName = document.getElementById("memberName");
const memberPhone = document.getElementById("memberPhone");
const email = document.getElementById("email");
const pwCheck = document.getElementById("pwCheck");
const idError = document.getElementById("idError");
const pwError = document.getElementById("pwError");
const pwCheckError = document.getElementById("pwCheckError");
const frm = document.getElementById("frm");
const btn= document.getElementById("btn");
const error = [];

// let checks = [false,false,false,flase]
let idCheck=false;
let pwLengthCheck=false;
let pwNull=false;
let pwEqualCheck=false;



//password Equl 검증
pwCheck.addEventListener("blur",function() {
    if( pwCheck.value == pw.value){
        pwCheckError.innerHTML= "동일한 PW"
        pwEqualCheck=true;
        //checks[0]=true;
        error[0]=0
    }else{
        pwCheckError.innerHTML= "PW가 틀립니다."
    }
})
//password Length 검증 
pw.addEventListener("keyup",function() {
    if(pw.value.length < 6 || pw.value.length >12) {
        pwError.innerHTML="비밀번호는 6~12자리로 입력해주세요"
        pwLengthCheck=false;
        //checks[1]=false;
    }else{
        pwError.innerHTML=""
        pwLengthCheck=true;
        //checks[1]=true;
    }
})
//password Null 검증
pw.addEventListener("blur",function() {
    if(!pw.value) {
        pwError.innerHTML="PW는 필수입니다."
    }else{
        pwError.innerHTML=""
        pwNull=ture;
        //checks[2]=true;
    }
})
//password Change 검증
pw.addEventListener("change",function() {
    // check[2]=false;
    pwLengthCheck = false;
    pwCheck.value='';
    pwLengthCheck.value ='';
})

id.addEventListener("blur",function() {
    console.log("test");
    if(!id.value) {
        idError.innerHTML="아이디를 입력해주세요!"
        console.log("아이디를 입력해주세요!!");
        alert("아이디를 입력해주세요!!!!!!!");
        idCheck=false;
        idError.classList.add("redResult")
        idError.classList.remove("blueResult")
    }else {
        idError.innerHTML="정상적인 ID"
        idCheck=true;
        //checks[3]=true;
        error[1]=1
        idError.classList.add("blueResult")
        idError.classList.remove("redResult")
    }
})
memberName.addEventListener("blur",function() {
    console.log("test");
    if(!memberName.value) {
        nameError.innerHTML="아이디를 입력해주세요!"
    }else {
        nameError.innerHTML=""
        error[2]=2
    }
})
memberPhone.addEventListener("blur",function() {
    console.log("test");
    if(!memberPhone.value) {
        phoneError.innerHTML="아이디를 입력해주세요!"
    }else {
        phoneError.innerHTML=""
        error[3]=3
    }
})
email.addEventListener("blur",function() {
    console.log("test");
    if(!email.value) {
        emailError.innerHTML="아이디를 입력해주세요!"
    }else {
        emailError.innerHTML=""
        error[4]=4
    }
})
//form 전송
// btn.addEventListener("click",function() {
//     let tt = 1;
//     console.log("test");
//     for(let i=0; i<error.length; i++) {
//         if(!error[i].value){
//             console.log(error[i]);
//             tt = 0;
//             break;
//         }               
//     }
//     if(tt==0){
//         alert("실패");
//     }else{
//         frm.submit();
//     }
// })
btn.addEventListener( "click",function() {
    //if(checks.includes(false))
    if(idCheck && pwCheck && pwEqualCheck && pwLenghCheck){
        // frm.submit();
        alert('회원가입성공');
    }else{
        alert("필수 사항을 입력하세요")
    }
})