//Kullanıcıdan aldığımız verinin ilk harfi ve son harfi görünsün geriye kalan karakter kadar * (yıldız) olsun ==> Alınan örneğin Hamit  ==>  H***t
//Yardımcı oalcak metotlar v.s                                                                          function
//string ==> replace,sub,String,charAt()

//First Way
var input=String( prompt("Lütfen bir kelime giriniz"));
var array=[];
for (let i = 0; i < input.length; i++) {
    array[i]=input.substring(i,i+1);
}

for(let i=1; i<input.length-1; i++){
    array[i]="*";
}
document.write(array.join('').toString());

document.write("<br>"+"~~~~~~~~~~~~~~~~~~~~~~~~~~"+"<br>")
//Second Way
var firstWord=input.charAt(0,1);
var middleSide="";
for (let i = 1;  i< input.length-1; i++) {
    middleSide+="*";
}
var lastWord=input.charAt(input.length-1);
document.write(firstWord+middleSide+lastWord);

