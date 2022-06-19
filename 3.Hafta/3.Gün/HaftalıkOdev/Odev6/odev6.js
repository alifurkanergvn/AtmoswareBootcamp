//ÖDEV-6
//Login userEmail,userPassword kullanıcıdan aldığımız değeri db ile karşılaştıracak eğer doğru ise adminFunction'a gönderecek 4 kalan haktan aşağı doğru düşecek eğer kalan hak sayımız 0 olursa kullanıcı bloke olsun
// dbUserEmail="deneme@gmail.com"
// dbUserPassword="root"
var count = 4;
function tryEnterence() { 
    var userEmail = prompt("Lütfen email adresinizi giriniz.");
    var userPassword = prompt("Lütfen şifrenizi giriniz.");
    return database(userEmail,userPassword);
}
tryEnterence();
function database(UserEmail,UserPassword){
    var dbUserEmail ="deneme@gmail.com"
    var dbUserPassword= "root"
    if(dbUserEmail===UserEmail && dbUserPassword===UserPassword){
        return adminFunction();
    }else{
        while(count>0){
            --count;
            alert("Yanlış şifre veya email girdiniz kalan hakkınız "+count)
            if(count==0){
                alert("Bloke edildiniz")
                break;
            }   
            tryEnterence();  
        }   
    }   
}
function adminFunction() {
    document.write("Hoşgeldiniz...")
}