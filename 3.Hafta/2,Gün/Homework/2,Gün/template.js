function showDate(){
    var tarih = new Date();
    var gun= tarih.getDay()+5;
    var ay=tarih.getMonth()+1;
    var yil=tarih.getFullYear();
    document.getElementById("getDate").innerText="Tarih:"+gun+"/"+ay+"/"+yil;
}




