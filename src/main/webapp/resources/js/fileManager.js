const fileList = document.getElementById("fileList");
const add = document.getElementById("add");


let count = 0;
let max = 1;
let param = 'pic';

function setParam(p){
    param=p;
}

function setMax(m){
    max=m;
}


add.addEventListener('click',function() {
    
    //div
    let d = document.createElement('div');// 부모 Div
    let divs = document.createAttribute("id");
    divs.value="test"
    let dClass = document.createAttribute("class");
    dClass.value="mb-3"
    //label    
    let l = document.createElement('label');//lael
    let t = document.createTextNode('Image');
    let lFor = document.createAttribute("for");
    lFor.value="files"
    let lClass = document.createAttribute("class");
    lClass.value="form-label"
    //input
    let i = document.createElement('input');//input
    let iType = document.createAttribute("Type");
    iType.value="file"
    let iClass = document.createAttribute("class");
    iClass.value="form-control"
    let iId = document.createAttribute("id");
    iId.value="files"
    let iName = document.createAttribute("name");
    iName.value=param//파라미터 값 확인
    //button
    let btn = document.createElement('button');
    let btnType = document.createAttribute("Type");
    let btnId = document.createAttribute("id");
    btnId.value = "btnDel"
    btnType.value="button"
    let btnText = document.createTextNode("X");

    

    //Element 들을 조합
    d.appendChild(l);
    d.appendChild(i);
    d.appendChild(btn);
    l.appendChild(t);
    btn.appendChild(btnText)
    //Attribue 조합
    d.setAttributeNode(dClass);
    d.setAttributeNode(divs);
    l.setAttributeNode(lFor);
    l.setAttributeNode(lClass);
    i.setAttributeNode(iType);
    i.setAttributeNode(iClass);
    i.setAttributeNode(iId);
    i.setAttributeNode(iName);
    btn.setAttributeNode(btnType);
    btn.setAttributeNode(btnId);
    //

    if(count < max) {
        fileList.prepend(d);
        count++
    }else{
        alert("이미지는 "+max+"개만 첨부가능합니다.");
    }
    // fileList.prepend(d);
    const btnDel = document.getElementById("btnDel");
    btnDel.addEventListener('click',function() {
        console.log('test');
        parentNode.remove();
    })
})