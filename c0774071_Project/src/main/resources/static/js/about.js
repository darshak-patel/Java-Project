
$(document).ready(function() {
	
	$(".minus").hide();
	$("#about h2").click(function(evt) {
		$(this).toggleClass("minus");
		if ($(this).attr("class") == "minus") {
		   	$(this).next().slideDown(1000, "easeOutBounce");
	   	}
	   	else {
	        $(this).next().slideUp(1000, "easeInBounce");
	   	}
	   	evt.preventDefault();
    }); // end click
}); // end ready


