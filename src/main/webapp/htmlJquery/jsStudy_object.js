let car = {
    brand:'AUDI',
    price:3000,
    info:function(){
        console.log(this.brand,this.price);
    }
}

//class 선언
class Student{
    #n = '';
    #kor;
    
    setn(n){
        this.#n=n;
    }
    get n(){
        return this.#n;
    }
    setn(kor){
        this.#kor=kor;
    }
    get kor(){
        return this.#kor;
    }




    info(){
        console.log(this.n,this.kor);
    }
}

const btn1 = document.getElementById('btn1');

btn1.addEventListener('click',function(){
    // console.log(car.brand);
    // car.info();

    // console.log('For in')
    // for(let v in car){
    //     console.log(v);
    // }

    let s = new Student();
    s.n='iu'
    s.kor = 200
    s.eng= 100
    s.info();  
    console.log(s.eng)
    console.log(s.n,s.kor)

   
})