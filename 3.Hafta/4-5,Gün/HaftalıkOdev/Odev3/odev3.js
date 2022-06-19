//ÖDEV-3 verilen bir sayının negatif mi pozitif mi olduğunu bulan algoritma ?

var input = Number(prompt("Lütfen bir sayı giriniz"));

if(input>0){
    document.write(+input+" pozitifdir.");
}else if(input<0){
    document.write(+input+" negatifdir.");
}else if(input==0){
    document.write(+input+" 0 nötür bir sayıdır");
}else{
    document.write("Lütfen geçerli bir sayı giriniz");
}