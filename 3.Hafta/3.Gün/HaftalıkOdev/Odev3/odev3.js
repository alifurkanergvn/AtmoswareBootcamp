//ÖDEV-3 verilen bir sayının negatif mi pozitif mi olduğunu bulan algoritma ?

var input = String(prompt("Lütfen bir sayı giriniz"));

if(input>=0){
    document.write(+input+" pozitifdir.");
}else{
    document.write(+input+" negatifdir.");
}