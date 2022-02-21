(function($){
	$.fn.highlightMenu = function(options){
		var defaults = $.extend({
			'bgColor' 		: '#32CD32', 								//defining the default background-color to lime-green
			'color' 		: '#C80000', 								//defining the default color of text to superman red
			'hoverBgColor' 	: '#C80000', 								//defining the default hover background-color 
			'hoverColor' 	: '#32CD32', 								//defining the default hover color 
			'linkWidth' 	: '140px',	 								//defining the width of navigation
		},options);
		
		return this.each(function(){
			var items = $(".attr");
			var o = defaults;
			
			items.css('font-family', 'Ribeye Marrow, cursive')	//setting the fonts
				 .css('font-weight','bold') 							//setting the font-weight
				 .css('text-decoration','none') 						//setting the text-decoration to none
				 .css('background-color',o.bgColor)						//setting the default background-color to lime-green
				 .css('color',o.color) 									//setting the default color of text to superman red
				 .css('width',o.linkWidth);								//setting the width of navigation
			
			//mouseover function			
			items.mouseover(function(){
				$(this).css('background-color',o.hoverBgColor)			//setting the background-color when mouse hovers over the navigation bar items
						.css('color',o.hoverColor) 						//setting the color when mouse hovers over the navigation bar items
				
			});
			
			//mouseout function
			items.mouseout(function(){
				$(this).css('background-color',o.bgColor)				//setting the background-color when mouse hovers out of the navigation bar items
						.css('color',o.color)							//setting the color when mouse hovers out of the navigation bar items
				
			});
				
		});
		
	}
})(jQuery);

//set options of highlighted menu plugins
$(document).ready(function() {
	$("#menu").highlightMenu({
		bgColor:'#093145', 												//overriding background-color
		color:'#1FAB89', 	//#cc1c0d											//overriding color
		//$(".logo").hoverBgColor :'#333',
		hoverBgColor:'#3C6478'
	});
});