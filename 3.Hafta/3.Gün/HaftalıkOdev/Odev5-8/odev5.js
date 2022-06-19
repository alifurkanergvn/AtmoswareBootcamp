//ÖDEV-5
//Zamanın dinamik olarak alıp hangi gün olduğunu gösteren arrow function algoritmasını yazalım switch-case   new Date().getDay() 0=pazar 1=pazartesi

 showDay = () =>{
    let day;
    switch (new Date().getDay()) {
    case 0:
        day = "Sunday";
        break;

    case 1:
        day = "Monday";
        break;

    case 2:
        day = "Tuesday";
        break;
    
    case 3:
        day = "Wednesday";
        break;
    
    case 4:
        day = "Thurday";
        break;

    case 5:
        day = "Friday";
        break;

    case 6:
        day = "Saturday";
        
    }
    document.write("Today is "+day)
}

showDay();


