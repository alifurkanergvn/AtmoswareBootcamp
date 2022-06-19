//ÖDEV-9
//Sayı bulma oyunu: 1-10 arasında rastgele sayılar olsun bizde tahmin etmeye çalışalım bizim tahmin sayımız 5 olsun eğer biz sayıdan büyükse büyük tahmin eğer sayıdan küçükse küçük tahmin. ve sonunda eğer bulursak kaçıncı tahminde bulduğumuz bize söylesin ?

var randomNumber = Math.floor(Math.random()*10+1);
var count=1;
function makeGuess(){
   var input = Number(prompt("LÜtfen 1 ile 10 arasında sayı giriniz")) 
    return guessGame(input);
}
function guessGame(input) {  
    if(input>randomNumber){
        alert("Büyük tahminde bulundun");
        count++;
        makeGuess();
    }else if(input<randomNumber){
        alert("Küçük tahminde bulundun")
        count++;
        makeGuess()
    }else if(input===randomNumber){
        document.write("Tebrikler sayıyı buldun. Deneme sayınız "+count) 
    }
    else if(input==null){
        return("Boş değer girilmez");
    } 
}  
makeGuess();