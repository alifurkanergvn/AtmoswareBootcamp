
// ÖDEV(if-else for break continue)
// Fonksiyonlarla
// Örnek:1ile kullanıcının vereceği(prompt)bitiş sayısına göre
// kullanci:5verdi diyelim1<=X<=5
//1.adım:kaç tane sayı var?
//2.adım:sayı toplamları var?
//3.adım:kaç tane tek sayı var?
//4.adım:tek sayılar toplamı?
//5.adım:tek sayılar gösterelim?
//6.adım:kaç tane çift sayı var?
//7.adım:çift sayılar toplamı?
//8.adım:çift sayılar gösterelim?
// Eğer verilen sayılarda7sayısı varsa bunu eklemesin(continue)
// Eğer bitiş sayısı 100 fazla ise 100'e kadar olanlar toplansın(break)
// Eğer kullanıcı başlangıç sayıdan küçük girerse uyaralım başlangıçtan büyük girmesini isteyelim
// Eğer kullanıcı secret-key girerse yani 44 sayısını girerse program çalışmayı direk durdursun

inputNumber=Number(prompt("Lütfen bir sayı giriniz"));
document.writeln("Girilen sayı: "+inputNumber+"<br/>");

 //1.adım:kaç tane sayı var?
 function countNumber(inputNumber) { 
   
    for (let i =1;  i<=inputNumber; i++) {
        if(inputNumber==44 ){ break;}
        var c=i;
    }
    return document.writeln("Toplam sayı adedi: "+c+"<br/>");
 }
 var sayılanSayı=countNumber(inputNumber);


 //2.adım:sayı toplamları var?
 function sumNumbers(inputNumber) { 
    var c=0;
    for (let i =1;  i<=inputNumber; i++) {
        if(inputNumber==44 ){ break;} 
        c=c+i;
    }
    return document.writeln("Sayı toplamları: "+c+"<br/>");
 }
 var sayıToplam=sumNumbers(inputNumber);

 //3.adım:kaç tane tek sayı var?
 function countOddNumbers(inputNumber) { 
    var c=0;
    for (var i =1;  i<=inputNumber; i++) {
        if(inputNumber==44 ){ break;} 
        else if(i%2!=0){
             c+=1;
         }
    }
    return document.writeln("<br/>Tek sayi adeti: "+c+"<br/>");
 }
 var tekSayiAdet=countOddNumbers(inputNumber);

 
 //4.adım:tek sayılar toplamı?
 function sumOddNumbers(inputNumber) { 
    var c=0;
    for (var i =1;  i<=inputNumber; i++) {
        if(inputNumber==44 ){ break;} 
        else if(i%2!=0){
             c+=i;
         }
    }
    return document.writeln("Tek sayi toplamları: "+c+"<br/>");
 }
 var tekSayiToplamı=sumOddNumbers(inputNumber);
 
 //5.adım:tek sayılar gösterelim?
 function showOddNumbers(inputNumber) { 
    var tut="";
    for (var i =1;  i<=inputNumber; i++) {
        if(inputNumber==44 ){ break;}
        else if (i == 7) { continue; } 
        else if(i>=100 ){ break;} 
        else if(i%2!=0){
             tut=tut+i+"-";
         }
    }
    return document.writeln("Tek sayilar: "+tut+"<br/>");
 }
 var tekSayilar=showOddNumbers(inputNumber);

 //6.adım:kaç tane çift sayı var?
 function countEvenNumbers(inputNumber) { 
    var c=0;
    for (var i =1;  i<=inputNumber; i++) {
        if(inputNumber==44 ){ break;} 
        else if(i%2==0){
             c+=1;
         }
    }
    return document.writeln("<br/>Çift sayi adeti: "+c+"<br/>");
 }
 var ciftSayiAdet=countEvenNumbers(inputNumber);

 //7.adım:çift sayılar toplamı?
 function sumEvenNumbers(inputNumber) { 
    var c=0;
    for (var i =1;  i<=inputNumber; i++) {
        if(inputNumber==44 ){ break;}
        else if(i%2==0){
             c+=i;
         }
    }
    return document.writeln("Çift sayi toplamları: "+c+"<br/>");
 }
 var ciftSayiToplamı=sumEvenNumbers(inputNumber);

 //8.adım:çift sayılar gösterelim?
 // Eğer bitiş sayısı 100 fazla ise 100'e kadar olanlar toplansın(break)
 // Eğer verilen sayılarda7sayısı varsa bunu eklemesin(continue)
 // Eğer kullanıcı secret-key girerse yani 44 sayısını girerse program çalışmayı direk durdursun
 function showEvenNumbers(inputNumber) { 
    var tut="";
    
    for (var i =1;  i<=inputNumber; i++) {
        
        if(inputNumber==44 ){ break;}
        else if (i == 7) { continue; } 
        else if(i>=100 ){ break;} 
        else if(i%2==0){
             tut=tut+i+"-";
        }
    }
    return document.writeln("Çift sayilar: "+tut+"<br/>");
 }
 var tekSayilar=showEvenNumbers(inputNumber);

 // Eğer kullanıcı başlangıç sayıdan küçük girerse uyaralım başlangıçtan büyük girmesini isteyelim
 if (inputNumber<1) {
    alert("Lütfen 1 den büyük bir sayı giriniz."); 
 }





