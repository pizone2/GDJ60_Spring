const checkAll = document.getElementById("checkAll");
const agrees = document.getElementsByClassName("agrees");
const btn = document.getElementById("btn");



checkAll.addEventListener("click",function() {
    for(let i=0;i<agrees.length;i++){
        agrees[i].checked = checkAll.checked
    }
});

for(let i=0;i<agrees.length;i++){
    let result=true;
    agrees[i].addEventListener("click",function(){
        for(let j=0;j<agrees.length;j++){
            if(!agrees[j].checked){
                // result = agrees[j].checked;
                // result = false;
                result = !result;


                break;
            }
        }

        checkAll.checked = result;
    });

    btn.addEventListener("click",function() {
        if(checkAll.checked) {
            // alert('모두 동의함');
            location.href = "./memberJoin"
        }else {
            alert('모든 약관에 동의 해야 합니다');
        }
    })
}





