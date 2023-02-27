//BoardFrom.js
const del = document.getElementById("delete");
const frm = document.getElementById("frm");

del.addEventListener("click",function() {
    let check= window.confirm("정말 삭제 하시겠습니까?")
    if(check) {   
    frm.setAttribute("action","./delete")
    frm.setAttribute("method", "post");
    frm.submit();
    }
})
