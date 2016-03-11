var empName=document.registration.empName;
var emailId=document.registration.emailID;
var phone=document.registration.phoneNo;
function formValidation()
{
if(empName_valid(empName,6,20)){
	if(email_valid(emailId)){
		if(phone_valid(phoneNo))
		{
		return true;	
	}
	
	}
	}
	return false;
}

function empName_valid(empName,min,max){
	var name_len = empName.value.length;
	if(name_len==0||name_len>=max||name_len<min){
		alert("Name should not be empty/length should be between "+min+" to "+max);
		empName.focus();
		return false;
	}
	return true;
}
function email_valid(emailId){
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if(emailId.value.match(mailformat))
	{
	return true;
	}
	else
	{
	alert("You have entered an invalid email address!");
	emailId.focus();
	return false;
	}
}
function phone_valid(phone){
	var phoneNo=/^\(\d{3}\) ?\d{3}( |-)?\d{4}|^\d{3}( |-)?\d{3}( |-)?\d{4}/;
	if(phone.value.match(phoneNo))
	{
	return true;
	}
	else
	{
	alert("You have entered an invalid phone number!Egs 9541258515");
	return false;
	}
}