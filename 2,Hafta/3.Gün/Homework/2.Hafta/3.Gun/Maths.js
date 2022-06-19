// Kullanıcı tarafından aldığımız 2 tane sayının
// s1-) Bu sayılardan en büyüğü nedir ?
number1=Number(prompt("1. sayıyı giriniz"));
number2=Number(prompt("2. sayıyı giriniz"));

document.write("En büyüğü:"+Math.max(number1,number2)+"</br>");

// s2-) Bu sayılardan en küçüğü nedir ?
document.write("En küçüğü:"+Math.min(number1,number2)+"</br>");

//s3-) Bu sayılardan en küçüğünün karekökü nedir ?
document.write("En küçüğünün karekökü:"+Math.sqrt(Math.min(number1,number2))+"</br>");

//s4-) Bu sayılardan en küçüğünün karekökünün üste yuvarlıyalım nedir ?
document.write("En küçüğünün karekökünün üste yuvarlanması:"+Math.ceil(Math.sqrt(Math.min(number1,number2)))+"</br>");

//s5-) Bu sayılardan en büyüğünün mutlak nedir ?
document.write("En büyüğü:"+Math.abs(Math.max(number1,number2))+"</br>");

// s6-) Bu sayılardan en büyüğü alt taban, en küçüğü üst taban şeklinde üstünü alalım
document.write("En büyüğü:"+Math.pow(Math.abs(Math.max(number1,number2)),Math.abs(Math.min(number1,number2)))+"</br>");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

