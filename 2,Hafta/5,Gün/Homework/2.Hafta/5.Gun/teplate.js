
function firstStep(){
    var id=prompt("Please enter your id");
    var password=prompt("Please enter your passworld");
    var password2=prompt("Please enter your password again");

    if (password===password2) {
        document.write("Login success welcome: "+id);
    }else{
        alert("Your passwords does not match, Please enter again");
        firstStep();
    }
}
firstStep();
