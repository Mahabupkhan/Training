function getData()
{
    var1=document.getElementById("num1").value;
    var2=document.getElementById("num2").value;
    localStorage.setItem("num1",document.getElementById("num1").value);
    localStorage.setItem("num2",document.getElementById("num2").value);
}
function getData2()
{
    var num1=parseInt(localStorage.getItem("num1"));
    var num2=parseInt(localStorage.getItem("num2"));
    var num3=parseInt(document.getElementById("num3").value);
    document.write(num1+num2+num3);
}