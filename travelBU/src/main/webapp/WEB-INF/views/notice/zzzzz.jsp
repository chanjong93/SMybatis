<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>


<script>         
var arrNumberWord = new Array("","일","이","삼","사","오","육","칠","팔","구");
var arrDigitWord = new  Array("","십","백","천");
var arrManWord = new  Array("","만","억", "조");
function fn_change_hangul_money(txt_id)
{
	var num_value = txt_id.value;
	var num_length = num_value.length;
    if(isNaN(num_value) == true)
	                  return;            
	var han_value = "";  
	var man_count = 0;
	for(i=0; i < num_value.length; i++)
    {
	var strTextWord = arrNumberWord[num_value.charAt(i)];
    if(strTextWord != "")
	{
    man_count++;     
    strTextWord += arrDigitWord[(num_length - (i+1)) % 4];   }
    if(man_count != 0 && (num_length - (i+1)) % 4 == 0)                  {   
	                       man_count = 0;   
	                       strTextWord = strTextWord + arrManWord[(num_length - (i+1)) / 4];  
	                  }       
	             han_value += strTextWord;            }   
	           if(num_value != 0)                  han_value = "금 " + han_value + " 원";    
	          document.all.han_money.innerText = han_value;      }</script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<span class="han_money" id="han_money">금액표시</span>
<br>
<input type="text" id="txt_money" onkeyup="fn_change_hangul_money(this);">
</body>
</html>

