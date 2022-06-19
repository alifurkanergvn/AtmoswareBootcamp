//ÖDEV-2
//Kullanıcı tarafından alınan dereceyi  Fahrenhayta çeviren algoritma yapalım.
//Formül:(x*9/5)+32

var celcius = String(prompt("Lütfen hava derecesini giriniz"));
var fahrenhayt= (celcius*9/5)+32;
document.write("Hava "+fahrenhayt+" Fahrenhayt");
