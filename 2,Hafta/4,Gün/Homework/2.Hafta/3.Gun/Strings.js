//ÖDEV
// kullanıcı tarafından girilen bir kelimenin
word1=String(prompt("Kelimeyi Giriniz"));
document.write("Girilen kelime: "+word1+"<br/>");

//S-1) Kaç karakterlidir ?
document.write("Karakter Sayısı: "+word1.length+"<br/>");

//S-2) boşluklar alınarak Kaç karakterlidir ?
document.write("Boşluksuz Sayısı: "+word1.trim().length+"<br/>");

//S-3) bütün kelimeyi küçük harfle göstermek ?
document.write("Küçük harfli gösterim: "+word1.toLowerCase()+"<br/>");

//S-4) bütün kelimeyi büyük harfle göstermek ?
document.write("Büyük harfli gösterim: "+word1.toUpperCase()+"<br/>");

//S-5) ilk harf nedir  ?
document.write("İlk harf: "+word1.substring(0,1)+"<br/>");

//S-6) girdiğiniz kelime java ile başlıyor mu  ?
document.write("java ile başlıyor mu: "+word1.startsWith('java')+"<br/>");

//S-7) girdiğiniz kelimenin sonuna "-ben js öğreniyorum"   ?
document.write("java ile başlıyor mu: "+word1.concat(' ben js öğreniyorum')+"<br/>");

//S-8) girdiğiniz 0 ile 4 arasındaki indexi ekranda gösterin   ?
document.write("0 ile 4 arasındaki index: "+word1.substring(0,4)+"<br/>");

//S-9) Kullanıcıdan alınan başka bir kelimeyle birinci olan kelimeyle yer değiştirmek ?
var changeWord="HelloWorld";
document.write("Kelimeleri değiş: "+word1.replace(word1,changeWord)+"<br/>");
