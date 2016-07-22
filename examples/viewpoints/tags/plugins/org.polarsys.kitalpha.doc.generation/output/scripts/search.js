//******************************************
//******************************************
function search(text)
{
	open("search.html?text=" + text, "_self");
}

//******************************************
//******************************************
function gup( name )
{
	name = name.replace(/[\[]/,"\\\[").replace(/[\]]/,"\\\]");
	var regexS = "[\\?&]"+name+"=([^&#]*)";
	var regex = new RegExp( regexS );
	var results = regex.exec( window.location.href );
	if( results == null )
		return "";
	else
		return results[1];
}

//******************************************
//******************************************
function submitenter(field, e)
{
	var keycode;
	if (window.event) keycode = window.event.keyCode;
	else if (e) keycode = e.which;
	else { 
				
		return true;
	}
	if (keycode == 13)
    {
	   field.form.submit();
	   return false;
    }
	else
	{
	   	return true;
	}
}