function createCookie(name, value) {
	var date = new Date();
	date.setTime(date.getTime()+(365*24*60*60*1000));
	
	var expires = "; expires="+date.toGMTString();
  
	document.cookie = name+"="+value+expires+"; path=/";
}

function readCookie(name) {
	var nameEQ = name + "=";
	var ca = document.cookie.split(';');
	for(var i=0;i < ca.length;i++) {
		var c = ca[i];
		while (c.charAt(0)==' ') c = c.substring(1,c.length);
		if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length,c.length);
	}
  
  return null;
}

function getElementsByClass(className) {
	var all = document.all ? document.all : document.getElementsByTagName('*');
	var elements = new Array();
	
	for (var e = 0; e < all.length; e++)
		// fix to support multiple class
		//if (all[e].className == className)
		if(all[e].className.search(className) > -1)
			elements[elements.length] = all[e];
			
	return elements;
}

function saveFeature(id, cookie, feature){
	if (document.getElementById(id).checked) {
		createCookie(cookie, 'true');
		displayFeature(true, feature);
	} else {
		createCookie(cookie, 'false');
		displayFeature(false, feature);
	}
}


function saveShowContainmentFeatures(){
	saveFeature('containmentFeatures', 'EglDoc.Controls.ShowContainmentFeatures', 'containmentFeatures');
}

function saveShowDervied(){
	saveFeature('derived', 'EglDoc.Controls.ShowDerivedFeatures', 'derivedFeature');
}

function saveShowInheritanceDiagram(){
	saveFeature('inheritanceDiagram', 'EglDoc.Controls.ShowInheritanceDiagram', 'inheritanceDiagram');
}

function saveShowContainmentDiagram(){
	saveFeature('containmentDiagram', 'EglDoc.Controls.ShowContainmentDiagram', 'containmentDiagram');
}

function saveShowReferenceDiagram(){
	saveFeature('referenceDiagram', 'EglDoc.Controls.ShowReferenceDiagram', 'referenceDiagram');
}

function saveShowFocusDiagram(){
	saveFeature('focusDiagram', 'EglDoc.Controls.ShowFocusDiagram', 'focusDiagram');
}
function saveShowExtensibilityDiagram(){
	saveFeature('extensibilityDiagram', 'EglDoc.Controls.ShowExtensibilityDiagram', 'extensibilityDiagram');
}
function saveShowInherited() {
	if (document.getElementById('inherited').checked) {
		createCookie('EglDoc.Controls.ShowInheritedFeatures', 'true');
		displayInherited(true);
	} else {
		createCookie('EglDoc.Controls.ShowInheritedFeatures', 'false');
		displayInherited(false);
	}
}

function setupControls() {
	var showInherited = readCookie('EglDoc.Controls.ShowInheritedFeatures');
	
	if (showInherited) {
		if (showInherited == 'true') {
			document.getElementById('inherited').checked = 'true';			
		}
	}
	if (showInherited != 'true') {
		document.getElementById('inherited').checked = '';
		displayInherited(false);
	}
	setupFeature( 'EglDoc.Controls.ShowContainmentFeatures', 'containmentFeatures', 'containmentFeatures');
	setupFeature( 'EglDoc.Controls.ShowDerivedFeatures', 'derived', 'derivedFeature');
	setupFeature( 'EglDoc.Controls.ShowInheritanceDiagram', 'inheritanceDiagram', 'inheritanceDiagram');
	setupFeature( 'EglDoc.Controls.ShowContainmentDiagram', 'containmentDiagram', 'containmentDiagram');
	setupFeature( 'EglDoc.Controls.ShowFocusDiagram', 'focusDiagram', 'focusDiagram');
	setupFeature( 'EglDoc.Controls.ShowReferenceDiagram', 'referenceDiagram', 'referenceDiagram');
	setupFeature( 'EglDoc.Controls.ShowExtensibilityDiagram', 'extensibilityDiagram', 'extensibilityDiagram');
}

function setupFeature(cookie, id, feature){
	var showDervied = readCookie(cookie);	
	if (showDervied && showDervied == 'true') {
		document.getElementById( id).checked = 'true';		
	}	
	if (showDervied != 'true') {
		document.getElementById( id).checked = '';
		displayFeature(false, feature);
	}	
}

function displayInherited(show) {
	var displayValue = show ? '' : 'none';

	var inheritedFeatures = getElementsByClass('inheritedFeature');
	
	for (var index = 0; index < inheritedFeatures.length; index++) {
		inheritedFeatures[index].style.display = displayValue;
	}
}

function displayFeature(show, feature) {
	var displayValue = show ? '' : 'none';

	var features = getElementsByClass(feature);
	
	for (var index = 0; index < features.length; index++) {
		features[index].style.display = displayValue;
	}
}

