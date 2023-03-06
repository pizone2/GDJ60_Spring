const replyAdd = document.getElementById('replyAdd');
const replyContents =document.getElementById('replyContents');
const commentListResult = document.getElementById('commentListResult');
// const pageLink = document.querySelectorAll(".page-Link");


replyAdd.addEventListener("click", function(){

    let xhttp = new XMLHttpRequest();

    xhttp.open("POST", "../bankBookComment/add");

    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    xhttp.send("contents="+replyContents.value+"&bookNumber="+replyAdd.getAttribute('data-book-booknumber'));

    xhttp.addEventListener('readystatechange', function(){
        if(this.readyState==4&&this.status==200){
            if(this.responseText.trim()==1){
                alert('댓글이 등록 되었습니다')
                replyContents.value="";
                getList(1);
            }else {
                alert('댓글 등록에 실패 했습니다')
            }

        }
    })

})



getList(2);
//page 매개변수 선언 (앞에 let 붙이지 않음 )
function getList(page){
    let xhttp = new XMLHttpRequest();

    let count = 0;

    xhttp.open("GET","/bankBookComment/list?bookNumber="+replyAdd.getAttribute('data-book-booknumber')+"&page="+page);

    xhttp.send();

    xhttp.addEventListener('readystatechange',function(){
        if(this.readyState == 4 && this.status == 200){
            commentListResult.innerHTML = this.responseText.trim();
            count++
        }
    })
    // 0이 출력 : 비동기 방식이기 때문
    console.log("count :"+count);
}


//안 찍힘 
// pageLink.forEach(function(p){
// console.log("p : ",p);
// });

//page
commentListResult.addEventListener("click",function(e){
    let pageLink = e.target;
    if(pageLink.classList.contains("page-link")){
        let page = pageLink.getAttribute("data-board-page")
        getList(page);

    }
    e.preventDefault();

})

//delete
commentListResult.addEventListener("click",function(e){
    let del = e.target;
    if(del.classList.contains("del")){
        let xhttp = new XMLHttpRequest();
        xhttp.open("POST","../bankBookComment/delete") 
        xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xhttp.send("num="+del.getAttribute("data-comment-num"));
        xhttp.addEventListener("readystatechange",function(){
            if(this.readyState==4&&this.stats==200){
                let result = this.responseText.trim();
                if(result > 0){
                    alert("댓글이 삭제되었습니다");
                    getList();
                }else{
                    alert("삭제실패")
                }
            }
        })
        console.log('delete');

    }
    e.preventDefault();

})

//update
commentListResult.addEventListener("click",function(e){
    let updateButton = e.target;
    if(updateButton.classList.contains("update")){
        
        //console.log(updateButton.parentNode.);
        let num = updateButton.getAttribute("data-comment-num");
        let contents = document.getElementById("contents"+num)
        //console.log(contents);
       // contents.innerHTML='<textarea>'+contents.innerHTML+'</textarea>'
     // document.querySelector("#contents"+num).firstChild.removeAttribute("readonly")
      contents.firstChild.removeAttribute("readonly")
      let btn = document.createElement("button");
      let attr = document.createAttribute("class");
      attr.value="btn btn-primary"
      btn.setAttributeNode(attr);
      contents.appendChild(btn);

      attr = document.createTextNode("수정확인")
        btn.appendChild(attr)


        btn.addEventListener("click",function(){
            console.log(contents.firstChild.value);
            console.log(num)

            let xhttp = new XMLHttpRequest();
            xhttp.open("POST","")
        })
    }
    e.preventDefault();

})

function updateContents(){
    console.log('update',"../bankBookComment/update");
    xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhttp.send("num="+num+"&contents="+contents.firstChild.value);
    xhttp.addEventListener("readystatechange",function(){
        if(this.readyState==4&&this.stats==200){
            let result = this.responseText.trim();
            if(result > 0){
                alert("수정성공");
                getList();
            }else{
                alert("수정실패")
            }
        }
    })

}




        
  


