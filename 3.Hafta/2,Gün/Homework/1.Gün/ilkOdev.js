//ÖDEV: Math.round(Math.random()*10+1))
// bilgisayar tarafında rastgele  sayılar 1-10 arasında rastgele olsun oluştursun ve bitiş değeri 1<=X<=kullanıcı tarafından bitiş sayısına göre sayılar oluşturulsun 
// bu sayıları bir diziye atama yapalım
// bu sayılardan ilk eleman  ===> dizi[0]
// bu sayılardan son eleman ===> dizi[dizi.length-1]
// bu sayıların küçükten büyüğe sıralama ===> dizi.sort()
// bu sayıların büyükten küçüğe sıralama ===> dizi.sort().reverse()
// bu sayıların toplamları  ===> sum=0  sum+=i;
// bu sayıların çift sayı toplamları  ===> if(dizi[i]%2==0)
// bu sayıların tek sayı toplamları  ===> if(dizi[i]%2==1)
// bu sayıların her birine 1 ekleyerek yeni bir dizi oluşturalım ==> iterative for ile her bir eleman erişmek ve 1 eklemek bunun dinamik kısmını ES kısmında göreceğiz.

var input =Number(prompt("Dizi boyutunu giriniz")) ;
function randomNumberArray(){
    var array=[];
    for (let i = 0; i < input; i++) {
         array [i]= Math.floor(Math.random()*10+1);
    }
    console.log("Tüm dizi elemanları: "+array);
    console.log("İlk dizi elemanı: "+array[0]);
    console.log("Son dizi elemanı: "+array[array.length-1]);
    console.log("Dizi elemanlarını küçükten büyüğe sıralama: "+array.sort(function(a,b){return a-b}));
    console.log("Dizi elemanlarını büyükten küçüğe sıralama: "+array.sort(function(a,b){return b-a}));
    var sum =0;
    for ( temp of array) {
        sum+=temp
    }
    console.log("Tüm elemanların toplamı: "+sum)
    var evenSum=0;
    var oddSum=0;
    for (temp of array) {
        if(temp%2 == 0){
            evenSum+=temp;
        }else{
            oddSum+=temp;
        }
    }
    console.log("Tüm çift elemanların toplamı: "+evenSum)
    console.log("Tüm tek elemanların toplamı: "+oddSum)
    var newArray=[];
    for (let i=0; i<array.length; i++) {
        newArray[i]=array[i]+1;
    }
    console.log("Yeni array: "+newArray)
}
randomNumberArray()